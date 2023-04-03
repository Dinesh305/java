package JavaProject.JavaInterviewQuestions;

public class numberSwap {

    public static void main(String[] args) {

        //FirstWay
        int a = 10;
        int b = 20;
        //System.out.println("Before swapping " + a + " " + b );
        int t =a ;
        a=b;
        b=t;
        //System.out.println("Afetr swapping " + a + " " + b);
        //SecondWay
        a = a+b; //30
        b= a-b ; //20
        a = a-b ;// 30/10

        //System.out.println("After Swapping " + a + " " + b);

        //thirdWay

        int c =40;int d =50;
        System.out.println("Before "+  c + " " + d);
        int temp = c;
        c=d;
        d=temp;
        System.out.println("After "+  c + " " + d);
    }
}
