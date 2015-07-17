package struts.person.action;

import struts.person.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class PersonActionInterceptor extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Person person;
	private String name;
	private int age;

	public String execute() throws Exception {
		
		
		System.out.println("Name = " + this.name);
		System.out.println("Name = " + this.age);
		person = new Person(name, age);
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
