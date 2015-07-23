package p.clims.auth;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

public class FormAuthenticator implements ClientRequestFilter {

private ArrayList<Object> cookies;

public FormAuthenticator(String baseUri, String username, String password) {

cookies = new ArrayList<>();

Client client = ClientBuilder.newClient();

WebTarget baseTarget = client.target(baseUri);

Form form = new Form();
form.param("j_username", username);
form.param("j_password", password);
Response response = baseTarget.path("j_security_check")
.request("application/x-www-form-urlencoded")
.post(Entity.form(form));

Map<String, NewCookie> cr = response.getCookies();

for (NewCookie cookie : cr.values()) {
cookies.add(cookie.toCookie());
}
}

public void filter(ClientRequestContext requestContext) throws IOException {
if (cookies != null) {
requestContext.getHeaders().put("Cookie", cookies);
}
}
}