package resource;

import java.util.List;

import javax.inject.Qualifier;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import model.Person;
import service.PersonService;

@Controller
@Path("/hello")
public class PersonResourceImpl {
	
	@Autowired
	private PersonService personService;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Person> getPersons() {
		
		return personService.getPersons();
	}

}
