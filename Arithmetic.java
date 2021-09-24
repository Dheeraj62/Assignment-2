import java.util.Scanner;
class Arithmetic
{
    void sum(int a, int b)
    {
        int sum=a+b;
        System.out.println("\nSum = " + sum);
    }
    void sub(int a, int b)
    {
        int sub = a-b;
        System.out.println("Diff. = " + sub);
    }
    void pro(int a, int b)
    {
        int pro=a*b;
        System.out.println("Product = " + pro);
    }
    void div(int a, int b)
    {   if(b==0)
        {
            System.out.println("Can't divide by zero");
            
        }
        else {
        int div=a/b;
        System.out.println("Division of 'A' by 'B' = " + div);
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a , b ;
        System.out.println("Please enter the value of 'A'");
        a= scan.nextInt();
        System.out.println("Please enter the value of 'B'");
        b= scan.nextInt();
        Arithmetic operation = new Arithmetic();
        operation.sum(a,b);
        operation.sub(a,b);
        operation.pro(a,b);
        operation.div(a,b);
        scan.close();
    }
}