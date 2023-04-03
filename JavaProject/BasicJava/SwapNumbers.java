package BasicJava;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10,b=20;
        System.out.println("Before swapping " + a +","+ b );
       // Solution 1
        int Temp = a;
        a=b;
        b= Temp;
        System.out.println("After Swapping " +a + ","+b);
       // Solution 2
//        a= a+b;
//        b= a-b;
//        a= a-b;
//        System.out.println("After Swapping " +a + ","+b);




    }
}
