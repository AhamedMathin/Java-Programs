package com.xworkz.app.abstractcm;

public class Cave {
	 private int temperature;
	    private double humidity;
	    private String location;
	    private boolean isExplored;
	    private int numberOfStalactites;
	    private int numberOfStalagmites;
	    private boolean isDark;
	    private String mineralComposition;
	    private int entranceWidth;
	    private int entranceHeight;
	    private boolean hasWaterSource;
	    private boolean isHabitable;
	    
	    
	    public Cave() {
	    	
	    }
	    
	    


		public Cave(int temperature, String location) {
			super();
			this.temperature = temperature;
			this.location = location;
		}




		public Cave(int temperature, double humidity, String location, boolean isExplored, int numberOfStalactites,
				int numberOfStalagmites, boolean isDark, boolean hasWaterSource, boolean isHabitable) {
			super();
			this.temperature = temperature;
			this.humidity = humidity;
			this.location = location;
			this.isExplored = isExplored;
			this.numberOfStalactites = numberOfStalactites;
			this.numberOfStalagmites = numberOfStalagmites;
			this.isDark = isDark;
			this.hasWaterSource = hasWaterSource;
			this.isHabitable = isHabitable;
		}



		public Cave(int temperature, double humidity, String location, boolean isExplored, int numberOfStalactites,
				int numberOfStalagmites, boolean isDark, String mineralComposition, int entranceWidth,
				int entranceHeight, boolean hasWaterSource, boolean isHabitable) {
			super();
			this.temperature = temperature;
			this.humidity = humidity;
			this.location = location;
			this.isExplored = isExplored;
			this.numberOfStalactites = numberOfStalactites;
			this.numberOfStalagmites = numberOfStalagmites;
			this.isDark = isDark;
			this.mineralComposition = mineralComposition;
			this.entranceWidth = entranceWidth;
			this.entranceHeight = entranceHeight;
			this.hasWaterSource = hasWaterSource;
			this.isHabitable = isHabitable;
		}
		@Override
		public String toString() {
			
			return "Temp:" + temperature + "humudity:" + humidity + "location:" + location + "isexplores" + isExplored
					+ "noofstalicities:" + numberOfStalactites + "noofStalgments" + numberOfStalagmites + "isDark"
					+ isDark + "mineralComp" + mineralComposition + "entrace width" + entranceWidth + "height"
					+ entranceHeight + "bool" + hasWaterSource + "bool" + isHabitable;
		}
	    

}
