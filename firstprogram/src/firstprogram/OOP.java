package firstprogram;

public class OOP {
	int l,b;
	public void setData(int l) {
		this.l=this.b=l;
	}
	public void setData(int l,int b) {//method overloading
		this.l=l;
		this.b=b;
		
	}
	public int area() {
		return l*b;
	}
	

	public static void main(String[] args) {
		OOP objsquare=new OOP();
		objsquare.setData(5);
		System.out.println("Area of a Square"+objsquare.area());
		OOP objrectangle=new OOP();
		objrectangle.setData(3,4);
		System.out.println("Area of a rectangle"+objrectangle.area()+a)
		
		

	}

}
