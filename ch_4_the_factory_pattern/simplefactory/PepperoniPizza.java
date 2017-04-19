package simplefactory;

public class PepperoniPizza extends Pizza{
    
    public CheesePizza() {
        name = "Pepperoni Pizza";
        dough = "Stuffed Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzerella");
        toppings.add("Parmesan");
        toppings.add("Pepperoni");
    }

}