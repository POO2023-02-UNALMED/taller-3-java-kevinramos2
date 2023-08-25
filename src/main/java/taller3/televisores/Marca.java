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
		return this.nombre;
	}
	//método set
	public void setNombre () {
		this.nombre = nombre;
	}
}
