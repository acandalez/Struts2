package examples;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class PersonaAction extends ActionSupport {

	// persona se guarda en valuestacks
	private Persona persona;
	private String nombre;
	private int edad;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String execute() throws Exception {

		System.out.println("Nombre = " + this.nombre);
		System.out.println("Edad = " + this.edad);
		// en persona guardamos el nombre y la edad.
		persona = new Persona(edad, nombre);
		return SUCCESS;
	}

	// ActionMessage muestra el mensaje con resultado SUCCESS
	public void validate() {
		if (nombre.equals("Juan")) {
			addActionMessage("Ha entrado user!");
		} else {
			addActionError("Error!, no eres user");
		}
	}

}
