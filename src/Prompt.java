import java.util.ArrayList;
import java.lang.Math;

// The Prompt class decides what a pizza will look like. It then sends the information to Sentence.java to actually
//     generate an English sentence for the user.

public class Prompt
{
  private ArrayList<String> top = new ArrayList<String>(); // list of all toppings
  
  
  ArrayList<String> input = new ArrayList<String>(); // first letters only
  ArrayList<String> output = new ArrayList<String>(); // full name ingredient
  String x = "";
  
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
  // every call to this function wipes previous pizza's data and prepares new ones
  public ArrayList<String> genPrompt()
  {
	  input.clear();
	  output.clear();
    // Generate random values
    // Generate overall prompt format
    // Create ArrayList of expected user input
    // Create ArrayList of full topping names to put on pizza
    // Reset top to list of every topping
    
    
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

    for (int i = 0; i < topAmount; i++)
    {
      int temp = (int)(Math.random() * top.size()); // pick random topping
      
      output.add(top.get(temp)); // full ingredient names
      input.add(top.remove(temp).substring(0, 1)); // first letters only
    }

    x = "";
    x += Sentence.genSentence(output, structure); // turn full names of ingredients into actual English sentence
    x += " ";
    x += Sentence.genAddOn(sauce, cheese, cuts, doneness, input); // miscellaneous requests unrelated to toppings

    // reset list of toppings
    top.clear();
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
    //System.out.println(x);
    return input;
  }
  
  public ArrayList<String> getInput() {
	  return input;
  }
  
  public String getSentence() {
	  return x;
  }
  
  
}