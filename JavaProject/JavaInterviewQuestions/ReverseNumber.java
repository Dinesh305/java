package JavaProject.JavaInterviewQuestions;

import static java.lang.String.*;
import java.io.*;
public class ReverseNumber {
    public static void main(String[] args) {

        String a = "dinesh";

        String c;
        c ="";

        for (int i = a.length()-1; i >=0; i--)
        {
            c = c+a.charAt(i);
        }
        System.out.println(c);
    }
}
