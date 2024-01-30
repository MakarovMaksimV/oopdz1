package main;

import java.time.LocalDate;

public class Cat extends Animal {
    //Todo
    Double discount;
    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }
    public Cat() {
        this.discount = 10d;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount() {this.discount = discount;}
    public static void meow(){
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return super.toString()+(", скидка на лечение = " + discount);
    }
}
