package ejercicios.practica1;

import com.opensymphony.xwork2.ActionSupport;

import ejercicios.practica1.beans.Employee;

public class EmployeeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Employee employee;

	private int employeeId;

	private int departmentId;

	private String firstName;

	private String lastName;

	private int salary;

	public EmployeeAction() {
	}

	public EmployeeAction(int employeeId, int departmentId, String firstName,
			String lastName, int salary) {
		super();
		this.employeeId = employeeId;
		this.departmentId = departmentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String execute() throws Exception {
		System.out.println("Nombre = " + this.firstName);

		employee = new Employee(departmentId, departmentId, this.firstName,
				this.lastName, departmentId);

		return SUCCESS;

	}
}