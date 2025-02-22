import java.awt.event.*;
import javax.swing.*;

import acm.graphics.*;
import acm.program.*;


public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
    private int count;
    private Timer t;
    private int numTimes;
    
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		
		t = new Timer(1000, this);
		t.setInitialDelay(3000);
		t.start();
		
		numTimes = 0;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		numTimes++;
		myLabel.setLabel("times called? " + numTimes);
		myLabel.move(5,0);
		if (numTimes == 10)
		{
			t.stop();
		}
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}