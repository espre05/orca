package p.clims.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StopWatch;

import p.clims.auth.BasicAuthenticator;

import com.genologics.ri.project.ObjectFactory;
import com.genologics.ri.project.Project;
import com.genologics.ri.project.Projects;
import com.genologics.ri.researcher.Researcher;
import com.genologics.ri.sample.Sample;


/**
 * User: pnatar
 * Date: 11/02/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:p/clims/spring/cfg/app.xml")
public class ClarityRestTest {
  private final static String userName = "apiuser", password = "apipassword";
  // private final static String userName = "pnatarajan", password = "clims123";
  private static Logger logger = LoggerFactory.getLogger(ClarityRestTest.class);
  private final static String CLARITY_ENDPOINT_ADDRESS = "http://clims02:8080";
  public static final String ENCODING_UTF_8 = "UTF-8";


  // private ClarityService restService = JAXRSClientFactory.create(CLARITY_ENDPOINT_ADDRESS, ClarityService.class, userName, password, null);
  @Autowired
  private ClarityService restService;// = JAXRSClientFactory.create(CLARITY_ENDPOINT_ADDRESS, ClarityService.class, userName, password, null);

  @Test
  public void clarity_create_project() throws IOException {
    Project projNew = new Project();
    projNew.setName("PK_CLIA002");
    JAXBElement<Project> projNewElement = new ObjectFactory().createProject(new Project());

    Project retriveNewProject = restService.createProject(projNewElement);
    logger.info("Create Proj:" + projNew.toString());
    logger.info("Created Proj:" + retriveNewProject.toString());
  }

  @Test
  public void clarity_get_projects() throws IOException {
    List<Project> projects = restService.getProjects();
    logger.info(projects.toString());
    for (Project proj : projects) {
      logger.info("Project :" + proj.toString());
    }
  }

  @Test
  public void clarity_get_samples() throws IOException {
    StopWatch watch = new StopWatch();
    watch.start("Clarity Get Proj Samples");
    List<Sample> resercherList = restService.getSamples();
    for (Sample res : resercherList) {
      logger.info("Res = :" + res);
    }
    watch.stop();
    logger.info("ClarityRestTest Time elapsed: " + watch.shortSummary());
  }

  @Test
  public void clarity_get_researchers() throws IOException {
    StopWatch watch = new StopWatch();
    watch.start("Clarity Get Proj Researchers");
    List<Researcher> resercherList = restService.getResearchers();
    for (Researcher res : resercherList) {
      logger.info("Res = :" + res);
    }
    watch.stop();
    logger.info("ClarityRestTest Time elapsed: " + watch.shortSummary());
  }



  final static String PROJ_LIMS_ID = "AYY51";// "NYY503";


  @Test
  public void clarity_modify_project_PK_CLIA01() throws IOException {
    String projOpenDtBeforeUpdate = "2015-07-12";
    String projOpenDtAfterUpdate = "2015-07-30";
    Project projBeforeUpdate = restService.getProjectById(PROJ_LIMS_ID); // CLIA01
    Assert.assertEquals("BeforeChange it should be CLIA01", projOpenDtBeforeUpdate, projBeforeUpdate.getOpenDate());
    logger.info("Project Before name change :" + projBeforeUpdate.toString());


    {// change and update
      projBeforeUpdate.setOpenDate(projOpenDtAfterUpdate);
      JAXBElement<Project> projOpenDtChanged = new ObjectFactory().createProject(projBeforeUpdate);
      restService.updateProject(projBeforeUpdate.getLimsid(), projOpenDtChanged);
    }
    // verify
    Project projAfterUpdate = restService.getProjectById(PROJ_LIMS_ID); // CLIA01
    Assert.assertEquals("AfterChange ", projOpenDtAfterUpdate, projAfterUpdate.getOpenDate());

    {// revert to original state
      projBeforeUpdate.setOpenDate(projOpenDtBeforeUpdate);
      JAXBElement<Project> projOpenDtUndo = new ObjectFactory().createProject(projBeforeUpdate);
      restService.updateProject(projBeforeUpdate.getLimsid(), projOpenDtUndo);
    }
    // verify
    Project projAfterUndo = restService.getProjectById(PROJ_LIMS_ID);
    Assert.assertEquals("AfterChange ", projOpenDtBeforeUpdate, projAfterUndo.getOpenDate());

  }

  @Test
  public void clarity_delete_project() throws IOException {
    Project proj2Del = restService.getProjectById(PROJ_LIMS_ID); // CLIA01
    logger.info("Project 2 del :" + proj2Del.toString());
    restService.deleteProjectById(proj2Del.getLimsid());

  }

  // @Test
  public void clarity_delete_resercher() throws IOException {
    String researcherId = "5";
    Researcher resarcherLiz = restService.getResearcher(researcherId); // CLIA01
    logger.info("Researcher :" + resarcherLiz.toString());
    // restService.updateResearcher(resarcherLiz.get);

  }

  @Test
  public void clarity_get_projects_reqres() throws IOException {
    Client client = ClientBuilder.newClient();
    client.register(new BasicAuthenticator(userName, password));
    WebTarget webTarget = client.target(CLARITY_ENDPOINT_ADDRESS + "/api/v2/projects");
    // Response response = webTarget.request("application/xml").get();
    // String responseStr = getResponseAsStr(response);
    Projects Projects = webTarget.request("application/xml").get(Projects.class);
    System.out.println(Projects);
  }

  private String getResponseAsStr(Response response) throws IOException {
    InputStream instream = (InputStream) response.getEntity();
    String responseStr = new Scanner(instream, ENCODING_UTF_8).useDelimiter("\\A").next();
    instream.close();
    return responseStr;
  }
}
