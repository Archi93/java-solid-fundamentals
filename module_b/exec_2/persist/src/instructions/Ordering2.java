package instructions;

import java.util.Scanner;
import java.time.LocalTime;


public class Ordering2 {
    

	public static void main(String[] args) {
        System.out.println("Jest: " + LocalTime.now());
        favouriteNumber();
    }

    public static void favouriteNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoją ulubioną liczbę: ");
        int favouriteNumber = scan.nextInt();

        System.out.println("Twoja ulubiona liczba to: " + favouriteNumber);
        System.out.println("A liczba dwa razy większa to: " + favouriteNumber * 2);
    }

    
}


