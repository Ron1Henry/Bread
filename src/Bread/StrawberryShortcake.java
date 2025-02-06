package Bread;

public class StrawberryShortcake extends Bread {
    private int strawberry;
    private int milk;
    private int vanilla;

    public StrawberryShortcake(){
        super("StrawberryShortcake",12.2,2.3,4.1,3,0,1,"Prepare the Strawberries:\n" +
                "\n" +
                "In a bowl, mix sliced strawberries with 1/4 cup sugar. Let sit for at least 15 minutes to release juices.\n" +
                "Make the Shortcake:\n" +
                "\n" +
                "Preheat oven to 425°F (220°C).\n" +
                "In a large bowl, mix flour, sugar, baking powder, and salt.\n" +
                "Cut in butter using a pastry cutter or fork until mixture resembles coarse crumbs.\n" +
                "Add milk and vanilla, stirring until just combined.\n" +
                "Drop spoonfuls of dough onto a baking sheet or shape into biscuits.\n" +
                "Bake for 12-15 minutes or until golden brown. Cool slightly.\n" +
                "Make Whipped Cream:\n" +
                "\n" +
                "Beat heavy cream, powdered sugar, and vanilla until soft peaks form.\n" +
                "Assemble:\n" +
                "\n" +
                "Slice shortcakes in half.\n" +
                "Layer with strawberries and whipped cream.\n" +
                "Place the top half of the shortcake on and add more whipped cream & strawberries.");
        strawberry =4;
        milk = 2;
        vanilla = 1;
    }
    public StrawberryShortcake(String breadName,double sugar,int milk,int vanilla,int strawberry,double salt,double flour, int water, int bakingSoda, String recipe){
        this.strawberry = strawberry;
        this.milk = milk;
        this.vanilla = vanilla;
    }
    @Override
    public String toString(){

        return String.format("Ingredients\n %d Strawberries \n %d cups of milk \n %d teaspoons of vanilla \n " + super.toString(),strawberry,milk,vanilla);
    }
}
