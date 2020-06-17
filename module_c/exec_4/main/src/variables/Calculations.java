package variables;

public class Calculations {

    public static void main(String[] args) {

        // Algorytm obliczania koniecznego spadku wagi ciała, w celu uzyskania docelowego wyniku BMI

        // 1. Oblicz wartość wzorstu wyrażoną w metrach na podstawie wzrostu wyrażonego w centymetrach.
        // 2. Oblicz wartość wzrostu wyrażoną w metrach i podniesioną do kwadratu.
        // 3. Oblicz obecne BMI poprzez podzielenie wagi w kilogramach przez wzrost wyrażony w metrach
        //    i podniesiony do kwadratu.
        // 4. Oblicz różnicę między BMI obecnym, a BMI docelowym.
        // 5. Oblicz potrzebną zmianę wagi jako wynik mnożenia różnicy BMI i wzrostu wyrażonego w metrach
        //    i podniesionego do kwadratu.
        int heightInCm = 170;
        float weightInKg = 98;
        float targetBmi = 26;
        
        
        float heightInMeters = heightInCm / 100f;
        float heightInMetersSquare = (float) Math.pow(heightInMeters, 2);
        float presentBmi = weightInKg / heightInMetersSquare;
        float diffPresentAndTargetBmi = presentBmi - targetBmi;
        float weightChange = diffPresentAndTargetBmi * heightInMetersSquare;
        
        System.out.println("Wzrost w centymetrach: " + heightInCm);
        System.out.println("Waga w kilogramach: " + weightInKg);
        System.out.println("Docelowe BMI: " + targetBmi);

        System.out.println();
        System.out.println("Rozpoczynamy obliczenia...");
        System.out.println();

        // 1. Oblicz wartość wzorstu wyrażoną w metrach na podstawie wzrostu wyrażonego w centymetrach.
        System.out.println("Wzrost wyrażony w metrach: " + heightInMeters);

        // 2. Oblicz wartość wzrostu wyrażoną w metrach i podniesioną do kwadratu.
        System.out.println("Wzrost wyrażony w metrach i podniesiony do kwadratu: " + heightInMetersSquare);

        // 3. Oblicz obecne BMI poprzez podzielenie wagi w kilogramach przez wzrost wyrażony w metrach
        //    i podniesiony do kwadratu.
        System.out.println("Obecne BMI: " + presentBmi);

        // 4. Oblicz różnicę między BMI obecnym, a BMI docelowym.
        System.out.println("Różnica między BMI obecnym, a BMI docelowym: " + diffPresentAndTargetBmi);

        // 5. Oblicz potrzebną zmianę wagi jako wynik mnożenia różnicy BMI przez wzrost wyrażony w metrach
        //    i podniesiony do kwadratu.
        System.out.println("Docelowa zmiana wagi: " + weightChange);
        
   
    }
}