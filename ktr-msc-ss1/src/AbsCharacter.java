/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PROPRIETAIRE
 */
public abstract class AbsCharacter implements Movable{

    String Name;
    String RPGClass;
    int life;
    int agility;
    int strength;
    int wit;

    
    
    //Getter
    public AbsCharacter(String name) {
        name = this.Name;
    }

    public String getName() {
        return Name;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public abstract String attack(String attack);
   
}