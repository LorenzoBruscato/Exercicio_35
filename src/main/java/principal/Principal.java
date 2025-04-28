/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import model.Ave;
import model.Cachorro;
import model.Animal;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    public static void main(String[] args) {
        Animal c1 = new Cachorro();
        Animal a1 = new Ave();

        System.out.println("Cachorro:");
        c1.mover();
        c1.produzirSom();

        System.out.println("\nAve:");
        a1.mover();
        a1.produzirSom();
    }
}
