package JavaProject.BasicJava;

public class String_Class {

    public static void main(String[] args)
    {
        System.out.println("Welcome java");
        String name = "educatiooonn";

        //System.out.println(name.charAt(5));

        int count =0;
        for(int i =0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            switch (ch)
            {
                case 'a' : count++;
                break;
                case 'e' : count++;
                break;
                case 'i' : count++;
                break;
                case 'o' : count++;
                break;
                case 'u' : count++;
                break;
            }
        }
        System.out.println(count);
    }

    public static interface familrulesinterface {

        public void eat();

        public void sleep();

        public void jogging();

        public void report();

    }
}
