package travel.travellers;

public class Porter {

    public static void ready() {
        System.out.println("Tragarz jest gotowy!");
        Knife.ready();
    }
}

class Knife {

    public static void ready() {
        System.out.println("Nóż tragarza jest gotowy!");
    }
}