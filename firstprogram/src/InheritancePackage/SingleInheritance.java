package InheritancePackage;
//base class, super class or parent class
class Room{
	int length,breadth;//instance variable: variable that are accessed through objects

	public Room(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
}
int area() {
	return length*breadth;
}
}
class LivingRoom extends Room{
	int height;
	public LivingRoom(int length, int breadth, int height)
	{
		//super calls the constructor of super class
		super(length,breadth);
		this.height=height;
	}
	int volume()
	{
		return length*breadth*height;
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LivingRoom lr=new LivingRoom(5,6,9);
//lr.area();
//lr.volume();
System.out.println("Area is: "+lr.area());
System.out.println("Volume  is: "+lr.volume());
	}
	
	
	
	//abstract vayo vane inheritance hunxa instantiation hudaina ani object create garna mildaina

}
