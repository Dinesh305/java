package java_project_begineer;

public class string_reverse {
    public static void main(String[] args) {
//        String name= "dinesh kumar";
//        int count=0;
//
//        for(int i=name.length()-1;i>=0;i--)
//        {
//            System.out.println(name.charAt(i));
//            count++;
//        }
//        System.out.println(count);

        ///string palindrome

        String ab = "ABBbbA";

        StringBuilder cd = new StringBuilder();
        for (int i = ab.length() - 1; i >= 0; i--) {
            cd.append(ab.charAt(i));
            //System.out.print(cd);
        }
        if (ab.equals(cd.toString())) {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");

        }
        }

    }
