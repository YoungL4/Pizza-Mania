import java.util.*;
import javax.swing.*;


public class MySwingWorker extends SwingWorker<Void, Integer>{
	
	MyFrame frame;
	JLabel topBar;
	
	static int durationInSeconds;
	
	public MySwingWorker(int time, JLabel topBar) {
		durationInSeconds = time;
		this.topBar = topBar;
		frame = Main.getFrame();
	}
	
	public void setDuration(int time) {
		durationInSeconds = time;
	}
	
	public int getDuration() {
		return durationInSeconds;
	}
	
	protected Void doInBackground() throws Exception {
		for (int i = 0; i < durationInSeconds * 10; i++)
		{
			if (isCancelled()) {
				break;
			}
			
			Thread.sleep(100);
			if ((i + 1) % 10 == 0) {
				publish(durationInSeconds - ((i + 1) / 10));
			}
		}
		
		//frame.slowPizza();
		
        return null;
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
    }
}
