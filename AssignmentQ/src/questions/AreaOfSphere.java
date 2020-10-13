package questions;

public class AreaOfSphere {
	
	private double radius;
	
	
	public AreaOfSphere(double radius)
	{
		this.radius = radius;
	}
	
	
	public void areaOfSphere()
	{
		double area=0;
		area = 4*Math.PI*radius*radius;
		System.out.println("Surface area of Sphere is:" + area);
		
	}

}
