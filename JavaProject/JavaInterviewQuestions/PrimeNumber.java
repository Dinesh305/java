package JavaProject.JavaInterviewQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        int no=14;
        int div =2;
        {
            if(no%div==0){
                System.out.println("it is not prime number");
            }
            div++;
            if(no!=0)
                System.out.print("it is prime number");
        }
    }
}
