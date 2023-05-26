import java.util.ArrayList;



public class Sentence
{
  /*
  *@param list of toppings
  *@param prompt format
  *@return part of entire prompt, excluding cuts, doneness
  *
  *
  */
  public static String genSentence(ArrayList<String> arr, int p)
  {
    String y = "";
    if (p == 0)
    {
      y += "I want a pizza with";
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
        y += ",";
      }
      if (arr.size() > 1)
      y += " and";
      y += " " + arr.get(arr.size() - 1) + ".";
    }
    else if (p == 1)
    {
      String a;
      if (arr.get(0).substring(0, 1).equals("a") || arr.get(0).substring(0, 1).equals("o") || arr.get(0).substring(0, 1).equals("e"))
      {
        a = "an";
      }
      else
      {
        a = "a";
      }
      y += "Give me " + a;

      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
        y += ",";
      }
      if (arr.size() > 1)
      y += " and";
      y += " " + arr.get(arr.size() - 1) + " pizza.";
    }
    else if (p == 2)
    {
      y += "Hi, umm... can I get a pizza with";
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
        y += ",";
      }
      if (arr.size() > 1)
      y += " and";
      y += " " + arr.get(arr.size() - 1) + "?";
    }
    else if (p == 3)
    {
      y += "One";
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
        y += ",";
      }
      if (arr.size() > 1)
      y += " and";
      y += " " + arr.get(arr.size() - 1) + " pizza. Hurry up.";
    }
    else if (p == 4)
    {
      y += "Do you have";
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
        y += ",";
      }
      if (arr.size() > 1)
      y += " and";
      y += " " + arr.get(arr.size() - 1) + "?";
    }
    else if (p == 5)
    {
      String a;
      if (arr.get(0).substring(0, 1).equals("a") || arr.get(0).substring(0, 1).equals("o") || arr.get(0).substring(0, 1).equals("e"))
      {
        a = "an";
      }
      else
      {
        a = "a";
      }
      y += "I'm feeling like " + a;
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
        y += ",";
      }
      if (arr.size() > 1)
      y += " and";
      y += " " + arr.get(arr.size() - 1) + " pizza right now.";
    }
    else if (p == 6)
    {
      String a;
      if (arr.get(0).substring(0, 1).equals("a") || arr.get(0).substring(0, 1).equals("o") || arr.get(0).substring(0, 1).equals("e"))
      {
        a = "an";
      }
      else
      {
        a = "a";
      }
      y += "Hi, I would like " + a;
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
          y += ",";
      }
      if (arr.size() > 1)
        y += " and";
      y += " " + arr.get(arr.size() - 1) + " pizza, please.";
    }
    else if (p == 7)
    {
      y += "I couldn't find a place with";
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
        {
          y += ",";
        }
      }
      if (arr.size() > 1)
        y += " and";
      y += " " + arr.get(arr.size() - 1) + " pizza. Do you guys have it here?";
    }
    else if (p == 8)
    {
      y += "Show me your best";
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
          y += ",";
      }
      if (arr.size() > 1)
        y += " and";
      y += " " + arr.get(arr.size() - 1) + " pizza. Don't disappoint me.";
    }
    else if (p == 9)
    {
      y += "I heard";
      for (int i = 0; i < arr.size() - 1; i++)
      {
        y += " " + arr.get(i);
        if (arr.size() > 2)
        {
          y += ",";
        }
      }
      if (arr.size() > 1)
        y += " and";
      String g = " go";
      if (arr.size() == 1)
        g = " goes";
      y += " " + arr.get(arr.size() - 1) + g + " well on pizza.";
    }
    return y;
  }

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