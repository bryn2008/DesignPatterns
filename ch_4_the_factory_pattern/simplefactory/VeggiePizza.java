package simplefactory;

public class VeggiePizza extends Pizza{
    
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzerella");
        toppings.add("Parmesan");
        toppings.add("Rocket Lettuce");
        toppings.add("Oregano");
        toppings.add("Peppers");
        toppings.add("Olives");
        toppings.add("Mushrooms");
    }

}