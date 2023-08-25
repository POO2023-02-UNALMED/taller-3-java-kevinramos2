package taller3.televisores;

public class Control {
	private TV tv;
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	public void canalUp() {
		tv.canalUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void setVolumen(int volumen) {
		tv.setVolumen(volumen);
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public void enlazar(TV televisor) {
		this.tv = televisor;
		televisor.setControl(this);
	}
}
