package p.clims.auth;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.commons.codec.binary.Base64;

public class BasicAuthenticator implements ClientRequestFilter {

  private final String user;
  private final String password;

  public BasicAuthenticator(String user, String password) {
    this.user = user;
    this.password = password;
  }

  @Override
  public void filter(ClientRequestContext requestContext) throws IOException {
    MultivaluedMap<String, Object> headers = requestContext.getHeaders();
    final String basicAuthentication = getBasicAuthentication();
    headers.add("Authorization", basicAuthentication);
    // connection.setRequestProperty("Authorization", basicAuthentication);
  }

  private String getBasicAuthentication() {
    String token = this.user + ":" + this.password;
    String encoded = null;
    // connection.setRequestProperty("Authorization", "Basic " + encoded);

    try {
      encoded = "Basic " + new Base64().encodeToString((this.user + ":" + this.password).getBytes("UTF-8"));
      // encoded = "BASIC " + DatatypeConverter.printBase64Binary(token.getBytes("UTF-8"));
    } catch (UnsupportedEncodingException ex) {
      throw new IllegalStateException("Cannot encode with UTF-8", ex);
    }
    return encoded;
  }
}
