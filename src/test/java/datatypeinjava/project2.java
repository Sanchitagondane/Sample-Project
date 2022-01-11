package datatypeinjava;
  
    //1. Primitive Data Type

public class project2 
{
	public static void main(String[] args) 
	 
	{
      //Declaring & initialization a variable 		
	  
	 // int height = 10;                
	  
	  //int ageOfUser = 25;                 //With camel casing
	  //int age_of_user = 20;               //by using underscore symbol
	   
      //byte 1 byte | byte range :-127 to 128|	
      byte width = 10;
      byte temp = 45;
      byte score = 127;
      byte daynumberofweek =7;
      
      //short byte |range -32768 to 32767
      short s1 = 100 ;
      short s2 =5678 ;
      short s3 =00;
      
      //int 4 byte |range -1247483648 to 2147483647
      int i1= 10;
      int i2= 23;
      int i3= 0;
      
      //long 8 byte |range very long no need to memorised|
      
      long l1= 10;
      long l2=-5645;
      long l3=00;
      
      
      //************************************************************************************
      //*********************floating point Number(Decimal Number)**************************
      //************************************************************************************
      //float 4 byte | range very long no need to memorize |
      float interestRate =12.33f;
      float f2 =(float)12.33;
      float f3 =75f;
      float f4 =56;        // 56.0
      float f5 =0.00f;    // 0.0
      
      
      //double 8 bytes | range very long no need to memorize |
      double d1 =12.3333333;
      double d2 =56; //56.0
      double d3 =89.00;
      double d4 =0;
      
      
      //*******************************************************************************************
      //*****************************     Boolean Family      *************************************
      //*******************************************************************************************
      //Boolean 1 bit [not perfectly defined in java docs] range true / false 
      boolean isIndiannationality = true ;       //1
      boolean e2 =false;                        //0
      
      
      
      //********************************************************************************************
      //******************************** character family ******************************************
      //********************************************************************************************
      //char 2 byte |it will be accept single Character|
      char c1='a';
      char c2 ='s';
      char c3 ='w';
      char c4 ='y';
      char c5='@';
      char c6='A';
      
      
      
      //2. Non- Permeative Data Type 
      //**********************************************************************************************
      //********************************** String (its a Class)***************************************
      //**********************************************************************************************
      //string is a collection of characters (char) to size /range vary depending on usages.
      
      
      String javaversion = "Currently Running on java 1.8";
      String employed ="56451";
      String password ="2510";
      String candidate_name="sanchita who is leaving in Banglore ";
      
      
      //*********  Now Printing all the Permeative and Non-Permeative data Type   *********//
                 //------------------------------------------------------------//
      
      
       System.out.println("printing Byte Value -");
       System.out.println(width);
       System.out.println(temp);
       System.out.println(score);
       System.out.println(daynumberofweek);
       
       
       System.out.println("Printing Short Byte Value- ");
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       
       
       System.out.println("Printing Integer value -");
       System.out.println(i1);
       System.out.println(i2);
       System.out.println(i3);
      
   
      System.out.println("Printing long Byte Value- ");
      System.out.println(l1);
      System.out.println(l2);
      System.out.println(l3);
      
      
      System.out.println("Printing Floating Value- ");
      System.out.println(interestRate);
      System.out.println(f2);
      System.out.println(f3);
      System.out.println(f4);
      System.out.println(f5);
      
      
      
      System.out.println("Printing Double Byte value -");
      System.out.println(d1);
      System.out.println(d2);
      System.out.println(d3);
      System.out.println(d4);
      
      
      System.out.println("Printing The Characters Value-  ");
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c4);
      System.out.println(c5);
      System.out.println(c6);
      
      
      System.out.println("Printing Boolean Function-    ");
      System.out.println(isIndiannationality);
      System.out.println(e2);
	
      
      System.out.println("Printing The Value OF String");
      System.out.println(javaversion);
      System.out.println(employed);
      System.out.println(password);
      System.out.println(candidate_name);
      
      
      
	}

}
