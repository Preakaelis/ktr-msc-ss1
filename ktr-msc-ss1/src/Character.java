/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PROPRIETAIRE
 */
public class Character extends AbsCharacter {

    public Character(String name) {
        super(name);
        this.Name = name;
        super.RPGClass = "Character";
        super.life = 50;
        super.strength = 2;
        super.agility = 2;
        super.wit = 2;
        System.out.println(this.Name + ": My name will go down in history !");
    }

    @Override
    public String attack(String word) {
        System.out.println(this.Name+" : Rrrrrrr....");

        return null;
    }

    @Override
    public void moveRight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveLeft() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveForward() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
