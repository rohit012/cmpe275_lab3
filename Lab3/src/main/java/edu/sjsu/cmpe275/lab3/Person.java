package edu.sjsu.cmpe275.lab3;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Person {

	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String description;
	
	@Embedded
	private Address address;
	private Organization org;
	private List<Person> friends;
	
	
}
