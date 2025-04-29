/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lorenzo
 */
public class Ave extends Animal {

    @Override
    public void mover() {
        System.out.println("Mover: Voar");
    }

    @Override
    public void produzirSom() {
        System.out.println("Som: Cantar");
    }
}
