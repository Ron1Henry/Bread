package Bread;

public class Bread {
    private String breadName;
    private boolean isBaked;
    private double sugar;
    private double salt;
    private double flour;
    private int water;
    private double yeast;
    private double bakingSoda;
    private String recipe;

    public Bread(){
        this.isBaked = false;
        this.sugar = 1.0;
        this.salt = 1.0;
        this.flour = 1.0;
        this.water = 1;
        this.yeast = 1.0;
        this.bakingSoda = 1.0;
        this.breadName = "Plain Bread";
        this.recipe = "recipe";


    }
    public Bread(String breadName, double sugar, double salt, double flour, int water , double yeast, double bakingSoda, String recipe){
        this.breadName = breadName;
        this.sugar = sugar;
        this.salt = salt;
        this.flour = flour;
        this.water = water;
        this.isBaked = isBaked;
        this.breadName = breadName;
        this.yeast = yeast;
        this.bakingSoda = bakingSoda;
        this.recipe = recipe;
    }



    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public boolean isBaked() {
        return isBaked;
    }

    public void setBaked(boolean baked) {
        isBaked = baked;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public double getBakingSoda() {
        return bakingSoda;
    }

    public void setBakingSoda(double bakingSoda) {
        this.bakingSoda = bakingSoda;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }
    public String getRecipe(){
        return recipe;
    }
    public void setRecipe(String recipe){
        this.recipe = recipe;
    }

    public String getIngredients(){
        return String.format("%.2f cups of flour\n%d cups of water\n%.2f table spoons\n" +
                " %.2f tablespoons of sugar\n%.2f teaspoons\n%.2f tea spoons",flour,water,salt, sugar, bakingSoda, yeast);
    }
    public boolean Baked(boolean isBaked) {
        this.isBaked = isBaked;
        if (this.isBaked) {
            System.out.println("Cant bake "+breadName + " is Baked");
            return true;

        } else {
            System.out.println(breadName + " is not Baked");
            return false;
        }
    }

    public String toString() {
        return String.format("%s\n%s\n%s", breadName, getIngredients(), recipe);
    }

}

