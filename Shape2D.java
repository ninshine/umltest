public interface Shape2D {
	public double GetS();
	public double GetL();
}
//圆形
class Circle implements Shape2D {
	private double Radius;
	public Circle(double r){
		this.Radius = r;
	}
	
	public double GetS(){
		return Math.PI * this.Radius * this.Radius;
	}
	
	public double GetL(){
		return 2 * Math.PI * this.Radius;
	}
	
}
//三角形
class Triangle implements Shape2D {
	private double a,b,c;
	public Triangle(double x,double y,double z){
		this.a = x;
		this.b = y;
		this.c = z;
	}
	
	public double GetS(){
		double temp;
		temp = GetL()/2.0;
		return Math.sqrt(temp*(temp-this.a)*(temp-this.b)*(temp-this.c));
	}
	
	public double GetL(){
		return this.a+this.b+this.c;
	}
}
//长方形
class Rectangle implements Shape2D {
	private double a,b;
	public Rectangle(double x,double y){
		this.a = x;
		this.b = y;
	}
	
	public double GetS(){
		return this.a*this.b;
	}
	
	public double GetL(){
		return 2*(this.a+this.b);
	}
}

