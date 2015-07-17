package employee.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

import employee.model.Employee;

public class EmployeeAction extends ActionSupport {

	/**
	 * 
	 */
	private int idEmpleado;
	private Employee employee;

	private String noExiste = null;

	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {

		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;

		try {
			// registro el driver, en realidad, hago que se ejecuten unas pocas
			// líneas de la clase OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DriverManager.registerDriver (new
			// oracle.jdbc.driver.OracleDriver());// método equivalente al
			// anterior
			// Sea como sea, es, <<oye, si te piden una conexión, se la pides a
			// esa clase!>>
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "HR", "a693232977");
			stmt = conn.createStatement();
			rset = stmt
					.executeQuery("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = "
							+ idEmpleado);

			if (rset.next() && null != rset) {

				employee = new Employee(rset.getInt("EMPLOYEE_ID"),
						rset.getString("FIRST_NAME"),
						rset.getString("LAST_NAME"), rset.getString("SALARY"));
			} else {

				noExiste = "No existe el empleado con ese id_empleado";
				System.out.println("No existe el empleado con ese id_empleado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally // libero recursos, de "adentro a fuera" , ResultSet,
					// Statment, Conexion
		{
			if (rset != null) {
				try {
					rset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}

		}
		return SUCCESS;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
