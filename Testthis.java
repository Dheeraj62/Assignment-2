 class Test {
    int a = 0;

    Test(int a) {
        this.a = a;
    }
}

public class  Testthis{

    public static void main(String[] args) {
        Test t = new Test(2);
        System.out.println("Value of A : "+t.a);
    }
 
}
