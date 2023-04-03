package java_project_begineer;

import java.util.Scanner;

public class user_input_max_mark {
    public static void main(String args[]) {
        System.out.println("please enter your array length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        int[] array=new int[n];
        System.out.println("please enter your marks ");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if(array[i]>max)
                max=array[i];
        }
        System.out.println( "your max_mark is " +max);

    }
}