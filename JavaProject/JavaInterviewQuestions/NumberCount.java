package JavaProject.JavaInterviewQuestions;

public class NumberCount {
    public static void main(String[] args) {
        int a =12345;
        int b =0;

        while(a>0){

            a = a/10;
            b++;
        }

        System.out.print(b);

    }
}
