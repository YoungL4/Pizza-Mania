// import javax.imageio.ImageIO;

// import java.util.concurrent.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
// import java.io.InputStream;

import javax.swing.border.Border;
// import java.lang.*;

public class MyFrame extends JFrame implements MouseListener {
	// ===============================================================================================
	// DATA TYPES TO USE:
	// ===============================================================================================
	
	// -- ImageIcon --
	// basically an image, but can't be used directly as a picture
	// constructor takes an image
	//
	// - Common methods -
	// getImage()
	//   returns the ImageIcon as a picture
	// getScaledInstance(int x, int y, Image.SCALE_DEFAULT)
	//   rescales the image, can only be called on an image, not ImageIcon
	
	
	// -- JLabel --
	// just a simple block to put text/images on, make clickable, etc.
	// constructor doesn't take any arguments
	//
	// - Common methods -
	// setBounds(int start_x, int start_y, int x, int y)
	//   sets the size and location of label
	// setIcon(ImageIcon icon)
	//   sets the picture to appear on the label
	// setVerticalAlignment(JLabel.CENTER)
	// setHorizontalAlignment(JLabel.LEFT)
	// addMouseListener(this)
	// setText(String text)
	// setOpaque(boolean bool)
	
	
	// -- JPanel --
	// a place to put JLabels on, can set how JLabels should be arranged
	// constructor doesn't take any arguments
	//
	// - Common methods -
	// setSize(int x, int y)
	// add(JLabel label)
	// setOpaque(boolean bool)
	// setLayout()
	
	// -- JLayeredPane --
	// a place to overlap panels, use this to determine which panel goes on top
	// constructor doesn't take any arguments
	//
	// - Common methods -
	// setBounds(int start_x, int start_y, int x, int x)
	// add(JPanel panel)
	//   the add() that appears higher in the code will go on top when rendered
	
	// =================================================================================
	//   GENERAL MYFRAME METHODS
	// =================================================================================
	
	// setVisible(boolean bool)
	//   makes the window visible
	// setIconImage(Image image)
	//   sets the Favicon of window (takes an image as the argument, not ImageIcon)
	
	
	
	// =======================================================================================================
	// !!!                                    GRAPHICAL ELEMENTS                                           !!!
	// =======================================================================================================
	
	JLabel menu = new JLabel();
	JLabel gameOver = new JLabel();
	JLabel play = new JLabel();
	JLabel tutorial = new JLabel();
	JLabel tutorialPage = new JLabel();
	JLabel gameOverCenter = new JLabel();
	
	JLayeredPane countertop;
	JLayeredPane bottomLeft;
	// JPanel essentials;
	// JPanel toppings;
	JLabel table;
	JLabel tomatoSauce = new JLabel();
	JLabel cheese = new JLabel();
	JLabel bake = new JLabel();
	JLabel cut = new JLabel();
	JLabel pepperoni = new JLabel();
	JLabel sausage = new JLabel();
	JLabel mushroom = new JLabel();
	JLabel onion = new JLabel();
	JLabel greenPepper = new JLabel();
	JLabel anchovy = new JLabel();
	JLabel egg = new JLabel();
	JLabel ham = new JLabel();
	JLabel jalapeno = new JLabel();
	JLabel kimchi = new JLabel();
	JLabel lamb = new JLabel();
	JLabel zucchini = new JLabel();
	JLabel confirm = new JLabel();
	JLabel sentence = new JLabel();
	JLabel topBar = new JLabel();
	JLabel cu = new JLabel();
	JLabel sentenceCenter = new JLabel();
	int cuts = 0;
	
	ArrayList<JLabel> pizza = new ArrayList<JLabel>();
	int pizzaIndex = 2;
	
	ImageIcon emptyTopping = new ImageIcon(this.getClass().getResource("images/Empty Topping.png"));
	ImageIcon doughIcon = new ImageIcon(this.getClass().getResource("images/Dough.png"));
	ImageIcon tomatoSauceIcon = new ImageIcon(this.getClass().getResource("images/Tomato Sauce.png"));
	ImageIcon cheeseIcon = new ImageIcon(this.getClass().getResource("images/Cheese.png"));
	ImageIcon pepperoniIcon = new ImageIcon(this.getClass().getResource("images/Pepperoni.png"));
	ImageIcon sausageIcon = new ImageIcon(this.getClass().getResource("images/Sausage.png"));
	ImageIcon mushroomIcon = new ImageIcon(this.getClass().getResource("images/Mushroom.png"));
	ImageIcon onionIcon = new ImageIcon(this.getClass().getResource("images/Onion.png"));
	ImageIcon greenPepperIcon = new ImageIcon(this.getClass().getResource("images/Green Pepper.png"));
	ImageIcon anchovyIcon = new ImageIcon(this.getClass().getResource("images/Anchovy.png"));
	ImageIcon eggIcon = new ImageIcon(this.getClass().getResource("images/Egg.png"));
	ImageIcon hamIcon = new ImageIcon(this.getClass().getResource("images/Ham.png"));
	ImageIcon jalapenoIcon = new ImageIcon(this.getClass().getResource("images/Jalapeno.png"));
	ImageIcon kimchiIcon = new ImageIcon(this.getClass().getResource("images/Kimchi.png"));
	ImageIcon lambIcon = new ImageIcon(this.getClass().getResource("images/Lamb.png"));
	ImageIcon zucchiniIcon = new ImageIcon(this.getClass().getResource("images/Zucchini.png"));
	
	ImageIcon bakedDoughIcon = new ImageIcon(this.getClass().getResource("images/Baked Dough.png"));
	ImageIcon bakedTomatoSauceIcon = new ImageIcon(this.getClass().getResource("images/Baked Tomato Sauce.png"));
	ImageIcon bakedCheeseIcon = new ImageIcon(this.getClass().getResource("images/Baked Cheese.png"));
	ImageIcon bakedPepperoniIcon = new ImageIcon(this.getClass().getResource("images/Baked Pepperoni.png"));
	ImageIcon bakedSausageIcon = new ImageIcon(this.getClass().getResource("images/Baked Sausage.png"));
	ImageIcon bakedMushroomIcon = new ImageIcon(this.getClass().getResource("images/Baked Mushroom.png"));
	ImageIcon bakedOnionIcon = new ImageIcon(this.getClass().getResource("images/Baked Onion.png"));
	ImageIcon bakedGreenPepperIcon = new ImageIcon(this.getClass().getResource("images/Baked Green Pepper.png"));
	ImageIcon bakedAnchovyIcon = new ImageIcon(this.getClass().getResource("images/Baked Anchovy.png"));
	ImageIcon bakedEggIcon = new ImageIcon(this.getClass().getResource("images/Baked Egg.png"));
	ImageIcon bakedHamIcon = new ImageIcon(this.getClass().getResource("images/Baked Ham.png"));
	ImageIcon bakedJalapenoIcon = new ImageIcon(this.getClass().getResource("images/Baked Jalapeno.png"));
	ImageIcon bakedKimchiIcon = new ImageIcon(this.getClass().getResource("images/Baked Kimchi.png"));
	ImageIcon bakedLambIcon = new ImageIcon(this.getClass().getResource("images/Baked Lamb.png"));
	ImageIcon bakedZucchiniIcon = new ImageIcon(this.getClass().getResource("images/Baked Zucchini.png"));
	
	ImageIcon darkDoughIcon = new ImageIcon(this.getClass().getResource("images/Dark Dough.png"));
	ImageIcon darkTomatoSauceIcon = new ImageIcon(this.getClass().getResource("images/Dark Tomato Sauce.png"));
	ImageIcon darkCheeseIcon = new ImageIcon(this.getClass().getResource("images/Dark Cheese.png"));
	ImageIcon darkPepperoniIcon = new ImageIcon(this.getClass().getResource("images/Dark Pepperoni.png"));
	ImageIcon darkSausageIcon = new ImageIcon(this.getClass().getResource("images/Dark Sausage.png"));
	ImageIcon darkMushroomIcon = new ImageIcon(this.getClass().getResource("images/Dark Mushroom.png"));
	ImageIcon darkOnionIcon = new ImageIcon(this.getClass().getResource("images/Dark Onion.png"));
	ImageIcon darkGreenPepperIcon = new ImageIcon(this.getClass().getResource("images/Dark Green Pepper.png"));
	ImageIcon darkAnchovyIcon = new ImageIcon(this.getClass().getResource("images/Dark Anchovy.png"));
	ImageIcon darkEggIcon = new ImageIcon(this.getClass().getResource("images/Dark Egg.png"));
	ImageIcon darkHamIcon = new ImageIcon(this.getClass().getResource("images/Dark Ham.png"));
	ImageIcon darkJalapenoIcon = new ImageIcon(this.getClass().getResource("images/Dark Jalapeno.png"));
	ImageIcon darkKimchiIcon = new ImageIcon(this.getClass().getResource("images/Dark Kimchi.png"));
	ImageIcon darkLambIcon = new ImageIcon(this.getClass().getResource("images/Dark Lamb.png"));
	ImageIcon darkZucchiniIcon = new ImageIcon(this.getClass().getResource("images/Dark Zucchini.png"));

	ImageIcon burntDoughIcon = new ImageIcon(this.getClass().getResource("images/Burnt Dough.png"));
	ImageIcon burntTomatoSauceIcon = new ImageIcon(this.getClass().getResource("images/Burnt Tomato Sauce.png"));
	ImageIcon burntCheeseIcon = new ImageIcon(this.getClass().getResource("images/Burnt Cheese.png"));
	ImageIcon burntPepperoniIcon = new ImageIcon(this.getClass().getResource("images/Burnt Pepperoni.png"));
	ImageIcon burntSausageIcon = new ImageIcon(this.getClass().getResource("images/Burnt Sausage.png"));
	ImageIcon burntMushroomIcon = new ImageIcon(this.getClass().getResource("images/Burnt Mushroom.png"));
	ImageIcon burntOnionIcon = new ImageIcon(this.getClass().getResource("images/Burnt Onion.png"));
	ImageIcon burntGreenPepperIcon = new ImageIcon(this.getClass().getResource("images/Burnt Green Pepper.png"));
	ImageIcon burntAnchovyIcon = new ImageIcon(this.getClass().getResource("images/Burnt Anchovy.png"));
	ImageIcon burntEggIcon = new ImageIcon(this.getClass().getResource("images/Burnt Egg.png"));
	ImageIcon burntHamIcon = new ImageIcon(this.getClass().getResource("images/Burnt Ham.png"));
	ImageIcon burntJalapenoIcon = new ImageIcon(this.getClass().getResource("images/Burnt Jalapeno.png"));
	ImageIcon burntKimchiIcon = new ImageIcon(this.getClass().getResource("images/Burnt Kimchi.png"));
	ImageIcon burntLambIcon = new ImageIcon(this.getClass().getResource("images/Burnt Lamb.png"));
	ImageIcon burntZucchiniIcon = new ImageIcon(this.getClass().getResource("images/Burnt Zucchini.png"));
	
	ImageIcon zeroCutsIcon = new ImageIcon(this.getClass().getResource("images/Zero Cuts.png"));
	ImageIcon oneCutIcon = new ImageIcon(this.getClass().getResource("images/One Cut.png"));
	ImageIcon twoCutsIcon = new ImageIcon(this.getClass().getResource("images/Two Cuts.png"));
	ImageIcon threeCutsIcon = new ImageIcon(this.getClass().getResource("images/Three Cuts.png"));
	ImageIcon fourCutsIcon = new ImageIcon(this.getClass().getResource("images/Four Cuts.png"));
	ImageIcon burntZeroCutsIcon = new ImageIcon(this.getClass().getResource("images/Burnt Zero Cuts.png"));
	ImageIcon burntOneCutIcon = new ImageIcon(this.getClass().getResource("images/Burnt One Cut.png"));
	ImageIcon burntTwoCutsIcon = new ImageIcon(this.getClass().getResource("images/Burnt Two Cuts.png"));
	ImageIcon burntThreeCutsIcon = new ImageIcon(this.getClass().getResource("images/Burnt Three Cuts.png"));
	ImageIcon burntFourCutsIcon = new ImageIcon(this.getClass().getResource("images/Burnt Four Cuts.png"));
	
	// ====================================================================================================
	// !!!                                    LOGIC ELEMENTS                                            !!!
	// ====================================================================================================
	
	boolean bakedAlready = false;
	boolean cutAlready = false;
	boolean toppedAlready = false;
	boolean cheesedAlready = false;
	boolean saucedAlready = false;
	boolean pepperoniedAlready = false;
	boolean sausagedAlready = false;
	boolean mushroomedAlready = false;
	boolean onionedAlready = false;
	boolean greenPepperedAlready = false;
	boolean anchoviedAlready = false;
	boolean eggedAlready = false;
	boolean hammedAlready = false;
	boolean jalapenoedAlready = false;
	boolean kimchiedAlready = false;
	boolean lambedAlready = false;
	boolean zucchiniedAlready = false;
	
	Prompt promptObject;
	ArrayList<String> prompt;
	HashMap<String, Integer> promptMap; // 
	HashMap<String, Integer> inputtedMap;
	static int lives = 3;
	static boolean started = false;
	int points = 0;
	int currentPoints = 0;
	int pizzas = 0;
	
	int duration = 30;
	/*
	MySwingWorker worker = new MySwingWorker(duration);
	*/
	ArrayList<MySwingWorker> workerList = new ArrayList<MySwingWorker>();
	int workerIndex = 0;

	// ==============================================================================================
	// !!!                                    CONSTANTS                                           !!!
	// ==============================================================================================
	int VIEWPORT_WIDTH = 800;
	int VIEWPORT_HEIGHT = 800;
	int WINDOW_WIDTH = 813;
	int WINDOW_HEIGHT = 837;

	private void setIconJLabel(JLabel label, String path) {
		label.setIcon(new ImageIcon(this.getClass().getResource(path)));
	}

	private void setBoundsJLabel(JLabel label, int x, int y, int width, int height) {
		label.setBounds(x, y, width, height);
	}

	private void setWindowProperties() {
		this.setTitle("Pizza Mania"); // window title
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // what happens when user click X
		this.setResizable(false); // can't resize window
		this.setBackground(new Color(0xEEE9D1));
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // window width, height
	}

	private void setupPrompt() {
		promptObject = new Prompt();
		promptMap = new HashMap<String, Integer>();
		inputtedMap = new HashMap<String, Integer>();
		resetMaps();
	}

	private void setupCountertop() {
		countertop = new JLayeredPane();
		//essentials = new JPanel();
		//toppings = new JPanel();
		table = new JLabel();
		
		countertop.setBounds(0, 0, 500, 600);
		//essentials.setSize(500, 500);
		//toppings.setSize(500, 500);

		setIconJLabel(table, "images/counter.png");
		setBoundsJLabel(table, 0, 50, 500, 500);
		
		countertop.add(table);
		countertop.setLayer(table,  0);
		countertop.moveToBack(table);
	}

	private void setupRightPanel() {
		JLabel[] toppingArray = {
			tomatoSauce,
			cheese,
			bake,
			cut,
			pepperoni,
			sausage,
			mushroom,
			onion,
			greenPepper,
			anchovy,
			egg,
			ham,
			jalapeno,
			kimchi,
			lamb,
			zucchini,
			confirm,
		};
		String[] toppingTextArray = {
			"t",
			"c",
			"b",
			"-",
			"p",
			"s",
			"m",
			"o",
			"g",
			"a",
			"e",
			"h",
			"j",
			"k",
			"l",
			"z",
			"Confirm",
		};
		int[][] toppingBoundsArray = {
			{500, 50, 100, 150},
			{500, 200, 100, 150},
			{500, 350, 100, 150},
			{500, 500, 100, 150},
			{600, 50, 100, 100},
			{700, 50, 100, 100},
			{600, 150, 100, 100},
			{700, 150, 100, 100},
			{600, 250, 100, 100},
			{700, 250, 100, 100},
			{600, 350, 100, 100},
			{700, 350, 100, 100},
			{600, 450, 100, 100},
			{700, 450, 100, 100},
			{600, 550, 100, 100},
			{700, 550, 100, 100},
			{500, 650, 300, 150},
		};

		for (int i = 0; i < toppingArray.length; i++) {
			JLabel label = toppingArray[i];
			String text = toppingTextArray[i];
			int[] bounds = toppingBoundsArray[i];
			label.setText(text);
			label.setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
			setIconJLabel(label, "images/" + text + ".png");
			label.addMouseListener(this);
		}
	}

	private void setupPregameMenus() {
		setIconJLabel(menu, "images/Menu Background.png");
		setBoundsJLabel(menu, 0, 0, VIEWPORT_WIDTH, VIEWPORT_HEIGHT);
		
		setIconJLabel(play, "images/Play.png");
		setBoundsJLabel(play, 150, 550, 200, 100);
		play.addMouseListener(this);
		
		setIconJLabel(tutorial, "images/Tutorial.png");
		setBoundsJLabel(tutorial, 450, 550, 200, 100);
		tutorial.addMouseListener(this);
		
		setIconJLabel(tutorialPage, "images/Tutorial Page.png");
		setBoundsJLabel(tutorialPage, 0, 0, VIEWPORT_WIDTH, VIEWPORT_HEIGHT);
		tutorialPage.setVisible(false);

		this.add(play);
		this.add(tutorial);
		this.add(menu);
		this.add(tutorialPage);
	}

	private void setupPostgameMenus() {
		setIconJLabel(gameOver, "images/Game Over.png");
		setBoundsJLabel(gameOver, 0, 0, VIEWPORT_WIDTH, VIEWPORT_HEIGHT);
		gameOver.setVisible(false);
		
		setIconJLabel(gameOverCenter, "images/Game Over Center.png");
		setBoundsJLabel(gameOverCenter, 13, 450, 787, 300);
		gameOverCenter.setFont(new Font("MS Gothic", Font.BOLD, 50));
		gameOverCenter.setHorizontalAlignment(JLabel.CENTER);
		gameOverCenter.setVerticalAlignment(JLabel.CENTER);
		gameOverCenter.setHorizontalTextPosition(JLabel.CENTER);
		gameOverCenter.setVerticalTextPosition(JLabel.CENTER);
		gameOverCenter.setVisible(false);
		
		this.add(gameOverCenter);
		this.add(gameOver);
	}
	
	private void setupSentenceBox() {
		//sentenceCenter.setText("<html><body style='text-align: center'><p>Long ass sentence needs a linebreak blah blah this is too long what about some more and it even works underwater!!</p></body></html>");
		Border border = BorderFactory.createLineBorder(new Color(0x313131), 5);
		sentence.setBounds(0, 550, 500, 250);
		ImageIcon sentenceImage = new ImageIcon(this.getClass().getResource("images/Sentence.png"));
		sentence.setIcon(new ImageIcon(sentenceImage.getImage().getScaledInstance(500,  250,  Image.SCALE_DEFAULT)));
		sentence.setBackground(new Color(0xF5F5F5));
		sentence.setOpaque(true);
		sentence.setFont(new Font("MS Gothic", Font.BOLD, 25));
		sentence.setHorizontalTextPosition(JLabel.CENTER);
		sentence.setVerticalTextPosition(JLabel.CENTER);
		sentence.setHorizontalAlignment(JLabel.CENTER);
		sentence.setVerticalAlignment(JLabel.CENTER);
		sentence.setBorder(border);
		
		ImageIcon sentenceCenterImage = new ImageIcon(this.getClass().getResource("images/Sentence Center.png"));
		sentenceCenter.setIcon(new ImageIcon(sentenceCenterImage.getImage().getScaledInstance(487, 250, Image.SCALE_DEFAULT)));
		sentenceCenter.setBounds(13, 550, 487, 250);
		sentenceCenter.setHorizontalTextPosition(JLabel.CENTER);
		sentenceCenter.setVerticalTextPosition(JLabel.CENTER);
		sentenceCenter.setHorizontalAlignment(JLabel.RIGHT);
		sentenceCenter.setVerticalAlignment(JLabel.CENTER);
		sentenceCenter.setFont(new Font("MS Gothic", Font.BOLD, 25));
		sentenceCenter.setText("<html><body style='text-align: center'><p>" + promptObject.getSentence() + "</p></body></html>");
		
		bottomLeft = new JLayeredPane();
		bottomLeft.setBounds(0, 550, 500, 250);
		bottomLeft.add(sentenceCenter);
		bottomLeft.add(sentence);

		topBar.setBounds(0, 0, 800, 50);
		topBar.setIcon(new ImageIcon(this.getClass().getResource("images/Top Bar.png")));
		topBar.setBackground(new Color(0xDDDDDD));
		topBar.setOpaque(true);
		topBar.setFont(new Font("MS Gothic", Font.BOLD, 30));
		topBar.setHorizontalTextPosition(JLabel.CENTER);
		topBar.setVerticalTextPosition(JLabel.CENTER);
		topBar.setHorizontalAlignment(JLabel.CENTER);
		topBar.setVerticalAlignment(JLabel.CENTER);
		topBar.setBorder(border);

		this.add(bottomLeft);
	}

	private void populateCountertop() {
		this.add(tomatoSauce);
		this.add(cheese);
		this.add(bake);
		this.add(cut);
		this.add(pepperoni);
		this.add(sausage);
		this.add(mushroom);
		this.add(onion);
		this.add(greenPepper);
		this.add(anchovy);
		this.add(egg);
		this.add(ham);
		this.add(jalapeno);
		this.add(kimchi);
		this.add(lamb);
		this.add(zucchini);
		this.add(confirm);
		this.add(topBar);
		
		JLabel toppingDough = new JLabel();
		JLabel toppingCut = new JLabel();
		JLabel topping1 = new JLabel();
		JLabel topping2 = new JLabel();
		JLabel topping3 = new JLabel();
		JLabel topping4 = new JLabel();
		JLabel topping5 = new JLabel();
		JLabel topping6 = new JLabel();
		JLabel topping7 = new JLabel();
		JLabel topping8 = new JLabel();
		JLabel topping9 = new JLabel();
		JLabel topping10 = new JLabel();
		JLabel topping11 = new JLabel();
		JLabel topping12 = new JLabel();
		JLabel topping13 = new JLabel();
		JLabel topping14 = new JLabel();
		
		toppingDough.setIcon(doughIcon);
		toppingCut.setIcon(zeroCutsIcon);
		topping1.setIcon(emptyTopping);
		topping2.setIcon(emptyTopping);
		topping3.setIcon(emptyTopping);
		topping4.setIcon(emptyTopping);
		topping5.setIcon(emptyTopping);
		topping6.setIcon(emptyTopping);
		topping7.setIcon(emptyTopping);
		topping8.setIcon(emptyTopping);
		topping9.setIcon(emptyTopping);
		topping10.setIcon(emptyTopping);
		topping11.setIcon(emptyTopping);
		topping12.setIcon(emptyTopping);
		topping13.setIcon(emptyTopping);
		topping14.setIcon(emptyTopping);
		
		pizza.add(toppingDough);
		pizza.add(toppingCut);
		pizza.add(topping1);
		pizza.add(topping2);
		pizza.add(topping3);
		pizza.add(topping4);
		pizza.add(topping5);
		pizza.add(topping6);
		pizza.add(topping7);
		pizza.add(topping8);
		pizza.add(topping9);
		pizza.add(topping10);
		pizza.add(topping11);
		pizza.add(topping12);
		pizza.add(topping13);
		pizza.add(topping14);
		
		countertop.add(toppingCut);
		countertop.add(topping14);
		countertop.add(topping13);
		countertop.add(topping12);
		countertop.add(topping11);
		countertop.add(topping10);
		countertop.add(topping9);
		countertop.add(topping8);
		countertop.add(topping7);
		countertop.add(topping6);
		countertop.add(topping5);
		countertop.add(topping4);
		countertop.add(topping3);
		countertop.add(topping2);
		countertop.add(topping1);
		countertop.add(toppingDough);
		
		for (int i = 0; i < pizza.size(); i++)
		{
			countertop.setLayer(pizza.get(i), 1);
			pizza.get(i).setBounds(0, 50, 500, 500);
		}
		
		this.add(countertop);
	}
	
	// ====================================================================================================
	// !!!                                      CONSTRUCTOR                                             !!!
	// ====================================================================================================
	
	public MyFrame() {
		setupPregameMenus();

		setupPostgameMenus();
		
		setupPrompt();

		setWindowProperties();
		
		setupCountertop();

		setupRightPanel();

		populateCountertop();

		setupSentenceBox();

		this.getContentPane().setBackground(new Color(0xEEE9D1));
		this.setVisible(true);
	}
	
	public void resetMaps() {
		promptMap.put("t", 0);
		promptMap.put("c", 0);
		promptMap.put("p", 0);
		promptMap.put("s", 0);
		promptMap.put("m", 0);
		promptMap.put("o", 0);
		promptMap.put("g", 0);
		promptMap.put("a", 0);
		promptMap.put("e", 0);
		promptMap.put("h", 0);
		promptMap.put("j", 0);
		promptMap.put("k", 0);
		promptMap.put("l", 0);
		promptMap.put("z", 0);
		promptMap.put("b", 0);
		promptMap.put("-", 0);
		
		inputtedMap.put("t", 0);
		inputtedMap.put("c", 0);
		inputtedMap.put("p", 0);
		inputtedMap.put("s", 0);
		inputtedMap.put("m", 0);
		inputtedMap.put("o", 0);
		inputtedMap.put("g", 0);
		inputtedMap.put("a", 0);
		inputtedMap.put("e", 0);
		inputtedMap.put("h", 0);
		inputtedMap.put("j", 0);
		inputtedMap.put("k", 0);
		inputtedMap.put("l", 0);
		inputtedMap.put("z", 0);
		inputtedMap.put("b", 0);
		inputtedMap.put("-", 0);
		
		prompt = promptObject.genPrompt();
		
		for (int i = 0; i < prompt.size(); i++)
		{
			promptMap.put(prompt.get(i), promptMap.get(prompt.get(i)) + 1);
		}
		
	}
	
	public void resetPizza() {
		pizza.get(0).setIcon(doughIcon);
		pizza.get(1).setIcon(zeroCutsIcon);
		for (int i = 2; i < pizza.size(); i++)
		{
			pizza.get(i).setIcon(emptyTopping);
		}
		pizzaIndex = 2;
		bakedAlready = false;
		cutAlready = false;
		cheesedAlready = false;
		toppedAlready = false;
		saucedAlready = false;
		pepperoniedAlready = false;
		sausagedAlready = false;
		mushroomedAlready = false;
		onionedAlready = false;
		greenPepperedAlready = false;
		anchoviedAlready = false;
		eggedAlready = false;
		hammedAlready = false;
		jalapenoedAlready = false;
		kimchiedAlready = false;
		lambedAlready = false;
		zucchiniedAlready = false;
		resetMaps();
		sentenceCenter.setText("<html><body style='text-align: center'><p>" + promptObject.getSentence() + "</p></body></html>");
		currentPoints = 0;
		
		duration -= (int)Math.ceil((double)(duration - 5) / 20);
		topBar.setText("Lives: " + lives + "        " + "Time: " + duration);
		MySwingWorker newWorker = new MySwingWorker(duration, topBar);
		workerList.add(newWorker);
		workerIndex++;
		newWorker.execute();
	}
	
	public int getLives() {
		return lives;
	}
	
	public void invertCuts() {
		int cutsIndex = 1;
		Icon cutsIcon = pizza.get(cutsIndex).getIcon();
		if (cutsIcon == zeroCutsIcon) {
			pizza.get(1).setIcon(burntZeroCutsIcon);
		} else if (cutsIcon == oneCutIcon) {
			pizza.get(1).setIcon(burntOneCutIcon);
			
		} else if (cutsIcon == twoCutsIcon) {
			pizza.get(1).setIcon(burntTwoCutsIcon);
			
		} else if (cutsIcon == threeCutsIcon) {
			pizza.get(1).setIcon(burntThreeCutsIcon);
			
		} else if (cutsIcon == fourCutsIcon) {
			pizza.get(1).setIcon(burntFourCutsIcon);	
		}
		countertop.moveToFront(pizza.get(cutsIndex));
	}
	
	public void bakePizza() {
		bakedAlready = true;
		int bakeIndex = 0;
		int cutsIndex = 1;
		Icon bakeIcon = pizza.get(bakeIndex).getIcon();
		if (bakeIcon == doughIcon) {
			inputtedMap.put("b", inputtedMap.get("b") + 1);
			pizza.get(0).setIcon(bakedDoughIcon);
			countertop.moveToFront(pizza.get(0));
		} else if (bakeIcon == bakedDoughIcon) {
			inputtedMap.put("b", inputtedMap.get("b") + 1);
			pizza.get(0).setIcon(darkDoughIcon);
			countertop.moveToFront(pizza.get(0));
		} else if (bakeIcon == darkDoughIcon) {
			inputtedMap.put("b", inputtedMap.get("b") + 1);
			pizza.get(0).setIcon(burntDoughIcon);
			countertop.moveToFront(pizza.get(0));
			invertCuts();
		} else { // already baked too many times
			return;
		}

		for (int i = 2; i < pizza.size(); i++) {
			Icon toppingIcon = pizza.get(i).getIcon();
			if (toppingIcon == tomatoSauceIcon) {
				pizza.get(i).setIcon(bakedTomatoSauceIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedTomatoSauceIcon) {
				pizza.get(i).setIcon(darkTomatoSauceIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkTomatoSauceIcon) {
				pizza.get(i).setIcon(burntTomatoSauceIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == cheeseIcon) {
				pizza.get(i).setIcon(bakedCheeseIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedCheeseIcon) {
				pizza.get(i).setIcon(darkCheeseIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkCheeseIcon) {
				pizza.get(i).setIcon(burntCheeseIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == pepperoniIcon) {
				pizza.get(i).setIcon(bakedPepperoniIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedPepperoniIcon) {
				pizza.get(i).setIcon(darkPepperoniIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkPepperoniIcon) {
				pizza.get(i).setIcon(burntPepperoniIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == sausageIcon) {
				pizza.get(i).setIcon(bakedSausageIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedSausageIcon) {
				pizza.get(i).setIcon(darkSausageIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkSausageIcon) {
				pizza.get(i).setIcon(burntSausageIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == mushroomIcon) {
				pizza.get(i).setIcon(bakedMushroomIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedMushroomIcon) {
				pizza.get(i).setIcon(darkMushroomIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkMushroomIcon) {
				pizza.get(i).setIcon(burntMushroomIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == onionIcon) {
				pizza.get(i).setIcon(bakedOnionIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedOnionIcon) {
				pizza.get(i).setIcon(darkOnionIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkOnionIcon) {
				pizza.get(i).setIcon(burntOnionIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == greenPepperIcon) {
				pizza.get(i).setIcon(bakedGreenPepperIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedGreenPepperIcon) {
				pizza.get(i).setIcon(darkGreenPepperIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkGreenPepperIcon) {
				pizza.get(i).setIcon(burntGreenPepperIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == anchovyIcon) {
				pizza.get(i).setIcon(bakedAnchovyIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedAnchovyIcon) {
				pizza.get(i).setIcon(darkAnchovyIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkAnchovyIcon) {
				pizza.get(i).setIcon(burntAnchovyIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == eggIcon) {
				pizza.get(i).setIcon(bakedEggIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedEggIcon) {
				pizza.get(i).setIcon(darkEggIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkEggIcon) {
				pizza.get(i).setIcon(burntEggIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == hamIcon) {
				pizza.get(i).setIcon(bakedHamIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedHamIcon) {
				pizza.get(i).setIcon(darkHamIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkHamIcon) {
				pizza.get(i).setIcon(burntHamIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == jalapenoIcon) {
				pizza.get(i).setIcon(bakedJalapenoIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedJalapenoIcon) {
				pizza.get(i).setIcon(darkJalapenoIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkJalapenoIcon) {
				pizza.get(i).setIcon(burntJalapenoIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == kimchiIcon) {
				pizza.get(i).setIcon(bakedKimchiIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedKimchiIcon) {
				pizza.get(i).setIcon(darkKimchiIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkKimchiIcon) {
				pizza.get(i).setIcon(burntKimchiIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == lambIcon) {
				pizza.get(i).setIcon(bakedLambIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedLambIcon) {
				pizza.get(i).setIcon(darkLambIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkLambIcon) {
				pizza.get(i).setIcon(burntLambIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == zucchiniIcon) {
				pizza.get(i).setIcon(bakedZucchiniIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == bakedZucchiniIcon) {
				pizza.get(i).setIcon(darkZucchiniIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == darkZucchiniIcon) {
				pizza.get(i).setIcon(burntZucchiniIcon);
				countertop.moveToFront(pizza.get(i));
			} else if (toppingIcon == emptyTopping) {
				countertop.moveToFront(pizza.get(i));
			}
		}
		countertop.moveToFront(pizza.get(cutsIndex));
	}
	
	public void cutPizza() {
		cutAlready = true;
		int cutsIndex = 1;
		Icon cutsIcon = pizza.get(cutsIndex).getIcon();
		
		// a cut will be successfully made (there's not already max cuts)
		if (cutsIcon != fourCutsIcon && cutsIcon != burntFourCutsIcon) {
			inputtedMap.put("-", inputtedMap.get("-") + 1);
		}
		
		if (cutsIcon == zeroCutsIcon) {
			pizza.get(cutsIndex).setIcon(oneCutIcon);
		} else if (cutsIcon == oneCutIcon) {
			pizza.get(cutsIndex).setIcon(twoCutsIcon);
		} else if (cutsIcon == twoCutsIcon) {
			pizza.get(cutsIndex).setIcon(threeCutsIcon);
		} else if (cutsIcon == threeCutsIcon) {
			pizza.get(cutsIndex).setIcon(fourCutsIcon);
		} else if (cutsIcon == burntZeroCutsIcon) {
			pizza.get(cutsIndex).setIcon(burntOneCutIcon);
		} else if (cutsIcon == burntOneCutIcon) {
			pizza.get(cutsIndex).setIcon(burntTwoCutsIcon);
		} else if (cutsIcon == burntTwoCutsIcon) {
			pizza.get(cutsIndex).setIcon(burntThreeCutsIcon);
		} else if (cutsIcon == burntThreeCutsIcon) {
			pizza.get(cutsIndex).setIcon(burntFourCutsIcon);
		}
		
		countertop.moveToFront(pizza.get(cutsIndex));
	}
	
	
	// check if inputtedMap and promptMap contain the same things
	// If correct, reward players with points equal to (10 * correct actions)
	public boolean checkPizza() {
		int count = 0;
		for (Map.Entry<String, Integer> set : promptMap.entrySet())
		{
			if (inputtedMap.get(set.getKey()) != set.getValue()) {
				return false;
			}
			count += set.getValue();
		}
		currentPoints = 10 * count;
		return true;
	}
	
	// Player did not submit pizza in time
	public void slowPizza() {
		sentenceCenter.setForeground(new Color(0xD82507));
		sentenceCenter.setFont(new Font("MS Gothic", Font.BOLD, 40));
		sentenceCenter.setText("<html><body style='text-align: center'><p>Too slow.</p></body></html>");
		lives--;
		if (lives == 0) {
			started = false;
		}
		prepareNext();
	}
	
	// Player submitted incorrect pizza
	public void wrongPizza() {
		sentenceCenter.setForeground(new Color(0xD82507));
		sentenceCenter.setFont(new Font("MS Gothic", Font.BOLD, 40));
		sentenceCenter.setText("<html><body style='text-align: center'><p>Wrong.</p></body></html>");
		lives--;
		if (lives == 0) {
			started = false;
		}
		prepareNext();
	}
	
	public void prepareNext() {
		if (started) {
			ActionListener taskPerformer = new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                //...Perform a task...

	            	sentenceCenter.setForeground(Color.black);
	            	sentenceCenter.setFont(new Font("MS Gothic", Font.BOLD, 25));
	    			resetPizza();
	            }
	        };
	        Timer timer = new Timer(1000, taskPerformer);
	        timer.setRepeats(false);
	        timer.start();
		} else {
			ActionListener taskPerformer = new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					endgame();
				}
			};
			
			Timer timer = new Timer(1000, taskPerformer);
			timer.setRepeats(false);
			timer.start();
		}
	}
	
	public void setTimeRemaining(int time) {
		topBar.setText("Lives: " + lives + "        " + "Time: " + time);
		repaint();
	}
	
	// ======================================================================================================
	// !!!  MOUSE CLICKED FUNCTION HERE  !!!
	// ======================================================================================================
	
	public void mouseClicked(MouseEvent e) {
		Object source = e.getSource();
		if (source == play) {
			started = true;
			menu.setVisible(false);
			play.setVisible(false);
			tutorial.setVisible(false);
			tutorialPage.setVisible(false);
			topBar.setText("Lives: " + lives + "        " + "Time: " + duration);
			MySwingWorker worker = new MySwingWorker(duration, topBar);
			workerList.add(worker);
			worker.execute();
		} if (source == tutorial) {
			tutorialPage.setVisible(true);
			menu.setVisible(false);
			tutorial.setVisible(false);
			play.setBounds(300, 675, 200, 100);
		}
		
		if (started) {
			if (source == bake){
				bakePizza();
			} else if (source == cut) {
				cutPizza();
			} else if (source == confirm) {
				workerList.get(workerIndex).cancel(true);
				boolean valid = checkPizza();
				
				// !!!
				// placeholder, make something in the frame say "correct" or "wrong" instead
				if (valid) {
					pizzas++;
					points += currentPoints;
					sentenceCenter.setForeground(new Color(0x219908));
					sentenceCenter.setFont(new Font("MS Gothic", Font.BOLD, 40));
					sentenceCenter.setText("<html><body style='text-align: center'><p>Correct!</p></body></html>");
					prepareNext();
				} else {
					wrongPizza();
				}
			}
			
			// CAN ONLY ADD TOPPINGS IF HAVEN'T BAKED OR CUT YET
			if (!bakedAlready && !cutAlready) {
				if (!saucedAlready && !cheesedAlready && !toppedAlready && source == tomatoSauce) {
					if (pizzaIndex == pizza.size())  { // pizza already full
						return;
					} else {
						inputtedMap.put("t", inputtedMap.get("t") + 1);
						saucedAlready = true;
						pizza.get(pizzaIndex).setIcon(tomatoSauceIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!toppedAlready && source == cheese) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("c", inputtedMap.get("c") + 1);
						cheesedAlready = true;
						pizza.get(pizzaIndex).setIcon(cheeseIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!pepperoniedAlready && source == pepperoni) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("p", inputtedMap.get("p") + 1);
						toppedAlready = true;
						pepperoniedAlready = true;
						pizza.get(pizzaIndex).setIcon(pepperoniIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!sausagedAlready && source == sausage) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("s", inputtedMap.get("s") + 1);
						toppedAlready = true;
						sausagedAlready = true;
						pizza.get(pizzaIndex).setIcon(sausageIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!mushroomedAlready && source == mushroom) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("m", inputtedMap.get("m") + 1);
						toppedAlready = true;
						mushroomedAlready = true;
						pizza.get(pizzaIndex).setIcon(mushroomIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!onionedAlready && source == onion) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("o", inputtedMap.get("o") + 1);
						toppedAlready = true;
						onionedAlready = true;
						pizza.get(pizzaIndex).setIcon(onionIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!greenPepperedAlready && source == greenPepper) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("g", inputtedMap.get("g") + 1);
						toppedAlready = true;
						greenPepperedAlready = true;
						pizza.get(pizzaIndex).setIcon(greenPepperIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!anchoviedAlready && source == anchovy) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("a", inputtedMap.get("a") + 1);
						toppedAlready = true;
						anchoviedAlready = true;
						pizza.get(pizzaIndex).setIcon(anchovyIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!eggedAlready && source == egg) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("e", inputtedMap.get("e") + 1);
						toppedAlready = true;
						eggedAlready = true;
						pizza.get(pizzaIndex).setIcon(eggIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!hammedAlready && source == ham) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("h", inputtedMap.get("h") + 1);
						toppedAlready = true;
						hammedAlready = true;
						pizza.get(pizzaIndex).setIcon(hamIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!jalapenoedAlready && source == jalapeno) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("j", inputtedMap.get("j") + 1);
						toppedAlready = true;
						jalapenoedAlready = true;
						pizza.get(pizzaIndex).setIcon(jalapenoIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!kimchiedAlready && source == kimchi) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("k", inputtedMap.get("k") + 1);
						toppedAlready = true;
						kimchiedAlready = true;
						pizza.get(pizzaIndex).setIcon(kimchiIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!lambedAlready && source == lamb) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("l", inputtedMap.get("l") + 1);
						toppedAlready = true;
						lambedAlready = true;
						pizza.get(pizzaIndex).setIcon(lambIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				} else if (!zucchiniedAlready && source == zucchini) {
					if (pizzaIndex == pizza.size()) {
						return;
					} else {
						inputtedMap.put("z", inputtedMap.get("z") + 1);
						toppedAlready = true;
						zucchiniedAlready = true;
						pizza.get(pizzaIndex).setIcon(zucchiniIcon);
						countertop.moveToFront(pizza.get(pizzaIndex));
						pizzaIndex++;
					}
				}
			}
		}
	}
	
	// ===============================================================================================
	// !!!  END OF MOUSE CLICKED FUNCTION HERE  !!!
	// ===============================================================================================
	
	public void endgame() {
		topBar.setVisible(false);
		pepperoni.setVisible(false);
		sausage.setVisible(false);
		greenPepper.setVisible(false);
		anchovy.setVisible(false);
		mushroom.setVisible(false);
		onion.setVisible(false);
		egg.setVisible(false);
		ham.setVisible(false);
		jalapeno.setVisible(false);
		kimchi.setVisible(false);
		lamb.setVisible(false);
		zucchini.setVisible(false);
		sentence.setVisible(false);
		sentenceCenter.setVisible(false);
		confirm.setVisible(false);
		countertop.setVisible(false);
		gameOver.setVisible(true);
		tomatoSauce.setVisible(false);
		cheese.setVisible(false);
		bake.setVisible(false);
		cut.setVisible(false);
		gameOverCenter.setForeground(new Color(0x756A40));
		gameOverCenter.setText("<html><body style='text-align: center'><p>Good work. </p><p></p><p>Points: " + points + " </p></body></html>");
		gameOverCenter.setVisible(true);
	}
	
	public void mousePressed(MouseEvent e) {
		if (started) {
			if (e.getSource() == confirm) {
				confirm.setIcon(new ImageIcon(this.getClass().getResource("images/Pressed Confirm.png")));
			}
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == play) {
			play.setIcon(new ImageIcon(this.getClass().getResource("images/Hover Play.png")));
		} else if (e.getSource() == tutorial) {
			tutorial.setIcon(new ImageIcon(this.getClass().getResource("images/Hover Tutorial.png")));
		}
	}
	public void mouseReleased(MouseEvent e) {
		if (started) {
			if (e.getSource() == confirm) {
				confirm.setIcon(new ImageIcon(this.getClass().getResource("images/Confirm.png")));
			}
		}
	}
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == play) {
			play.setIcon(new ImageIcon(this.getClass().getResource("images/Play.png")));
		} else if (e.getSource() == tutorial) {
			tutorial.setIcon(new ImageIcon(this.getClass().getResource("images/Tutorial.png")));
		}
	}
	
}
