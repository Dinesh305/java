package BasicJava;

import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        System.out.println("please enter your num ! ");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] total = new int[count];
        int i = 0;
        while (i < count) {
            System.out.println("please enter your number ");
            total[i] = scanner.nextInt();
            i++;
        }
        for (i = 0; i < count; i++) {
            System.out.println(total[i]);
        }
    }
}