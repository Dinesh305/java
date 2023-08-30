package JavaProject.BasicJava;

import java.util.Scanner;

public class OddEvenNum {

    public static void main(String[] args) {
        System.out.println("Check given number Odd or Even");


        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your num");

        int num = sc.nextInt();

        //int input =1;
        int number =num%2;
        if(number==1){
            System.out.println("It is odd number");
        }
        else {
            System.out.println("It is even num");
        }


    }
}
