package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class PersonResourceImpl {
	
	@GET
	@Produces({MediaType.TEXT_PLAIN})
	public String getPersons() {
			
		return "Hello world!!";
	}

}
