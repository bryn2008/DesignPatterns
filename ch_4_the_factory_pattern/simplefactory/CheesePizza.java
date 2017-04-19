package simplefactory;

public class CheesePizza extends Pizza{
    
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzerella");
        toppings.add("Parmesan");
    }

}