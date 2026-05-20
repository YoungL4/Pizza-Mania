import java.util.ArrayList;



public class Sentence
{
  /*
  *@param list of toppings
  *@param prompt format
  *@return part of entire prompt, excludes cuts, doneness, sauce?, cheese?
  *
  *
  */

  public static String genSentence(ArrayList<String> toppings, int sentenceStructure)
  {
    
    String y = ""; // will contain final result
    
    if (sentenceStructure == 0)
    {
      y += "I want a pizza with";
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
        y += ",";
      }
      if (toppings.size() > 1)
      y += " and";
      y += " " + toppings.get(toppings.size() - 1) + ".";
    }
    else if (sentenceStructure == 1)
    {
      String a;
      if (toppings.get(0).substring(0, 1).equals("a") || toppings.get(0).substring(0, 1).equals("o") || toppings.get(0).substring(0, 1).equals("e"))
      {
        a = "an";
      }
      else
      {
        a = "a";
      }
      y += "Give me " + a;

      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
        y += ",";
      }
      if (toppings.size() > 1)
      y += " and";
      y += " " + toppings.get(toppings.size() - 1) + " pizza.";
    }
    else if (sentenceStructure == 2)
    {
      y += "Hi, umm... can I get a pizza with";
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
        y += ",";
      }
      if (toppings.size() > 1)
      y += " and";
      y += " " + toppings.get(toppings.size() - 1) + "?";
    }
    else if (sentenceStructure == 3)
    {
      y += "One";
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
        y += ",";
      }
      if (toppings.size() > 1)
      y += " and";
      y += " " + toppings.get(toppings.size() - 1) + " pizza. Hurry up.";
    }
    else if (sentenceStructure == 4)
    {
      y += "Do you have";
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
        y += ",";
      }
      if (toppings.size() > 1)
      y += " and";
      y += " " + toppings.get(toppings.size() - 1) + "?";
    }
    else if (sentenceStructure == 5)
    {
      String a;
      if (toppings.get(0).substring(0, 1).equals("a") || toppings.get(0).substring(0, 1).equals("o") || toppings.get(0).substring(0, 1).equals("e"))
      {
        a = "an";
      }
      else
      {
        a = "a";
      }
      y += "I'm feeling like " + a;
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
        y += ",";
      }
      if (toppings.size() > 1)
      y += " and";
      y += " " + toppings.get(toppings.size() - 1) + " pizza right now.";
    }
    else if (sentenceStructure == 6)
    {
      String a;
      if (toppings.get(0).substring(0, 1).equals("a") || toppings.get(0).substring(0, 1).equals("o") || toppings.get(0).substring(0, 1).equals("e"))
      {
        a = "an";
      }
      else
      {
        a = "a";
      }
      y += "Hi, I would like " + a;
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
          y += ",";
      }
      if (toppings.size() > 1)
        y += " and";
      y += " " + toppings.get(toppings.size() - 1) + " pizza, please.";
    }
    else if (sentenceStructure == 7)
    {
      y += "I couldn't find a place with";
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
        {
          y += ",";
        }
      }
      if (toppings.size() > 1)
        y += " and";
      y += " " + toppings.get(toppings.size() - 1) + " pizza. Do you guys have it here?";
    }
    else if (sentenceStructure == 8)
    {
      y += "Show me your best";
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
          y += ",";
      }
      if (toppings.size() > 1)
        y += " and";
      y += " " + toppings.get(toppings.size() - 1) + " pizza. Don't disappoint me.";
    }
    else if (sentenceStructure == 9)
    {
      y += "I heard";
      for (int i = 0; i < toppings.size() - 1; i++)
      {
        y += " " + toppings.get(i);
        if (toppings.size() > 2)
        {
          y += ",";
        }
      }
      if (toppings.size() > 1)
        y += " and";
      String g = " go";
      if (toppings.size() == 1)
        g = " goes";
      y += " " + toppings.get(toppings.size() - 1) + g + " well on pizza.";
    }
    return y;
  }

  // produce miscellaneous requests, y contains final result
  /*
   * @param random number, has a chance of being 4
   * @param random number, has a chance of being 4
   * @param random number, has a chance of being 0, 1, 2, 3, 4
   * @param random number, has a chance of being 12 ~ 18, 19, 20
   * @param array that came from Prompt, changed to contain extra characters the player has to input
   * 
   *
   */
  public static String genAddOn(int sauce, int cheese, int cuts, int bake, ArrayList<String> arr)
  {
    String y = "";
    if (sauce == 4)
    {
      y += "No sauce. ";
    }
    else
      arr.add("t");
    if (cheese == 4)
      y += "No cheese. ";
    else
      arr.add("c");
    if (cuts <= 1)
      y += "Don't cut it. ";
    else if (cuts == 2)
    {
      y += "Cut into quarters. ";
      arr.add("-");
      arr.add("-");
    }
    else if (cuts == 3)
    {
      y += "8 slices. ";
      arr.add("-");
      arr.add("-");
      arr.add("-");
      arr.add("-");
    }
    else if (cuts == 4)
    {
      y += "Cut it in half. ";
      arr.add("-");
    }
    else
    {
      arr.add("-");
      arr.add("-");
      arr.add("-");
    }
    if (bake > 12 && bake < 19)
    {
      y += "Dark crust. ";
      arr.add("b");
      arr.add("b");
    }
    else if (bake == 19)
    {
      y += "I want it burnt. ";
      arr.add("b");
      arr.add("b");
      arr.add("b");
    }
    
    else if (bake >= 0 && bake <= 1)
    {
      y += "Leave it raw.";
    }
    
    else
    {
      arr.add("b");
    }

    return y;
  }
}