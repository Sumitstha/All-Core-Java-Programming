package PackageOne;

public class SamePackageSubClass extends ProtectionLevel{
	SamePackageSubClass(){
		System.out.println("default data= " + data);
		System.out.println("private data= " + privatedata);
		System.out.println("protected data= " + protectdata);
		System.out.println("public data= " + publicdata);
	}
	

	

}
