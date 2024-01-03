package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SUV thar=new SUV("Thar",false);
		
		thar.move(40, 0);
		thar.accelerate(20);
//		thar.accelerate(-60);
		System.out.println("Current gear :"+thar.getCurrentGear());
		System.out.println("Current Speed :"+thar.getCurrentSpeed());
		
		
	}

}
