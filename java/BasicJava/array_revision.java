package java_project_begineer;
import java.util.Scanner;
public class array_revision {
    public static void main(String[] args)
    {
        System.out.println("please enter your array size !");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] marks = new int[num];
        int max=0;
        int count=0;
        System.out.println("please enter your marks");
        for(int i=0;i<num;i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("your marks are ");
        for(int i =0;i<num;i++)
        {
            if(marks[i]> max)
                max=marks[i];

        }
        count++;
        System.out.println(max);
        System.out.println(count);
    }
}
