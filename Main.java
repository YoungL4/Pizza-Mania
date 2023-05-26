import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Flush.clearScreen();
    System.out.println(ConsoleColors.WHITE_BACKGROUND + ConsoleColors.YELLOW_BRIGHT + "Make pizzas. t for tutorial, p to play." + ConsoleColors.RESET);
    String start = in.nextLine();
    if (start.equals("t"))
    {
      Tutorial.printTutorial();
      start = in.nextLine();
      if (start.equals("p"))
      {
        Flush.clearScreen();
        System.out.print("Starting.");
        try
      {
      Thread.sleep(500);
      }
      catch(InterruptedException ex)
      {
        Thread.currentThread().interrupt();
      }
        System.out.print(".");
        try
      {
      Thread.sleep(500);
      }
      catch(InterruptedException ex)
      {
        Thread.currentThread().interrupt();
      }
        System.out.println(".");
      }
      else
      {
        throw new java.lang.Error(ConsoleColors.RED + "Terminated. User could not follow simple instructions." + ConsoleColors.RESET);
      }
    }
    else if (start.equals("p"))
    {
      Flush.clearScreen();
      System.out.print("Starting.");
      try
      {
      Thread.sleep(500);
      }
      catch(InterruptedException ex)
      {
        Thread.currentThread().interrupt();
      }
        System.out.print(".");
        try
      {
      Thread.sleep(500);
      }
      catch(InterruptedException ex)
      {
        Thread.currentThread().interrupt();
      }
        System.out.println(".");
      }
    else
    {
      throw new java.lang.Error(ConsoleColors.RED + "Terminated. User could not follow simple instructions." + ConsoleColors.RESET);
    }

    //Game start
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
      Thread.currentThread().interrupt();
    }


    Flush.clearScreen();
    Prompt p = new Prompt();
    ArrayList<String> arr = p.genPrompt();
    ArrayList<String> arr2 = new ArrayList<String>();
    for (int i = 0; i < arr.size(); i++)
    {
      arr2.add(arr.get(i));
    }

    // Have list of everything user should input for current pizza
    // Duplicate list to prevent duplicate inputs
    // If user enters correct action, run through original list and change one of matching actions in both lists to "."
    // If user enters extraneous action, add it to the duplicate list
    // After user enters "x" to confirm, check if duplicate list only contains ".". If yes, the pizza is correct; if there are extraneous actions, the pizza is incorrect

    int lives = 3;
    int score = 0;
    int pizzasMade = 0;
    String action = in.nextLine();
    boolean bakedAtRightTime = true;
    boolean saucedAtRightTime = true;
    boolean cheesedAtRightTime = true;
    boolean addSauce = false;
    boolean cutAtRightTime = true;
    
    //start game
    
    while (lives > 0) // Each loop = One pizza
    {
      addSauce = false;
      for (int i = 0; i < arr.size(); i++)
      {
        if (arr.get(i).equals("t"))
        {
          addSauce = true;
          break;
        }
      }
      while (!action.equals("x")) // Each loop = One input
      {
        
        int found = -1;
        for (int i = 0; i < arr.size(); i++)
        {
          if (!action.equals(".") && action.toLowerCase().equals(arr.get(i)))
          {
            
            found = i;

            if (action.equals("t")) // Checks if user sauced too late
            {
              for (int j = 0; j < arr.size(); j++)
              {
                if (arr.get(j).equals(".")) // "." means user already input something else correctly
                {
                  saucedAtRightTime = false;
                }
              }
            }

            if (action.equals("c")) // Checks if user cheesed after saucing, but before doing anything else
            {
              if (addSauce)
              {
                int periods = 0;
                for (int j = 0; j < arr.size(); j++) // Checks if user already did something else other than sauce
                {
                  if (arr.get(j).equals("."))
                  {
                    periods++;
                  }
                  if (periods > 1)
                  {
                    cheesedAtRightTime = false;
                    break;
                  }
                }
                for (int j = 0; j < arr.size(); j++) // Checks if user sauced before cheesing
                {
                  if (arr.get(j).equals("t"))
                  {
                    cheesedAtRightTime = false;
                    break;
                  }
                }
              }
              else
              {
                for (int j = 0; j < arr.size(); j++) // Checks if user accomplished something else (no sauce = cheese first)
                {
                  if (arr.get(j).equals("."))
                  {
                    cheesedAtRightTime = false;
                    break;
                  }
                }
              }
            }

            if (action.equals("-")) // Checks if user cut prematurely (before putting on all toppings)
            {
              for (int j = 0; j < arr.size(); j++)
              {
                if (!(arr.get(j).equals("b") || arr.get(j).equals("-") || arr.get(j).equals(".")))
                {
                  cutAtRightTime = false;
                }
              }
            }
            
            if (action.equals("b")) // Checks if user baked prematurely
            {
              for (int j = 0; j < arr.size(); j++)
              {
                if (!(arr.get(j).equals("b") || arr.get(j).equals("-") || arr.get(j).equals(".")))
                {
                  bakedAtRightTime = false;
                }
              }
            }
            
            break;
          }
        }
        if (found == -1)
        {
          //action was extraneous
          if (!action.equals("."))
            arr2.add(action);
          else
            arr2.add("wrong");
        }
        else
        {
          //action was correct
          arr.set(found, ".");
          arr2.set(found, ".");
        }

        action = in.nextLine();
      }
      boolean correct = true;
      for (int i = 0; i < arr2.size(); i++)
      {
        if (!arr2.get(i).equals("."))
        {
          correct = false;
          break;
        }
      }
      
      if (!(bakedAtRightTime && cutAtRightTime && saucedAtRightTime && cheesedAtRightTime))
      {
        correct = false;
      }
    
      if (correct)
      {
        score += 10 * arr.size();
        System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD + " Correct! " + ConsoleColors.RESET);
        pizzasMade++;
        try
        {
          Thread.sleep(700);
        }
        catch(InterruptedException ex)
        {
          Thread.currentThread().interrupt();
        }
      }
      else
      {
        lives--;
        System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD + " Wrong. " + ConsoleColors.RESET);
        try
        {
          Thread.sleep(700);
        }
        catch(InterruptedException ex)
        {
          Thread.currentThread().interrupt();
        }
      }

      if (lives < 1)
      {
        break;
      }
      Flush.clearScreen();
      arr = p.genPrompt();
      int temp = arr2.size();
      for (int i = 0; i < temp; i++)
      {
        arr2.remove(0);
      }
      for (int i = 0; i < arr.size(); i++)
      {
        arr2.add(arr.get(i));
      }
      bakedAtRightTime = true;
      cutAtRightTime = true;
      saucedAtRightTime = true;
      cheesedAtRightTime = true;
      action = in.nextLine();
    }
    Flush.clearScreen();
    String plural;
    if (pizzasMade == 1)
    {
      plural = "pizza";
    }
    else
    {
      plural = "pizzas";
    }
    System.out.println("Congratulations, you successfully made " + pizzasMade + " " + plural + ". Your final score is: ");
    System.out.println(score);

    
  }
}