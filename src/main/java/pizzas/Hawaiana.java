package pizzas;

/**
 * Created by luisfer on 23/4/2018.
 */
public class Hawaiana implements Ipizza {
    @Override
    public void cocer() {
        System.out.println("cocina hawaiana");
    }

    @Override
    public void preparar() {
        System.out.println("prepara hawaiana");
    }
}
