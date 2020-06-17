package instructions;

import java.time.LocalTime;
import java.util.Scanner;

public class Ordering {
     public static void main(String[] args) {
        System.out.println("Jest: " + LocalTime.now());
	    sum();
    }

	public static void sum(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwszą liczbę: ");
		int a = scan.nextInt();
		System.out.println("Podaj drugą liczbę: ");
		int b = scan.nextInt();
		int sum = Integer.sum(a, b);
		
		System.out.println("Suma liczby " + a + " oraz liczby " + b + " wynosi: " + sum);
	}
	
   
}


