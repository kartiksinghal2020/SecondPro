package questions;
import java.lang.Math;
public class VolumeOfSphere {
	
	private double radius;
	
	public VolumeOfSphere(double radius)
	{
		this.radius = radius;
	}
	
	public void volumeOfSphere()
	{
		double volume =0;
		volume = (4 *Math.PI)/3  * radius *  radius * radius ;
		System.out.println("Volume of a Sphere is:"+ volume);
	}
	
	

}
