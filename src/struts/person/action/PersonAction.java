package struts.person.action;

import com.opensymphony.xwork2.ActionSupport;

import struts.person.model.Person;


public class PersonAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Person person;
	
	public String execute() throws Exception {
		
		person = new Person("Enry", 28);
		return SUCCESS;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
