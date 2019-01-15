package com.lnt.mvc.dao;

import java.util.List;

import com.lnt.mvc.model.Person;

public interface IPersonDao {
	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}
