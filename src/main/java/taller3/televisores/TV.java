package taller3.televisores;

public class TV {
	//atributos de la clase
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	//atributo de tipo clase
	private static int numTV;
	
	//Constructor
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	//set y get de marca,canal,precio,volumen y control.
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getPrecio () {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 120 && estado) {
			this.canal = canal;
		}	
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if (volumen >= 0 && volumen <= 7 && estado) {
			this.volumen = volumen;
		}
	}
	public static int getNumTV () {
		return numTV;
	}
	public static void setNumTV (int numTV) {
		TV.numTV = numTV;
	}
	//metodos que el control deberá hacer uso
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff () {
		this.estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp () {
		//condiciones para subir de canal
		if ((canal != 120) && (estado)) {
			canal += 1;
		}
	}
	public void canalDown() {
		//condiciones para bajar de canal
		if ((canal != 1) && (estado)) {
			canal -= 1;
		}
	}
	public void volumenUp () {
		//condiciones para subir el volumen
		if ((volumen != 7) && (estado)) {
			volumen = volumen+1;
		}
	}
	public void volumenDown() {
		//condiciones para bajar el volumen
		if ((volumen != 0) && (estado)) {
			volumen = volumen-1;
		}
	}	
}
