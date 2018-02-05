package unidad7.practica3;

import java.util.Date;

public class practica3 {
	private int x = 20;
	private int y;
	@SuppressWarnings("deprecation")
	private Date d = new Date (100,0,1);
	private String s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practica3 obj = new practica3();
		System.out.println("x = " + obj.x);
		System.out.println("y = " + obj.y);
		System.out.println("d = " + obj.d);
		System.out.println("s = " + obj.s);
	}

}
