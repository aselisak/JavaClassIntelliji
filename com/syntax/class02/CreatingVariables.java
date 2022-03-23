package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		/* declare a variable and initialize
		 * create a variable and assign a value
		 */
		//1
		int age=25;
		//2
		int num; //declare variable
		num=10; //initialize it
		
		int n1, n2, n3;//all 3 variables on the int type
		n1=10;
		n2=20;
		n3=30;
		
age=26; //reassigning the value of a variable age
//age=26.5; Error age variable can hold only int value


System.out.println(age);//26 reassigning the value of variables

//Java Rules for identifiers
		//naming convention
       //keywords
 
        //boolean break=false;//Error dont use java keywords=do not us as identifier 
        boolean Break=false; // Java is a case sensitive
        
        //char 1character='A';
        // error--> do not start identifier or name with numbers
        
       //double %value=12.99;//Error--> Do not start identifier with special character 
        
		//Java allows to use _ OR $ as identifier
       
       double $price=1.99;
       double _value=2.99;
		
		//not rules, but we prefer to follow
       /* variable names should start with lower case
        * give variables a meaningful name 
        * class name should start with upper case
        * if name has 2 or more words--> follow camel casing
        * 
        */
		 int bigNumber=1325;
		
		
		
		

	}

}
