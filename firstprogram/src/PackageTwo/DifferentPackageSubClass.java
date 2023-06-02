package PackageTwo;

import PackageOne.ProtectionLevel;

public class DifferentPackageSubClass extends ProtectionLevel {
	ProtectionLevel p = new ProtectionLevel();

	public DifferentPackageSubClass() {
		System.out.println("default data= " + data);
		System.out.println("private data= " + privatedata);
		System.out.println("protected data= " + protectdata);
		System.out.println("public data= " + publicdata);
	}

}
