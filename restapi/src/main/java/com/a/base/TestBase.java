package com.a.base;



public Properties prop;

public TestBase(){
	
		try {
		prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/Keshav/eclipse-workspace/restapi/"
					
					+ "src/main/java/com/a/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
}
