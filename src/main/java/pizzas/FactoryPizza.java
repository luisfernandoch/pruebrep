package pizzas;

/**
 * Created by luisfer on 23/4/2018.
 */
public class FactoryPizza {

    public static Ipizza make(String nombreDePizza){
        Ipizza pizza=null;
        switch (nombreDePizza){
            case "carne":
                pizza=new Carne();
                break;
            case "hawaiana":
                pizza=new Hawaiana();
                break;
            case "tradicional":
                pizza=new Tradiciona();
                break;
        }
        return  pizza;
    }
}
