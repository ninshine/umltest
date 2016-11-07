public interface Shape3D{
	public double GetV();
}
//棱柱
class Podetium implements Shape3D{
	private double h;
	Shape2D S2;
	
	public Podetium (String name,double nh, double... ps) throws FactoryError{
		this.h = nh;
		S2=ShapeFactory.Create2D(name, ps);
	}
	
	public double GetV(){
		return S2.GetS() * this.h;
	}
}
