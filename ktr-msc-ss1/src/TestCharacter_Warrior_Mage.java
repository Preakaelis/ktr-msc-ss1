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
        
        warrior.attack("hammer");
        mage.attack("magic");
    }
    
}
