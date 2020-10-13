package questions;
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of the Sphere:");
		double rad =s.nextDouble();
		VolumeOfSphere sp = new VolumeOfSphere(rad);
		
		AreaOfSphere ar = new AreaOfSphere(rad);
		
		
		sp.volumeOfSphere();
		ar.areaOfSphere();
		
		
        s.close();
	}

}
