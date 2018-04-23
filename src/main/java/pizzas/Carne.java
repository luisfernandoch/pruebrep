package pizzas;

/**
 * Created by luisfer on 23/4/2018.
 */
public class Carne implements Ipizza {
    @Override
    public void cocer() {
        System.out.println("cocina Carnivora");
    }

    @Override
    public void preparar() {
        System.out.println("prepara Carnivora");
    }
}
