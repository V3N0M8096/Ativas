package HandlingPopups;

import java.awt.AWTException;
import java.io.IOException;
import java.awt.Robot;


	
public class RobotProgram {
	public static void main(String[] args) throws IOException,AWTException,InterruptedException {
		Runtime.getRuntime().exec("notepad");
		Robot r=new Robot();
		r.keyPress(0);
		
		
		
		
	}

}
