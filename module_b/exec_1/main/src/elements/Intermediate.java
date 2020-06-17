package elements;

public class Intermediate {

    public static void main(String[] someArgs) {

        int myFavouriteNumber = 7;
        int mySecondFavouriteNumber = 29;

        int sumOfMyFavouriteNumbers = myFavouriteNumber + mySecondFavouriteNumber;

        System.out.println("Moja ulubiona liczba: " + myFavouriteNumber);
        System.out.println("Moja kolejna ulubiona liczba: " + mySecondFavouriteNumber);
        System.out.println("Suma moich ulubionych liczb: " + sumOfMyFavouriteNumbers);
        System.out.println("Suma moich ulubionych liczb (trochę inaczej): " + 36);
        System.out.println("Suma moich ulubionych liczb jeszcze inaczej: " + 7 + 29);

        int productOfMyFavouriteNumbers = myFavouriteNumber * mySecondFavouriteNumber;

        System.out.println("Iloczyn moich ulubionych liczb: " + productOfMyFavouriteNumbers);
        System.out.println("Iloczyn moich ulubionych liczb (trochę inaczej): " + 203);
        System.out.println("Iloczyn moich ulubionych liczb: " + 7 * 29);

        if (productOfMyFavouriteNumbers % 2 == 0) {
            System.out.println("Iloczyn moich ulubionych liczb jest parzysty!");
        }
        else {
            System.out.println("Iloczyn moich ulubionych liczb jest nieparzysty");
        }

        System.out.println("Kolejne liczby pomiędzy moją ulubioną liczbą i moją drugą ulubioną liczbą");
        int nextNumber = myFavouriteNumber + 1;
        while (nextNumber < mySecondFavouriteNumber) {
            System.out.println(nextNumber);
            nextNumber++;
        }
    }
}