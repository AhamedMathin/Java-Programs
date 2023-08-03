package com.xworkz.app.inheritance.util;

import com.xworkz.app.inheritance.Browser;
import com.xworkz.app.inheritance.ChromeBrowser;
import com.xworkz.app.inheritance.Edge;
import com.xworkz.app.inheritance.FireFox;

public class BrowserUtil {
  
	
	public static void run(Browser browser) {
		System.out.println(browser.title);
	     browser.search();
		if(browser instanceof ChromeBrowser)
		{

		System.out.println("Browser is Chrome");

		ChromeBrowser chromeBrowser=(ChromeBrowser) browser;//casting

		System.out.println(chromeBrowser.refreshTime);
		chromeBrowser.read();

		}

		if(browser instanceof FireFox)
		{
		System.out.println("browser is Firefox");
        FireFox fireFox=(FireFox) browser;

		System.out.println(fireFox.url);
		fireFox.website();
		}
		if(browser instanceof Edge)
		{
		System.out.println("browser is Edge");
        Edge edge=(Edge) browser;

		System.out.println(edge.location);
		edge.Ui();
		}
	}
}
