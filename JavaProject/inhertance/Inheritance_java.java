package java_project_begineer.inhertance;

public class Inheritance_java extends father_card
{

    public static void main(String args[])
    {
       // System.out.println("welcome java");

        father_card obj = new father_card();
        //grand_father obj1 = new grand_father();
        obj.father_details();
        obj.display_grandfather();
    }
}
