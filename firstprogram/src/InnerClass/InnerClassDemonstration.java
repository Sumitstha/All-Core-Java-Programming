package InnerClass;

class Outer {
	private int data = 400;

	class Inner {
		public void access() {
			System.out.println("the data is : " + data);
		}
	}
}

public class InnerClassDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj1 = new Outer();
		Outer.Inner obj2 = obj1.new Inner();
		obj2.access();
	}

}
