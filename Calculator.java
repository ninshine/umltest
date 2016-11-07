public class Calculator {
	
	double Shape2DGetS(String name, double... ps) throws FactoryError{
		/*function:计算2D形状的面积
		 * param:name 2D形状名
		 * param:ps   相关参数
		 * */
		Shape2D c2;
		c2 = ShapeFactory.Create2D(name, ps);
		return c2.GetS();
	}
	
	double Shape3DGetV(String name,String name2D,double h, double... ps) throws FactoryError{
		/*function:计算3D形状的体积
		 * param:name 3D形状名
		 * param:name2D 底面2D形状名
		 * param:h 高
		 * param:ps   相关参数
		 * */
		Shape3D c3;
		c3 = ShapeFactory.Create3D(name, name2D, h, ps);
		return c3.GetV();
	}
}

