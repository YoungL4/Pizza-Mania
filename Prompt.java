import java.util.ArrayList;
import java.lang.Math;

public class Prompt
{
  private ArrayList<String> top = new ArrayList<String>();
  
  //added after
  private int topAmount, structure, sauce, cheese, cuts, doneness;

  public Prompt()
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
  
  public ArrayList<String> genPrompt()
  {
    // Generate random values
    // Generate overall prompt format
    // Create ArrayList of expected user input
    // Create ArrayList of full topping names to put on pizza
    // Reset top to list of every topping
    ArrayList<String> input = new ArrayList<String>();
    ArrayList<String> output = new ArrayList<String>();
    
    topAmount = (int)(Math.random() * 5) + 1;
    structure = (int)(Math.random() * 10);

    //added after
    //chance to ask for no sauce
    sauce = (int)(Math.random() * 5);

    //chance to ask for no cheese
    cheese = (int)(Math.random() * 5);

    //
    cuts = (int)(Math.random() * 10);
    doneness = (int)(Math.random() * 20);
    String prompt = "";

    for (int i = 0; i < topAmount; i++)
    {
      int x = (int)(Math.random() * top.size());
      output.add(top.get(x));
      input.add(top.remove(x).substring(0, 1));
    }

    String x = "";
    x += Sentence.genSentence(output, structure);
    x += " ";
    x += Sentence.genAddOn(sauce, cheese, cuts, doneness, input);
    int temp = top.size();
    for (int i = 0; i < temp; i++)
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