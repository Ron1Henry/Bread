The superclass Bread is what holds the basic information the can be used to make a simple bread and the sub classes is where the fun happens.
I put the unique items that make that type of bread different from just plain for example MatchaBread has class uses matcha so I added
it by first making the object private double Matcha; then I made the constructor with the information from the superclass by using the keyword
super() and adding my attributes. After I set values and make another constructor this time including my new information. After I made my toString
where I called the toString method from the superclass but I use @Override so I can make alterations that would print out. with this, I added the matcha
to the print statement. This idea was repeated several times for the other sub-class until the main method where I made a new object that class from the
Super and sub classes for example Bread "name" = new MatchaBread();
from this, I can print out any attributes I want in this case the ingredients plus the recipe.