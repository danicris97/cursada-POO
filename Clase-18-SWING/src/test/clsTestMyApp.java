package test;

import base.clsHelloWorld4;
import aplicaciones.*;

public class clsTestMyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String dbName = "POO2021.db";
		 
		clsLogin objForm1 = new clsLogin(dbName);
		objForm1.setVisible(true);


	}

}
