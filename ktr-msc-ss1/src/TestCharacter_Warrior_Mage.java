/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PROPRIETAIRE
 */
public class TestCharacter_Warrior_Mage {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Jean-Luc");
        Mage mage = new Mage("Robert");

        System.out.println("----TEST WEAPON----");
        //TEST Weapon
        warrior.attack("hammer");
        mage.attack("magic");

        System.out.println("----TEST MOVE----");
        //TEST Move
        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveBack();
        warrior.moveForward();

        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();
    }

}
