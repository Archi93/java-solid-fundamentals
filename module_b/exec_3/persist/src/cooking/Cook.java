package cooking;

import cooking.helpers.Assistant;
import cooking.helpers.FoodProcessor;
import cooking.helpers.Fridge;

public class Cook {

    public static void main(String[] args) {

        System.out.println("Zaczynamy gotowanie");

        Assistant.ready();
        FoodProcessor.ready();
        Fridge.ready();
        Roller.ready();
        Knife.ready();
        Pot.ready();
        Towel.ready();
    }
}