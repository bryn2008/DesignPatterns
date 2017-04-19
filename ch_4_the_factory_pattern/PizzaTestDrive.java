import simplefactory.*;

public class PizzaTestDrive {

    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        // PizzaStore store = new PizzaStore();
        PizzaStore store = factory.createPizza("cheese");

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("You ordered a " + pizza.getName() + "\n");
        
         
    }

}