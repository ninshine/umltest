public class ShapeFactory{
	public static Shape2D Create2D(String name, double... ps) throws FactoryError{
		switch(name){
			case "Circle":
				return new Circle(ps[0]);
			case "Triangle":
				return new Triangle(ps[0],ps[1],ps[2]);
			case "Rectangle":
				return new Rectangle(ps[0],ps[1]);
			default:
				throw new FactoryError();
		}
	}
	
	public static Shape3D Create3D(String name,String name2D,double h, double... ps) throws FactoryError{
		switch(name){
			case "Podetium":
				return new Podetium(name2D,h,ps);
			default:
				throw new FactoryError();
		}
	}
}
