package java_project_begineer;

public class stringcontains {

    public static void main(String args[]) {
        String name = "dineshkumar123400000005";

        int count=0;

        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i) >='0')
                if(name.charAt(i)<='9')
                {
                    System.out.println(name.charAt(i));
                    count++;
                }
            //System.out.println(count);
        }
        System.out.println("Count is " +count);
    }

    public static class ABC_Employee implements vovels_string.Employee_rules_Interface, String_Class.familrulesinterface {
        public static void main(String args[])
        {
            ABC_Employee abcemp = new ABC_Employee();
            abcemp.dress();
            abcemp.eat();
            abcemp.mainhours();
            System.out.println(vovels_string.Employee_rules_Interface.marks);
            String_Class.familrulesinterface visit = new ABC_Employee();
            visit.jogging();
            visit.report();
        }
        public void mainhours(){
            System.out.println("mainhours");
        }

        public void relocation(){
            System.out.println("relocation");
        }

        public void dress(){
            System.out.println("dressing ");

        }

        public void eat(){
            System.out.println("Eat well");

        }

        public void sleep(){
            System.out.println("Sleep well");
        }

        public void jogging() {
            System.out.println("Jogging well");
        }
            public void report(){
                System.out.println("reporting well");

        }
    }
}
