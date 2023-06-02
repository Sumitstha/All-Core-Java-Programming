package InnerClass;

public class LocalInnerclass {
	public void MethodOne() {
		int data=30;
		class Inner{
			public void print() {
				System.out.println(data);
				
			}	
		}
		Inner in=new Inner();
		in.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerclass obj = new LocalInnerclass();
		obj.MethodOne();
	}

}
