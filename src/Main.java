public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var box = 7;
        System.out.println(box);
        //Задание 1
            //Целочисленные
        byte mobilephone = 2;
        short clothes =2;
        int car = 3;
        long glass = 4L;
            //С плавающей точкой
        float money = 2.500F;
        double apple = 1.5;
        char bar = 38;
        boolean mobilephoneisamount = mobilephone > 1;
            //Задание 2
            //через переменную флоат
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightAllBoxers = boxer1 + boxer2;
        float weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightAllBoxers + " кг");
        System.out.println("Разница в весе " + weightDifference + " кг");
            //Через переменную дабл
        double Boxer1 = 78.2;
        double Boxer2 = 82.7;
        double WeightAllBoxers = Boxer1 + Boxer2;
        double WeightDifference = Boxer2 - Boxer1;
        System.out.println("Общий вес боксеров " + WeightAllBoxers + " кг");
        System.out.println("Разница в весе " + WeightDifference + " кг");
            //Задание 3
                ///рецепт
        short banana = 5;
        short milk = 200;
        short icecream = 2;
        short eggs = 4;
                //колл-во грамм в каждом продукте
        short bananagramm = 80;
        double milkgramm = 200/105;
        short icecramgramm = 100;
        short eggsgramm = 70;
                //массе рецепта в граммах
        int weightbanana = banana * bananagramm;
        double weightmilk = milk * milkgramm;
        int weighticecream = icecream * icecramgramm;
        int weighteggs = eggs * eggsgramm;
        System.out.println("Вес бананов " + weightbanana + " грамм");
        System.out.println("Вес молока " + weightmilk + " грамм");
        System.out.println("Вес мороженного " + weighticecream + " грамм");
        System.out.println("Вес яиц " + weighteggs + " грамм");
                //переводим в килограммы
        float grammtokilobanan = weightbanana / 1000f;
        double grammtokilomilk = weightmilk / 1000;
        float grammtokiloice = weighticecream /1000f;
        float grammtokiloeggs = weighteggs / 1000f;
        System.out.println("Вес бананов " + grammtokilobanan + " кг");
        System.out.println("Вес молока " + grammtokilomilk + " кг");
        System.out.println("Вес мороженного " + grammtokiloice + " кг");
        System.out.println("Вес яиц " + grammtokiloeggs + " кг");


                //Задание 4
                //дано
        int weightloss = 7;
        int weightloss1 = 250;
        int weightloss2 = 500;
                //Решение
        float weightlost250 = weightloss1 / 1000f;
        float weightlost500 = weightloss2 / 1000f;
        double weightinday250 = weightloss / weightlost250;
        double weightinday500 = weightloss / weightlost500;

        System.out.println("Спортсмен сбросит вес при диете в 250 грамм за " + weightinday250 + " дней");
        System.out.println("Спортсмен сбросит вес при диете в 500 грамм за " + weightinday500 + " дней");

                //дней в среднем для похудения
       int day1 = 28;
       int day2 = 14;
       int average = day1 + day2;
       int averagetotal = average / 2;
        System.out.println("Среднее количество дней за которое спортсмен сбросит вес " + averagetotal);


                //задание 5
        int zpmasha = 67_760;
        int zpdenis = 83_690;
        int zpkris = 76_230;
            // прибавка в 10%
        double pluszpmasha = zpmasha * 0.1;
        double pluszpdenis = zpdenis * 0.1;
        double pluszpkris = zpkris * 0.1;

        double newzpmasha = zpmasha + pluszpmasha;
        double newzpdenis = zpdenis + pluszpdenis;
        double newzpkris = zpkris + pluszpkris;

        System.out.println("Маша теперь поулчает " +newzpmasha + " рублей");
        System.out.println("Денис теперь получает " +newzpdenis + " рублей");
        System.out.println("Кристина теперь получает " +newzpkris + " рублей");

                //Годовой доход вырос

        System.out.println("Годовой доход Маши вырос на " + pluszpmasha + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + pluszpdenis + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + pluszpkris + " рублей");







    }
}