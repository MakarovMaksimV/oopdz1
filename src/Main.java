import main.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String [] args)
    {
//        Animal cat = new Animal("Филипп", new Owner("Maksim"),
//                LocalDate.of(2021, 10,05),new Illness("Перелом"));
//        System.out.println(cat.getNickname());
//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickname());
//        System.out.println(cat.getIllness());
//        cat.setIllness(new Illness("Здоров"));
//        System.out.println(cat.getIllness());
//        Animal test = new Animal();
//        System.out.println(test.getNickname());
//        cat.lifeCircle();
//        System.out.println(cat.getType());
//        System.out.println(cat);
//
//        Animal caty = new Cat();
//        System.out.println(caty.getType());
//        System.out.println(caty);
//        Dog goodboy = new Dog("Купер", new Owner("Ксюша"),LocalDate.of(2022,11,07),new Illness("Болит лапка"));
//        System.out.println(goodboy.getType());
//        System.out.println(goodboy);
//        Cat.meow();
//
//        List<Animal> animal = new ArrayList<>();
//        animal.add(caty);
//        animal.add(goodboy);
//        animal.add(cat);
//        for (int i = 0; i< animal.size(); i++) {System.out.println(animal.get(i));}

        System.out.println();
        System.out.println("Домашнее задание");
        System.out.println();
        Animal fish = new Fish("Акула");
        fish.getGenus();
        fish.skills();
        System.out.println();

        Animal bird = new Bird("Страус");
        bird.getGenus();
        bird.skills();
        System.out.println();

        Animal bird2 = new Bird("Орёл");
        bird2.getGenus();
        bird2.skills();
        System.out.println();

        Animal insect = new Insect("Майский жук");
        insect.getGenus();
        insect.skills();
        System.out.println();
    }
}
