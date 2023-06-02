package PackageTwo;

import PackageOne.ProtectionLevel;

public class DifferentPackageNonSubClass extends ProtectionLevel {
	ProtectionLevel p = new ProtectionLevel();

	public DifferentPackageNonSubClass() {
		System.out.println("default data= " + data);
		System.out.println("private data= " + privatedata);
		System.out.println("protected data= " + protectdata);
		System.out.println("public data= " + publicdata);
	}
}
