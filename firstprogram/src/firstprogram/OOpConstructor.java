package firstprogram;

public class OOpConstructor {
	int l,b;
		public OOpConstructor(int l) {
			this.l=this.b=l;
		}
		public OOpConstructor(int l,int b) {
			this.l=l;
			this.b=b;
			
		}
		public int area() {
			return l*b;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOpConstructor obj= new OOpConstructor();
		System.out.println("Area is:"+obj.area());
		

	}

}
