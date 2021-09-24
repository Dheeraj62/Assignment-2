import java.util.Scanner;
public class SimpleBox
{
    private double length , width , depth;
    public SimpleBox(double l , double w , double d)
    {
        length  = l;
        width = w;
        depth = d;
    }
    public void volume()
    {
        double volume ;
        volume = length*width*depth;
        System.out.println("Volume : "+ volume);
    }
 	public static void main(String[] args) {
         double l , w , d;
	    Scanner scan = new Scanner(System.in);
        System.out.println("Enter box 1 dimensions: ");
        l = scan.nextDouble();
        w = scan.nextDouble();
        d = scan.nextDouble();
        SimpleBox box1 = new SimpleBox(l,w,d);
        box1.volume();
	    System.out.println("\nEnter box 2 dimensions: ");
        l = scan.nextDouble();
        w = scan.nextDouble();
        d = scan.nextDouble();
        SimpleBox box2 = new SimpleBox(l,w,d);
        box2.volume();
        scan.close();
	}
}
