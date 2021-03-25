/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PROPRIETAIRE
 */
public class Mage extends AbsCharacter {

    public Mage(String name) {
        super(name);
        this.Name = name;
        super.RPGClass = "Mage";
        super.life = 100;
        super.strength = 10;
        super.agility = 8;
        super.wit = 3;
        System.out.println(this.Name + ": May the gods be with me .");
    }

    @Override
    public String attack(String weapon) {

        if (weapon == "magic" || weapon == "wand") {
            System.out.println(this.Name + " : Rrrrrrr....");
            System.out.println(this.Name + ": ll crush you with my " + weapon);
        } else {
            System.out.println("it's not a weapon");
        }

        return null;
    }

    @Override
    public void moveRight() {
        System.out.println(this.Name + ": move right furtively .");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.Name + ": move left furtively .");
    }

    @Override
    public void moveForward() {
        System.out.println(this.Name + ": move forward furtively .");
    }

    @Override
    public void moveBack() {
        System.out.println(this.Name + ": move back furtively .");
    }
}
