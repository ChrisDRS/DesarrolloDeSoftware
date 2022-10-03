package investigacion;

public abstract class ejemploAbstraccion 
{
	private String color;
	private Boolean lleno;
	private java.util.Date fechaCreacion;
	
	protected ejemploAbstraccion()
	{
		fechaCreacion = new java.util.Date();
	}
	
	public abstract double getPerimetro();
	
	public abstract double getArea();
}
