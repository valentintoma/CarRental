package ro.jademy.carrental;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?

        Shop shop = new Shop ();

        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Write username : " );
        String username = sc.nextLine ();
        System.out.println ( "Write your password : " );

        String passwrod = sc.nextLine ();

        shop.login ( username, passwrod );
    }


}
