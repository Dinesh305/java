package BusBookingApp;

import java.util.Scanner;

public class busDemo {

    public static void main(String[] args) {

        int UserInput = 1;

        //boolean b = true;
        System.out.println("Please enter number");

        while (UserInput ==1)
        {
            Scanner sc = new Scanner(System.in);
            int UserEntered =sc.nextInt();

            if(UserEntered==1)
            {
                System.out.println("Booking ........");
            }

        }
    }
}
