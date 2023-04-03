package java_project_begineer.Scala_practise;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the number");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("User entered "+ input);

        //Method 1
        StringBuffer sb = new StringBuffer(input);
        System.out.println("Reverse number is " +sb.reverse());
        //Method2
        StringBuilder sbi = new StringBuilder(input);
        System.out.println("Reverse number is " +sbi.reverse());






    }
}
