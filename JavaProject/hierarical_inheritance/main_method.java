package JavaProject.hierarical_inheritance;

public class main_method {

    public static void main(String[] args){
        System.out.println("family_details");

        appa obj = new appa();
        obj.grandpa_details();
        obj.appa_details();

        System.out.println("-------------------------");

        cithapa obj1 = new cithapa();
        obj1.grandpa_details();
        obj1.setCithapa_name();



    }

}
