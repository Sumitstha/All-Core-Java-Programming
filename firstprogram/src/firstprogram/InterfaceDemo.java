package firstprogram;
interface A{
	
	//static:object banaunu pardaina
	//by default abstract ra public hunxa
	//abstract vayepaxi body rakhna paidaina
	
	int x=20;
	public int y=30;
	public static int z=70;//by default public static final vanna le int x; garnu ra public static final vaneko eutai ho
	void display();
	void method();//by  default public abstract
	}

//interface ra interface extend hunxa
//interface c extends a{
//}

interface c{
	
	
}

//multiple inheritance
class B implements A,C
{
	
}
class B implements A{
	
	//class le interface lai implement garxa
	//interface le interface lai extend garxa
	//class le class lai extend garxa
	//implements vaneko class A ko property class B ma aaisakyo
	
	int a;
	
//B must implement abstract method of A
	
	@Override //already used method can override
	public void display() {
		// TODO Auto-generated method stub
		int x=35;
		System.out.println("Hello Interface");
	}
	
@Override
public void method() {
	// TODO Auto-generated method stub
	
}
}

class C extends B{
	
}

//hybrid inheritance
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();//cannot instantiation
B b=new B();

	}

}
