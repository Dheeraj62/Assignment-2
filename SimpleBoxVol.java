import java.util.Scanner;
public class SimpleBoxVol
{
    public double volume(double length , double width , double  depth)
    {
        double volume ;
        volume = length*width*depth;
        return volume;
    }
 	public static void main(String[] args) {
         double l , w , d;
         double vol1 , vol2 ;
	    Scanner scan = new Scanner(System.in);
		SimpleBoxVol box1 = new SimpleBoxVol();
		SimpleBoxVol box2 = new SimpleBoxVol();
        System.out.println("Enter box 1 dimensions: ");
        l = scan.nextDouble();
        w = scan.nextDouble();
        d = scan.nextDouble();
        vol1 = box1.volume(l,w,d);
        System.out.println("Volume : "+ vol1);
	    System.out.println("\nEnter box 2 dimensions: ");
        l = scan.nextDouble();
        w = scan.nextDouble();
        d = scan.nextDouble();
        vol2 =box2.volume(l,w,d);
        System.out.println("Volume : "+ vol2);
        scan.close();
	}
}
