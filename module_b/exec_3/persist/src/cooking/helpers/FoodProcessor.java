package cooking.helpers;

public class FoodProcessor {

    public static void ready() {
        System.out.println("Robot kuchenny jest gotowy!");
        Knife.ready();
    }
}

class Knife {

    public static void ready() {
        System.out.println("Noż w robocie kuchennym jest gotowy!");
    }
}