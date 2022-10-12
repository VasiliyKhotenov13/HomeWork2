public class Main {
    public static void main(String[] args) {

        //задание 1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //задание 2
        var dog1 = dog + 4;
        System.out.println(dog1);
        var cat1 = cat + 4;
        System.out.println(cat1);
        var paper1 = paper + 4;
        System.out.println(paper1);

        //задание 3
        var dog2 = dog1 - 3.5;
        var cat2 = cat1 - 1.6;
        var paper2 = paper1 - 7639;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        //задание 4
        var friends = 19;
        System.out.println(friends);
        var friends1 = 19 + 2;
        System.out.println(friends1);
        var friends2 = friends1 / 7;
        System.out.println(friends2);

        //задание 5
        var frog = 3.5;
        System.out.println(frog);
        var frog1 = frog * 10;
        System.out.println(frog1);
        var frog2 = frog1 / 3.5;
        System.out.println(frog2);
        var frog3 = frog2 + 4;
        System.out.println(frog3);

        //задание 6
        var vesBoxer1 = 78.2;
        var vesBoxer2 = 82.7;
        System.out.println("Вес первого боксёра = " + vesBoxer1 + " кг!");
        System.out.println("Вес второго боксёра = " + vesBoxer2 + "кг!");
        var obshiyVes = vesBoxer1 + vesBoxer2;
        System.out.println("Общий вес двух бойцов = " + obshiyVes + "кг!");
        var vesRazn = vesBoxer2 - vesBoxer1;
        System.out.println("Разница в весе двух бойцов = " + vesRazn + "кг!");


        //задача 7
        var vesRazn1 = vesBoxer2 - vesBoxer1;
        System.out.println("Разница в весе двух бойцов = " + vesRazn1 + "кг! (способ вычитания)");
        var vesRazn2 = vesBoxer2 % vesBoxer1;
        System.out.println("Разница в весе двух бойцов = " + vesRazn2 + "кг! (способ функции остатка от деления)");

        //задание 8
        var workHours = 640;
        var workTime = 8;
        var rab = workHours / workTime;
        System.out.println("Всего в компании работает " + rab + " человек.");
        var rabPlus = rab + 94;
        var workTime2 = workHours / rabPlus;
        var workHoursPlus = workTime * rabPlus;
        System.out.println("Если в компание работет " + rabPlus + " человек, то всего по " + workTime2 + " часа должно быть распределено между сотрундниками!");
        System.out.println("Если каждый сотрудник должен работать по " + workTime + " часов, тогда всего должно быть " + workHoursPlus + " часов на " + rabPlus + " работников!" );




    }
}