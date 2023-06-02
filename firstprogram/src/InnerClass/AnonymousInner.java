package InnerClass;

abstract class IamAnonymous {
	public abstract void display();
}

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IamAnonymous obj = new IamAnonymous() {

			@Override
			public void display() {
				System.out.println("I am a method of anonymous");
			}
		};

		obj.display();

	}

}
