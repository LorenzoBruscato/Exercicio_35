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
