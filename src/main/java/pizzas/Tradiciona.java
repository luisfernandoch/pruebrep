package pizzas;

/**
 * Created by luisfer on 23/4/2018.
 */
public class Tradiciona implements Ipizza {
    @Override
    public void preparar() {
        System.out.println("prepara tradicional");
    }

    @Override
    public void cocer() {
        System.out.println("cocinando tradicional");
    }
}
