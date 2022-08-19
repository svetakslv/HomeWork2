public class Main {
    public static void main(String[] args) {
        // Задание №1
        byte cat = 2;
        short penguin = 7;
        int bear = 4;
        long dolphin = 8L;
        float chocolateWeight = (float) 127.9765;
        double aPieceOfCake = 6.7;
        char bar = 35;
        boolean d = 23 > 12;
        System.out.println(cat);
        System.out.println(penguin);
        System.out.println(bear);
        System.out.println(dolphin);
        System.out.println(chocolateWeight);
        System.out.println(aPieceOfCake);
        System.out.println(bar);
        System.out.println(d);


        // Задание №2
        double Boxer1 = 78.2;
        double Boxer2 = 82.7;
        double allBoxers = Boxer1 + Boxer2;
        double BoxersDifference = Boxer2 - Boxer1;
        System.out.println(allBoxers);
        System.out.println(BoxersDifference);

        // Задание №3
        int bananas = 5;
        int milk = 200;
        int icecream = 2;
        int eggs = 4;
        int bananasWeight = 80 * 5;
        int milkWeight = 105 * 2;
        int icecreamWeight = 100 * 2;
        int eggsWeight = 70 * 4;
        System.out.println((bananasWeight + milkWeight + icecreamWeight + eggsWeight) / 1000);

        // Задание №4
        int weightOfSportsman = 7 * 1000;
        int weight1 = 250;
        int weight2 = 500;
        System.out.println(weightOfSportsman / weight1 + " дней");
        System.out.println(weightOfSportsman / weight2 + " дней");

        //Задание №5
        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;
        int increaseMasha = 67760 * 10 / 1000;
        int increaseDenis = 83690 * 10 / 1000;
        int increaseChristina = 76230 * 10 / 1000;
        int increaseSumMasha = Masha + increaseMasha;
        int increaseSumDenis = Denis + increaseDenis;
        int increaseSumChristina = Christina + increaseChristina;
        int MashaIncome = Masha * 12;
        int DenisIncome = Denis * 12;
        int ChristinaIncome = Christina * 12;
        int MashaIncomeInc = (Masha + increaseMasha) * 12;
        int DenisIncomeInc = (Denis + increaseDenis) * 12;
        int ChristinaIncomeInc = (Christina + increaseChristina) * 12;
        int incomeDifferenceMasha = MashaIncomeInc - MashaIncome;
        int incomeDifferenceDenis = DenisIncomeInc - DenisIncome;
        int incomeDifferenceChristina = ChristinaIncomeInc - ChristinaIncome;
        System.out.println("Маша теперь получает " + MashaIncomeInc + "." + " Годовой доход вырос на " + incomeDifferenceMasha);
        System.out.println("Денис теперь получает " + DenisIncomeInc + "." + " Годовой доход вырос на " + incomeDifferenceDenis);
        System.out.println("Кристина теперь получает " + ChristinaIncomeInc + "." + " Годовой доход вырос на " + incomeDifferenceChristina);
    }


}



