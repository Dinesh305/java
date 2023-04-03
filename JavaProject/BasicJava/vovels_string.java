package java_project_begineer;

public class vovels_string {

    public static void main(String args[]) {

        String name = "educationisgood";
        int count = 0;

        for (int i = 0; i <name.length(); i++) {
            char ch = name.charAt(i);
            switch (ch) {

                case 'a':
                    count++;

                case 'e':

                case 'i':
                    System.out.println(ch);
                    count++;

            }

        }


    }

    public static interface Employee_rules_Interface {

        int salary = 20000;
        int marks = 10;

        public void mainhours();

        public void relocation();

        public void report();

        public void dress();



    }
}
