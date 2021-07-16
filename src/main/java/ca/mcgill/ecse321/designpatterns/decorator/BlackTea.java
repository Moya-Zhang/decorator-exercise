package ca.mcgill.ecse321.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class BlackTea implements HotBeverage {
    @Override
    public double getCost() {
        return 3.00;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<String>();
        ingredients.add("Tea");

        return ingredients;
    }

}
