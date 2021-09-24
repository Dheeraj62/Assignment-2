import java.util.Scanner;
class ValueRefernce
{
    static ValueRefernce k;
    void byValue(int a)
    {
        a=a*10;
        System.out.println("Call by Value = " + a);
    }
    static void byReference(ValueRefernce refer)
    {
        ValueRefernce.k=refer;
        System.out.println("Call by reference  value = " + ValueRefernce.k);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Please enter the number");
        x = scan.nextInt();
        ValueRefernce ob= new ValueRefernce();
        ob.byValue(x);
        //Calling.k=x;
        byReference(ob);
        scan.close();
    }
}
