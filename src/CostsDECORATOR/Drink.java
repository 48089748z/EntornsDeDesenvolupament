package CostsDECORATOR;
import CostsDECORATOR.Ingredients.Ingredients;
import java.util.ArrayList;
public class Drink
{
    Double cost= 0.0;
    String desc = "\n\nTHIS DRINK CONTAINS\n";
    public ArrayList<Ingredients> ingredients = new ArrayList<>();
    public Drink(){}
    public void cost()
    {
        for (Ingredients ingredient : ingredients) {cost += ingredient.price;}
        System.out.println("PRICE: "+cost+"€");
    }
    public void desc()
    {
        for (Ingredients ingredient : ingredients) {desc += ingredient.name+", ";}
        System.out.println(desc);
    }
}
