package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.Browser;
import com.xworkz.app.inheritance.ChromeBrowser;
import com.xworkz.app.inheritance.Edge;
import com.xworkz.app.inheritance.FireFox;
import com.xworkz.app.inheritance.util.BrowserUtil;


public class BrowserRunner {

	public static void main(String[] args) {
		System.out.println("invoking main of BrowserRunner");
        Browser browser=new Browser();
		BrowserUtil.run(browser);
        
		Browser browser2=new ChromeBrowser();
        ChromeBrowser chromeBrowser=(ChromeBrowser) browser2;
		BrowserUtil.run(chromeBrowser);
		
		Browser browser3=new FireFox();
        FireFox  fireFox=(FireFox) browser3;
		BrowserUtil.run(fireFox);

		Browser browser4=new Edge();
        Edge edge=(Edge) browser4;
		BrowserUtil.run(edge);
		
	}

}
