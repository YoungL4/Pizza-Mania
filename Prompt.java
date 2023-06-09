import java.util.ArrayList;
import java.lang.Math;

public class Prompt
{
  private ArrayList<String> top = new ArrayList<String>();
  
  //added after
  private int topAmount, structure, sauce, cheese, cuts, doneness;

  public Prompt()  // hi
  {
    top.add("pepperoni");
    top.add("sausage");
    top.add("mushroom");
    top.add("onion");
    top.add("green pepper");
    top.add("anchovy");
    top.add("egg");
    top.add("ham");
    top.add("jalapeño");
    top.add("kimchi");
    top.add("lamb");
    top.add("zucchini");
  }

  // returns arraylist of initials of toppings to be added for this pizza
  public ArrayList<String> genPrompt()
  {
    // Generate random values
    // Generate overall prompt format
    // Create ArrayList of expected user input
    // Create ArrayList of full topping names to put on pizza
    // Reset top to list of every topping
    ArrayList<String> input = new ArrayList<String>(); // first letters only
    ArrayList<String> output = new ArrayList<String>(); // full name ingredient
    
    topAmount = (int)(Math.random() * 5) + 1;
    structure = (int)(Math.random() * 10);

    //added after
    //chance to ask for no sauce
    sauce = (int)(Math.random() * 5);

    //chance to ask for no cheese
    cheese = (int)(Math.random() * 5);

    //chance to ask for abnormal cuts
    cuts = (int)(Math.random() * 10);

    //chance to ask for different doneness
    doneness = (int)(Math.random() * 20);
    String prompt = "";

    for (int i = 0; i < topAmount; i++)
    {
      int x = (int)(Math.random() * top.size()); // pick random topping
      
      output.add(top.get(x)); // full ingredient names
      input.add(top.remove(x).substring(0, 1)); // first letters only
    }

    String x = "";
    x += Sentence.genSentence(output, structure); // turn full names of ingredients into actual English sentence
    x += " ";
    x += Sentence.genAddOn(sauce, cheese, cuts, doneness, input); // miscellaneous requests unrelated to toppings

    // reset list of toppings
    for (int i = 0; i < top.size(); i++)
    {
      top.remove(0);
    }
    top.add("pepperoni");
    top.add("sausage");
    top.add("mushroom");
    top.add("onion");
    top.add("green pepper");
    top.add("anchovy");
    top.add("egg");
    top.add("ham");
    top.add("japapeño");
    top.add("kimchi");
    top.add("lamb");
    top.add("zucchini");
    System.out.println(x);
    return input;
  }
}