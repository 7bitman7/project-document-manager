package ru.home.documentmanager.service;

import java.util.List;

import ru.home.documentmanager.model.Person;

public interface PersonService {
	
	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);

}
