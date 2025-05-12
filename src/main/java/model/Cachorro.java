package model;

/**
 *
 * @author Lorenzo
 */
public class Cachorro extends Animal {

    @Override
    public void mover() {
        System.out.println("Mover: Andar");

    }

    @Override
    public void produzirSom() {
        System.out.println("Som: Latir");
    }
}
