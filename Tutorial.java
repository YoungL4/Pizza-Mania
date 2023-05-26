import java.util.concurrent.TimeUnit;
public class Tutorial
{
  public Tutorial ()
  {
    
  }

  public static void printTutorial()
  {
    Flush.clearScreen();
    System.out.println("Make pizzas based on the customer's request.");
    try
    {
      Thread.sleep(2000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }

    System.out.println("");
    
System.out.println(ConsoleColors.WHITE_BACKGROUND + ConsoleColors.BLACK_BOLD + "TOPPINGS:" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.RED_BRIGHT + "Tomato Sauce: t" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.YELLOW_BRIGHT + "Cheese: c" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.RED + "Pepperoni: p");
    System.out.println(ConsoleColors.YELLOW + "Sausage: s" + ConsoleColors.RESET);
    System.out.println("Mushroom: m");
    System.out.println(ConsoleColors.PURPLE_BRIGHT + "Onion: o" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.GREEN_BRIGHT + "Green Pepper: g" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.CYAN + "Anchovy: a" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.WHITE_BRIGHT + "Egg: e" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.RED_BRIGHT + "Ham: h" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.GREEN_BRIGHT + "Jalapeño: j" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.RED_BRIGHT + "Kimchi: k" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.YELLOW + "Lamb: l" + ConsoleColors.RESET);
    System.out.println(ConsoleColors.GREEN_BRIGHT + "Zucchini: z" + ConsoleColors.RESET);
    System.out.println("");

    try
    {
      Thread.sleep(2000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println(ConsoleColors.CYAN_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD + " CUT: - " + ConsoleColors.RESET);

    System.out.println("");
    
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD + " BAKE: b " + ConsoleColors.RESET);

    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }


    System.out.println("");
    System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + ConsoleColors.BLACK_BOLD + " CONFIRM: x " + ConsoleColors.RESET);
    System.out.println("");

    try
    {
      Thread.sleep(2000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }

    System.out.println("Example: \"I want a pepperoni and onion pizza. \"");
    System.out.println("Input: ");

    System.out.println("t (tomato sauce)");
    System.out.println("c (cheese)");
    System.out.println("p (pepperoni)");
    System.out.println("o (onion)");
    System.out.println("b (bake)");
    System.out.println("- (cut)");
    System.out.println("- (cut)");
    System.out.println("- (cut)");
    System.out.println("x (confirm)");
    System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + "Good!" + ConsoleColors.RESET);

    try
    {
      Thread.sleep(3000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }

    System.out.println("");
    System.out.println(ConsoleColors.WHITE_BACKGROUND + ConsoleColors.BLACK_BOLD + "NOTE:" + ConsoleColors.RESET);
    System.out.println("- All pizzas should have tomato sauce and cheese, be baked once, and have 6 slices (3 cuts) unless specified otherwise");
    System.out.println("- You must follow this order when making a pizza: sauce -> cheese -> toppings -> bake/cut");
    System.out.println("- Baking 2 or 3 times will respectively give Dark Crust or Burnt");

    try
    {
      Thread.sleep(3000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println(ConsoleColors.WHITE_BACKGROUND + ConsoleColors.YELLOW_BRIGHT + "Tutorial complete. Press p to play." + ConsoleColors.RESET);
  }
  
}