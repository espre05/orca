package p.clims.service;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Component;

import com.genologics.ri.project.Project;
import com.genologics.ri.researcher.Researcher;
import com.genologics.ri.sample.Sample;

/**
 * @author pnatar
 *
 *         Declare the interface methods required for interaction with clarity here.
 */
@Path("/api/v2/")
@Produces("application/xml")
@Consumes("application/xml")
@Component
public interface ClarityService {

  @GET
  @Path("/projects")
  public List<Project> getProjects();

  @GET
  @Path("/projects/{projId}")
  public Project getProjectById(@PathParam("projId") String projId);

  @POST
  @Path("/projects")
  @Consumes("application/xml")
  public Project createProject(JAXBElement<Project> newProject);

  @PUT
  @Path("/projects/{projId}")
  @Consumes("application/xml")
  public void updateProject(@PathParam("projId") String projId, JAXBElement<Project> projNameChanged);

  @DELETE
  @Path("/projects/{projId}")
  public Project deleteProjectById(@PathParam("projId") String projId);

  // Researcher
  @GET
  @Path("/researchers")
  public List<Researcher> getResearchers();

  @GET
  @Path("/samples")
  public List<Sample> getSamples();


  @GET
  @Path("/researchers/{id}")
  public Researcher getResearcher(@PathParam("id") String id);

  @PUT
  @Path("/researchers/{id}")
  @Consumes("application/xml")
  public void updateResearcher(@PathParam("id") String id, JAXBElement<Researcher> projNameChanged);

  @DELETE
  @Path("/researchers/{id}")
  public Project deleteResearcher(@PathParam("id") String id);


}
