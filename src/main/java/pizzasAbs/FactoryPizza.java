package pizzasAbs;

/**
 * Created by luisfer on 23/4/2018.
 */
public class FactoryPizza  {
    public static Pizza make(String nombre){
        Pizza pizza=null;
        switch (nombre){
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
