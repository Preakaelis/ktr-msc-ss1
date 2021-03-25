
import sun.security.krb5.internal.rcache.AuthList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PROPRIETAIRE
 */
public class Warrior extends AbsCharacter {

    public Warrior(String name) {
        super(name);
        this.Name = name;
        super.RPGClass = "Warrior";
        super.life = 100;
        super.strength = 10;
        super.agility = 8;
        super.wit = 3;
        System.out.println(this.Name + ": My name will go down in history!");
    }

    @Override
    public String attack(String weapon) {
        if (weapon != "sword" || weapon != "hammer") {
            System.out.println(this.Name + ": Rrrrrrr....");
            System.out.println(this.Name + ": ll crush you with my " + weapon);

        } else {
            System.out.println("it's not a weapon");
        }

        return null;
    }
}
