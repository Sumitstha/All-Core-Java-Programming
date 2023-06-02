package InheritancePackage;

abstract class car{//super class
	int wheels =4;
	public car() {
		System.out.println("Car Constructor");
		
	}
	public void type() {
		System.out.println("Vehicle type: Car");
	}
}
abstract class Maruti extends car{//sub class for car, super for maruti800
	public Maruti() {
		System.out.println("maruti construcor");
		
	}
	public void brand() {
		System.out.println("Brand : Suzuki");
	}
	public void speed() {
		System.out.println("80 km/hour");
	}
}
class maruti800 extends Maruti{//
	public maruti800() {
		System.out.println("Maruti800 Constructor");
	}
	
	@Override
	public void speed() {
		System.out.println("speed : 120 km/hour");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maruti800 obj=new maruti800();
		obj.speed();
		obj.brand();
		obj.type();
	}

}
