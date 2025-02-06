package Bread;

public class Sourdough extends Bread {

    private double SourdoughStarter = 0;

    public Sourdough() {

        super("Sourdough\n",0.0,2.1,4.5,3,2.1,1.5,"Mix the Dough:\n" +
                "\n" +
                "In a large bowl, combine flour and water. Let it rest for 30 minutes (autolyse step).\n" +
                "Add sourdough starter and salt, then mix until combined.\n" +
                "Knead & First Rise (Bulk Fermentation):\n" +
                "\n" +
                "Knead for about 10 minutes or use the stretch and fold method every 30 minutes for 3–4 hours.\n" +
                "Cover and let the dough ferment at room temperature until doubled (4–8 hours, depending on room temp).\n" +
                "Shape & Second Rise:\n" +
                "\n" +
                "Gently shape the dough into a round or oval loaf.\n" +
                "Place in a floured bowl or proofing basket.\n" +
                "Cover and let it rise for overnight (8–12 hours) in the fridge or 1–2 hours at room temp.\n" +
                "Bake the Bread:\n" +
                "\n" +
                "Preheat oven to 475°F (245°C) with a Dutch oven inside.\n" +
                "Place the dough in the hot Dutch oven, score the top, and bake covered for 20 minutes.\n" +
                "Remove lid and bake another 20–25 minutes until golden brown.\n" +
                "Cool & Enjoy!\n" +
                "\n" +
                "Let the bread cool for at least 1 hour before slicing.");
        SourdoughStarter = 2.4;

    }

    public Sourdough(String breadName,double SourdoughStarter, double sugar, double salt, double flour, int water, double yeast, double bakingSoda, String recipe) {
        this.SourdoughStarter = SourdoughStarter;
    }
@Override
        public String toString(){
           return String.format("Ingredients\n %.2f\n of sourdough starter" + super.toString(),SourdoughStarter);

    }
}


