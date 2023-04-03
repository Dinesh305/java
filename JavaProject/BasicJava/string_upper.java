package java_project_begineer;

public class string_upper {
    public static void main(String args[])
    {
        String word = "dineshkumar";

        for(int i=0;i<word.length();i++)
        {
            if(i%2==0) {
                System.out.print(word.substring(i, i + 1).toUpperCase());
                //+ word.substring(i));
            }
            else {
                System.out.print(word.substring(i, i + 1).toLowerCase());
            }

        }

    }
}
