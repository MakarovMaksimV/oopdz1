package main;

public class Fish extends Animal {

    public Fish(String genus){this.genus = genus;}
    @Override
    public void toGo() {System.out.println(genus + " не умеет бегать!");}
    @Override
    public void fly() {System.out.println(genus + " не умеет летать!");}

}
