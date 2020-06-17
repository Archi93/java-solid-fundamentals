package travel;

import travel.travellers.Traveller;
import travel.travellers.Porter;

public class Journey {

    public static void main(String[] args) {

        System.out.println("Przygoda się rozpoczyna!");
        Traveller.ready();
        Porter.ready();
        Tent.ready();
        SleepingBag.ready();
        Knife.ready();
        Lighter.ready();
    }

}