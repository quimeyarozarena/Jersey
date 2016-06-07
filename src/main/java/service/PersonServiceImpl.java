package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import model.Person;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	public PersonServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Person> getPersons() {
		List<Person> persons = new ArrayList<>();
		Person p = new Person(1, "name", "lastname", "email", "phone", "password", false, false);
		persons.add(p);
		
		return persons;
	}

}
