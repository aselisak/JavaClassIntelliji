package com.syntax.class10;

public class ClassTask1 {

	public static void main(String[] args) {

		String[] countries= {"Kazakhstan", "Turkey","Russia", "USA", "UK"};
		String capital = null;
		
		for(int i=0; i<countries.length; i++) {
			
			switch(countries[i]){
			
			case "Kazakhstan":
				capital="Astana";
				break;
			case "Turkey":
				capital="Ankara";
				break;
			case "Russia":
				capital="Moscow";
				break;
			case "USA":
				capital="Washington DC";
				break;
			case "UK":
				capital="London";
				break;
				
			}
			
			System.out.println("The Capital of the "+countries[i]+" is "+capital);
		}
		
		
		System.out.println("--------------Anothe Way--------------------------------");
		
		
		for (String country:countries) {
			if (country.equals("Kazakhstan")) {
				capital="Astana";
			}else if(country.equals("Turkey")) {
				capital="Ankara";
			}else if(country.equals("Russia")) {
				capital="Moscow";
			}else if(country.equals("USA")) {
				capital="Washington DC";
			}else if(country.equals("UK")) {
				capital="London";
			}
			System.out.println("The capital of "+country+" is "+capital);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
