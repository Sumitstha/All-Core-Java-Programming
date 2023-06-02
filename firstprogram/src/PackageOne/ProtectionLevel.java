package PackageOne;

public class ProtectionLevel {
	int data = 40;
	private int privatedata = 30;
	protected int protectdata = 50;
	public int publicdata = 200;

	public ProtectionLevel() {
		System.out.println("default data= " + data);
		System.out.println("private data= " + privatedata);
		System.out.println("protected data= " + protectdata);
		System.out.println("public data= " + publicdata);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
