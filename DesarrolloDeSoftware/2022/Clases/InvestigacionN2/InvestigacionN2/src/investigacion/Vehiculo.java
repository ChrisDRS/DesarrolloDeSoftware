package investigacion;

public class Vehiculo 
{
	String modelo, matricula, propietario;
	Boolean encendido=false;
	int km=0;
	
	public void estado()
	{
		if(this.encendido==true)
			System.out.print("El vehiculo esta encendido");
		else
			System.out.println("El vehiculo esta apagado");
	}
	public void kilometraje()
	{
		if(km<=1)
			km++;
		else
			if(encendido==false);
				System.out.println("El vehiculo sigue apagado");
	}
	class modeloBMW extends Vehiculo
 	{
		public modeloBMW()
		{
			this.modelo = "BMW";
		}
	}
}
