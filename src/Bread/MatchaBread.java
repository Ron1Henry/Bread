package Bread;

public class MatchaBread extends Bread {
    private double Matcha;

    public MatchaBread(){
        super ("MatchaBread", 1.5,.2,3.5,2,1,1.2,"Preheat oven to 350°F (175°C). Grease a loaf pan.\n" +
                "Mix dry ingredients – In a bowl, whisk flour, matcha, sugar, baking powder, and salt.\n" +
                "Mix wet ingredients – In another bowl, whisk milk, egg, and melted butter.\n" +
                "Combine – Pour wet ingredients into dry ingredients. Stir until just combined (don’t overmix).\n" +
                "Bake – Pour batter into the loaf pan and bake for 30-35 minutes.\n" +
                "Cool & Enjoy – Let cool before slicing.");
        Matcha = 4.2;
    }
    public MatchaBread(String breadName, double sugar,double salt, double Matcha, double flour, int water,double yeast, double bakingSoda,String recipe){
        this.Matcha = Matcha;
    }
    @Override
    public String toString(){
        return String.format("Ingredients\n %d\n teaspoons of Matcha " + super.toString(),Matcha);

    }
}
