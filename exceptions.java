
class ReadError extends Exception 
{ 
    public ReadError(String msg) 
    { 
        super(msg); 
    } 
}  

class TriangleError extends Exception
{
	public TriangleError(){
		super("不能构成三角形！");
	}
}

class FactoryError extends Exception
{
	public FactoryError(){
		super("无法生成图形！");
	}
}

public class exceptions {
	public exceptions()
	{
		//pass
	}
}
