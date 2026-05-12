import javax.swing.*;
import java.util.*;


public class MySwingWorker extends SwingWorker<Void, Integer>{
	
	MyFrame frame;
	JLabel topBar;
	
	static int duration; // time in seconds
	
	public MySwingWorker(int time, JLabel topBar) {
		duration = time;
		this.topBar = topBar;
		frame = Main.getFrame();
	}
	
	public void setDuration(int time) {
		duration = time;
	}
	
	public int getDuration() {
		return duration;
	}
	
	protected Void doInBackground() throws Exception {
        // Perform your lengthy task here
        // This method runs in the background thread
		for (int i = 0; i < duration * 10; i++)
		{
			if (isCancelled()) {
				break;
			}
			
			Thread.sleep(100);
			if ((i + 1) % 10 == 0)
			{
				publish(duration - ((i + 1) / 10));
			}
		}
		
		//frame.slowPizza();
		
        return null; // Return the final result
    }
	
	protected void process(List<Integer> chunks) {
		int timeRemaining = chunks.get(chunks.size() - 1);
		
		topBar.setText("Lives: " + frame.getLives() + "        " + "Time: " + timeRemaining);
	}

    @Override
    protected void done() {
    	if (!isCancelled())
    	{
    		frame.slowPizza();
    	}
        // This method is called when doInBackground completes
        // You can update the UI or perform other tasks here
    	
    }
}
