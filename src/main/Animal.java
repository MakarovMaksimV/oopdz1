package main;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Animal {
    protected String nickName;
    protected Owner owner;
   protected LocalDate birthDate;
   protected Illness illness;
   protected String genus;

    public Animal(String nickname, Owner owner,
                  LocalDate birthDate, Illness illness) {
        this.nickName = nickname;
        this.owner = owner;
        this. birthDate = birthDate;
        this.illness = illness;
    }

    public Animal(){this("кличка", new Owner("Хозяин"), LocalDate.now(),new Illness("Болеет"));}
    public String getType() {return getClass().getSimpleName();}
    public String getNickname() {return nickName;}
    public Owner getOwner() {return owner;}
    public LocalDate getBirthDate() {return birthDate;}
    public Illness getIllness() {return illness;}
    public void setIllness(Illness illness) {this.illness = illness;}
    private  void wakeUp(){System.out.println("Животное проснулось");}
    private  void hunt(){System.out.println("Животное охотится");}
    private  void eat(){System.out.println("Животное ест");}
    private  void sleep(){System.out.println("Животное спит");}
    public void lifeCircle() {
        this.wakeUp("14:00");
        this.hunt();
        this.eat();
        this.sleep();
    }

    private  void wakeUp(String time){System.out.println("Животное " + nickName + " проснулось в " + time);}
    public void getGenus() {System.out.println(genus);}
    public void skills() {
        this.toGo();
        this.fly();
        this.swim();
    }

    public void toGo() {System.out.println("Бегу!");}
    public void fly() {System.out.println("Лечу!");}
    public void swim() {System.out.println("Плыву!");}
    @Override
    public String toString() {
        return String.format("Кличка = %s, дата рождения = %s, хозяин = %s, заболевание = %s",nickName,birthDate,
                owner,illness);
    }
}
