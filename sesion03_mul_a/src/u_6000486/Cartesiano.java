package u_6000486;


public class Cartesiano {

	private float x,y;

	public Cartesiano(float x, float y) {
		
		this.x = x;
		this.y = y;
	}
	public Cartesiano () {
		
	}
	
	public Cartesiano polar_cartesiano(float radio, float angulo) {
		float x= radio*(float)Math.cos(angulo);
		float y= radio*(float)Math.sin(angulo);
		
		return new Cartesiano(x,y);
		
	}
	public Cartesiano polar_cartesiano(Polar p) {
		
		/*float x= p.getRadio()*(float)Math.cos(p.getAngulo());
		float y= p.getRadio()*(float)Math.sin(p.getAngulo());
		return new Cartesiano(x,y);*/
		
		//Haciendo uso de la recursividad
		return polar_cartesiano(p.getRadio(),p.getAngulo());
	}
	public Polar cartesiano_polar(float x, float y) {
		
		float radio=(float) Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
		float angulo=(float) Math.atan(y/x);
		return new Polar(radio,angulo);
	
	}
	public Polar cartesiano_polar(Cartesiano c) {
		/*float radio=(float) Math.sqrt((Math.pow(c.getX(), 2))+(Math.pow(c.getY(), 2)));
		float angulo=(float) Math.atan(c.getY()/c.getX());
		return new Polar(radio, angulo);//Implementar procedimiento correcto*/
		
		return cartesiano_polar (c.getX(),c.getY());
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
}
