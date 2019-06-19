package by.dorozhko.LTE_Calc.StartProgram;

import by.dorozhko.LTE_Calc.GUI.CalcGUI;

/**
 * 
 *  This program show you the frequency if you know value of EARFCN for both technologies  (TDD and FDD) of LTE networks.
 * @author Sergey Dorozhko
 * @version v1.0
 * 
 *
 */
public class StartCalc {
	
	
	/**
	 * This is main method. It is starting GUI of program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		new CalcGUI().startGUI();
	}

}
