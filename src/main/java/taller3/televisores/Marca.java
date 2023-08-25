package taller3.televisores;

public class Marca {
	//atributo string
	private String nombre;
	//constructor con el nombre del objeto Marca
	public Marca(String nombre){
		this.nombre = nombre;
	}
	//método get
	public String getNombre() {
		return nombre;
	}
	//método set
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
}
