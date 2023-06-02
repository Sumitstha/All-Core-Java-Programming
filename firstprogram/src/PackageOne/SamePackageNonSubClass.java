package PackageOne;

public class SamePackageNonSubClass {
ProtectionLevel p=new ProtectionLevel();
public SamePackageNonSubClass() {
	System.out.println("default data= " +p.data);
//	System.out.println("private data= " + p.privatedata);
	System.out.println("protected data= " + p.protectdata);
	System.out.println("public data= " + p.publicdata);
}
}
