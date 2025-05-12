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
        Animal c = new Cachorro();
        Animal a = new Ave();
        System.out.println("Cachorro:");
        c.mover();
        c.produzirSom();

        System.out.println("\nAve:");
        a.mover();
        a.produzirSom();
    }
}
