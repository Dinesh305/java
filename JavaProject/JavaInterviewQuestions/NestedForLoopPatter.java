package JavaProject.JavaInterviewQuestions;
public class NestedForLoopPatter {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
        pattern5();
    }
    static void pattern1(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern2(int b) {
        for (int i = 0; i <= b; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern3(int c) {
        for (int i = 0; i <= c; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern4(int d) {
        for (int i = 0; i <= d; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static void pattern5() {
        for (int i = 0; i <= 4; i++) {
            int j;
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 4; i++) {
            int j;
            for (j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        static void pattern6 () {

            for (int i = 0; i <= 4; i++) {
                int j;
                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}