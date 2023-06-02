package InnerClass;

final class test {

}

//final class cannot be inherited
class test1 extends test {// cannot be inherited in final class but object can be created i final class

}

abstract class test2 {

}

class test3 extends test2 {// abstract class can be extended(inherited)

}

class test4 {
	final void display() {

	}
}

class test5 extends test4 {
	@Override
	public void display() {// final class cannot be override

	}
}

class test6 {
	private test6() {

	}
}

class test7 {
	// to initialize final variable we need constructor or static
	final static int a;
	static {
		a = 30;
	}
//	test7(){
//		a=30;
//	}
}

public class Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();// final class can be instantiated/obj. created
		test3 t3 = new test3();// object of abstract class cannot be created
		test6 t6 = new test6();// private constructor cannot be created or initializeds
	}

}
