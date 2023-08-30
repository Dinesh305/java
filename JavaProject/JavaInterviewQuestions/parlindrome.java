package JavaProject.JavaInterviewQuestions;

public class parlindrome {

    public static void main(String[] args) {
        String a = "dinesh";
        String c = "";
        for (int i = a.length()-1; i >=0; i--)
        {
              c = c+ a.charAt(i);
        }
        System.out.println(c);
        if(a.equals(c))
            System.out.println("it is  palidrme");
            else
            System.out.println("it is not palidrome");
        }

    }

