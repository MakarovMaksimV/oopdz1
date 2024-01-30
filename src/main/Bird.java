package main;

public class Bird extends Animal{
    public Bird(String genus){
        this.genus = genus;
    }
    @Override
    public void swim() {System.out.println("Плыву!");}
    @Override
    public void fly() {
        if(genus == "Страус") {System.out.println(genus + " хоть и птица, но летать не умеет");}
        else {super.fly();}
    }
}
