package main;

public class Insect extends Animal {
    public Insect(String genus){this.genus = genus;}
    @Override
    public void swim() {System.out.println(genus + " не умеет плавать!");}
}
