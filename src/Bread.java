/**
 * class: Bread.java
 *  Ron Henry
 *  Class: 2150
 * 1/23/2025
 */

public class Bread {
    //flour, sugar, eggs
    private boolean glutenFree;
    private Ingredients ingredients = new Ingredients();
    private Recipe recipeBread = new Recipe();

    public Bread() {

    }
    public Bread(boolean glutenFree, Ingredients ingredients) {
        this.glutenFree = glutenFree;
        this.ingredients = ingredients;
    }

    public Bread(boolean glutenFree, Ingredients ingredients, Recipe recipeBread) {
        this.glutenFree = glutenFree;
        this.ingredients = ingredients;
        this.recipeBread = recipeBread;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }
    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
    public Ingredients getIngredients() {
        return ingredients;
    }
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe getRecipeBread() {
        return recipeBread;
    }

    public void setRecipeBread(Recipe recipeBread) {
        this.recipeBread = recipeBread;
    }

public String toString() {
        recipeBread.recipe();
        return "Basic Bread: \n"+ ingredients + "\n";
    }
}
