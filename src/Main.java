public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 (){
        System.out.println("Задача 1");
        int num1 = -1000000;
        System.out.println(num1);
        byte num2 = 127;
        System.out.println(num2);
        short num3 = 9347;
        System.out.println(num3);
        long num4 = 9876543210L;
        System.out.println(num4);
        float num5 = 1.0000001f;
        System.out.println(num5);
        double num6 = -1.111111111111111;
        System.out.println(num6);

    }
    private static void task2(){
        System.out.println("Задание 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }

    private static void task3(){
        System.out.println("Задание 3");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int sum = class1 + class2 + class3;
        int student = 480 / sum;
        System.out.println("На каждого ученика рассчитано " + student + " листов бумаги");
    }

    private static void task4(){
        System.out.println("Задание 4");
        int time0 = 2;
        int efficiency0 = 16;
        int efficiency = efficiency0 / time0;
        int efficiency1 = 20 * efficiency;
        System.out.println("За 20 минут машина произвела " + efficiency1 + " штук бутылок");
        int time2 = 24 * 60;
        int efficiecy2 = efficiency * time2;
        System.out.println("За сутки машина произвела " + efficiecy2 + " штук бутылок");
        int efficiecy3 = efficiecy2 * 3;
        System.out.println("За 3 дня машина произвела " + efficiecy3 + " штук бутылок");
        int efficiecy4 = efficiecy2 * 30;
        System.out.println("За месяц машина произвела " + efficiecy4 + " штук бутылок");

    }

    private static void task5(){
        System.out.println("Задание 5");
        byte white = 2;
        byte brown = 4;
        byte sum = 120;
        int whiteAndBrown = white + brown;
        int Class = sum / whiteAndBrown;
        int white1 = white * Class;
        int brown1 = brown * Class;
        System.out.println("В школе, где " + Class + " классов нужно " + white1 + " банок белой краски и " + brown1 +" банок коричневой краски");
    }

    private static void task6(){
        System.out.println("Задание 6");
        int babanas = 5 * 80;
        int milk = 2 * 105;
        int icecrem = 2*100;
        int eggs = 4*70;
        int sumG = babanas+milk+icecrem+eggs;
        float sumK = sumG / 1000f;
        System.out.println("Спортзавтрак весит " + sumG + " грамм, или же " + sumK + " килограмм");
    }

    private static void task7(){
        System.out.println("Задание 7");
        int purpose = 7*1000;
        int a = 250;
        int b = 500;
        int purposeA = purpose / a;
        System.out.println("Спортсмену понадобится " + purposeA + " дней, если он будет худеть на 250 грамм в день");
        int purposeB = purpose / b;
        System.out.println("Спортсмену понадобится " + purposeB + " дней, если он будет худеть на 500 грамм в день");
        int purposeC = (purposeA + purposeB) / 2;
        System.out.println("В среднем спортсмену понадобится " + purposeC + " дней для похудения");
    }

    private  static  void task8(){
        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int masha12 = masha * 12;
        int denis12 = denis * 12;
        int kris12 = kris * 12;
        double mashaNew = masha * 1.1;
        double mashaNew12= mashaNew * 12;
        double mashaDiff = mashaNew12 - masha12;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
        double denisNew = denis * 1.1;
        double denisNew12 = denisNew * 12;
        double denisDiff = denisNew12 - denis12;
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
        double krisNew = kris * 1.1;
        double krisNew12 = krisNew * 12;
        double krisDiff = krisNew12 - kris12;
        System.out.println("Кристина теперь получает " + krisNew + " рублей. Годовой доход вырос на " + krisDiff + " рублей");

    }

}