package ShapeExceptions;

public class PolygoneShapeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 10L;
	public PolygoneShapeException()
	{
		
	}
	public PolygoneShapeException(String error)
	{
		System.err.print(error);
	}

}
