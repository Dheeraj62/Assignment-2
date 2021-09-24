import java.util.Scanner;
public class Area
{  int area ;
    double Area;
    public void sum(int a)
    {
       area = a*a;
        System.out.println("Area of the square = " + area);
    }

    public void sum(int a, int b)
    {
         area = a*b;
        System.out.println("Area of the rectangle = " + area);
    }

    public void sum(double a, double b)
    {
         Area = 0.5*a*b;
        System.out.println("Area of the triangle = " + Area );
        System.out.println("\n");
    }

    public static void main(String[] args)
    {
        int x, y;
        double height, base;
        Scanner scan = new Scanner(System.in);
        Area a1=new Area();
        System.out.println("\nEnter side of the square : ");
        x=scan.nextInt();
        a1.sum(x);
        System.out.println("\n\nEnter length of the rectangle : ");
        x=scan.nextInt();
        System.out.println("Enter  breadth of the rectangle : ");
        y=scan.nextInt();
        a1.sum(x,y);
        System.out.println("\n\nEnter height of the triangle : ");
        height = scan.nextDouble();
        System.out.println("Enter  base of the triangle : ");
        base=scan.nextDouble();
        a1.sum(height,base);
        scan.close();

    }
}


