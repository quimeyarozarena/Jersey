package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Person;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	

	@Override
	public List<Person> getPersons() {
		List<Person> persons = new ArrayList<>();
		Person p = new Person(1, "name", "lastname", "email", "phone", "password", false, false);
		persons.add(p);
		
		return persons;
	}

}
