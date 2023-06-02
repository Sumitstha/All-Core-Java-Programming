package InheritancePackage;
class emp{
	int id=1;
	String name= "Hari";
	float salary= 100000f;
}
class Developer extends emp{
	public void coding() {
		System.out.println("Write Code");	
	}
	float bonus=10000f;
	
}

class MobileDeveloper extends Developer{
	@Override
	public void coding() {
		System.out.println("codes for mobile app");
	}
	
	float allowance=5000f;
	public float total() {
		return salary+allowance+bonus;
	}
}
public class emolpyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDeveloper obj=new MobileDeveloper();
		System.out.println("ID is: "+ obj.id);
		System.out.println("Name is: "+ obj.name);
		System.out.println("Salary is: "+ obj.total());

	}

}
