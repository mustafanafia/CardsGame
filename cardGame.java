//********************************************
// Name:            Mustafa Mohammednafia
// Date:            9/20/2018
// Instructor:                                                                                                                                                                                                                       Cindy Tucker

import java.util.Scanner;
import java.util.Random;
public class cardGame {
    public static void main (String[] args) {
        
        Scanner scnr = new Scanner (System.in);
        Random randGen = new Random();

        
        int dalmuti = 1;
        int archbishop = 2;
        int earlMarshal = 3;
        int baroness = 4;
        int abbess = 5;
        int knight = 6;
        int seamstress = 7;
        int mason = 8;
        int cook = 9;
        int shepherdess = 10;
        int stonecutter = 11;
        int peasant = 12;
        int jester = 2;
        
        int num = 0;
        int i;
        
        int firstCard;
        int secondCard;
        
        if (num < dalmuti) {
            System.out.println("Card 1:" + " " + "Dalmuti");
       }
       
            System.out.println();
       
        for (i = 1; i < archbishop; ++i) {
            System.out.println("Card 2:" + " " + "Archbishop");
            System.out.println("Card 3:" + " " + "Archbishop");
        }
        
            System.out.println();
            
        for (i = 2; i < earlMarshal; ++i) {
            System.out.println("Card 4:" + " " + "EarlMarshal");
            System.out.println("Card 5:" + " " + "EarlMarshal");
            System.out.println("Card 6:" + " " + "EarlMarshal");        
        }
        
            System.out.println();
            
        for (i = 3; i < baroness; ++i) {
            
            System.out.println("Card 7:" + " " + "Baroness");
            System.out.println("Card 8:" + " " + "Baroness");
            System.out.println("Card 9:" + " " + "Baroness");
            System.out.println("Card 10:" + " " + "Baroness");
        }
        
            System.out.println();
            
        for (i = 4; i < abbess; ++i) {
            
            System.out.println("Card 11:" + " " + "Abbess");
            System.out.println("Card 12:" + " " + "Abbess");
            System.out.println("Card 13:" + " " + "Abbess");
            System.out.println("Card 14:" + " " + "Abbess");
            System.out.println("Card 15:" + " " + "Abbess");
        }
            
            System.out.println();
            
            for (i = 5; i < knight; ++i) {
            
            System.out.println("Card 16:" + " " + "Knight");
            System.out.println("Card 17:" + " " + "Knight");
            System.out.println("Card 18:" + " " + "Knight");
            System.out.println("Card 19:" + " " + "Knight");
            System.out.println("Card 20:" + " " + "Knight");
            System.out.println("Card 21:" + " " + "Knight");
        }
        
            System.out.println();
                        
        
            for (i = 6; i < seamstress; ++i) {
            
            System.out.println("Card 22:" + " " + "Seamstress");
            System.out.println("Card 23:" + " " + "Seamstress");
            System.out.println("Card 24:" + " " + "Seamstress");
            System.out.println("Card 25:" + " " + "Seamstress");
            System.out.println("Card 26:" + " " + "Seamstress");
            System.out.println("Card 27:" + " " + "Seamstress");
            System.out.println("Card 28:" + " " + "Seamstress");
        }
            System.out.println();
            
            for (i = 7; i < mason; ++i) {
                
            System.out.println("Card 29:" + " " + "Mason");
            System.out.println("Card 30:" + " " + "Mason");
            System.out.println("Card 31:" + " " + "Mason");
            System.out.println("Card 32:" + " " + "Mason");
            System.out.println("Card 33:" + " " + "Mason");
            System.out.println("Card 34:" + " " + "Mason");
            System.out.println("Card 35:" + " " + "Mason");
            System.out.println("Card 36:" + " " + "Mason");
        }
           System.out.println();
           
           for (i = 8; i < cook; ++i) {
               
            System.out.println("Card 37:" + " " + "cook");
            System.out.println("Card 38:" + " " + "cook");
            System.out.println("Card 39:" + " " + "cook");
            System.out.println("Card 40:" + " " + "cook");
            System.out.println("Card 41:" + " " + "cook");
            System.out.println("Card 42:" + " " + "cook");
            System.out.println("Card 43:" + " " + "cook");
            System.out.println("Card 44:" + " " + "cook");
            System.out.println("Card 45:" + " " + "cook");
        }
            System.out.println();
        
          for (i = 9; i < shepherdess; ++i) {
              
            System.out.println("Card 46:" + " " + "Shepherdess");
            System.out.println("Card 47:" + " " + "Shepherdess");
            System.out.println("Card 48:" + " " + "Shepherdess");
            System.out.println("Card 49:" + " " + "Shepherdess");
            System.out.println("Card 50:" + " " + "Shepherdess");
            System.out.println("Card 51:" + " " + "Shepherdess");
            System.out.println("Card 52:" + " " + "Shepherdess");
            System.out.println("Card 53:" + " " + "Shepherdess");
            System.out.println("Card 54:" + " " + "Shepherdess");
            System.out.println("Card 55:" + " " + "Shepherdess");
        }
            System.out.println();
        
            for (i = 10; i < stonecutter; ++i) {
              
            System.out.println("Card 56:" + " " + "Stonecutter");
            System.out.println("Card 57:" + " " + "Stonecutter");
            System.out.println("Card 58:" + " " + "Stonecutter");
            System.out.println("Card 59:" + " " + "Stonecutter");
            System.out.println("Card 60:" + " " + "Stonecutter");
            System.out.println("Card 61:" + " " + "Stonecutter");
            System.out.println("Card 62:" + " " + "Stonecutter");
            System.out.println("Card 63:" + " " + "Stonecutter");
            System.out.println("Card 64:" + " " + "Stonecutter");
            System.out.println("Card 65:" + " " + "Stonecutter");
            System.out.println("Card 66:" + " " + "Stonecutter");
        }
            System.out.println();
            
            for (i = 11; i < peasant; ++i) {
              
            System.out.println("Card 67:" + " " + "Peasant");
            System.out.println("Card 68:" + " " + "Peasant");
            System.out.println("Card 69:" + " " + "Peasant");
            System.out.println("Card 70:" + " " + "Peasant");
            System.out.println("Card 71:" + " " + "Peasant");
            System.out.println("Card 72:" + " " + "Peasant");
            System.out.println("Card 73:" + " " + "Peasant");
            System.out.println("Card 74:" + " " + "Peasant");
            System.out.println("Card 75:" + " " + "Peasant");
            System.out.println("Card 76:" + " " + "Peasant");
            System.out.println("Card 77:" + " " + "Peasant");
            System.out.println("Card 78:" + " " + "Peasant");
        }
            System.out.println();
        
            for (i = 1; i < jester; ++i) {
            System.out.println("Card 79:" + " " + "Jester");
            System.out.println("Card 80:" + " " + "Jester");
        }
    
            System.out.println();
        
    
    
    firstCard = randGen.nextInt(13) + 1;

    
    if (firstCard == 1) {
    System.out.println("Your random card is: " + "Dalmuti");
}

        if (firstCard == 2){
        System.out.println("Your random card is: " + "Archbishop");
    }   
        if (firstCard == 3){
        System.out.println("Your random card is: " + "EarlMarshal");
    }   
        if (firstCard == 4){
        System.out.println("Your random card is: " + "Baroness");
    }   
        if (firstCard == 5){
        System.out.println("Your random card is: " + "Abbess");
    }
        if (firstCard == 6){
        System.out.println("Your random card is: " + "Knight");
    }   
        if (firstCard == 7){
        System.out.println("Your random card is: " + "Seamstress");
    }  
        if (firstCard == 8){
        System.out.println("Your random card is: " + "Mason");
    }  
        if (firstCard == 9){
        System.out.println("Your random card is: " + "cook");
    }   
        if (firstCard == 10){
        System.out.println("Your random card is: " + "shepherdess");
    }   
        if (firstCard == 11){
        System.out.println("Your random card is: " + "stonecutter");
    }   
        if (firstCard == 12){
        System.out.println("Your random card is: " + "Peasant");
    }   
        if (firstCard == 13){
        System.out.println("Your random card is: " + "Jester");
    }
    
    
    secondCard = randGen.nextInt(13) + 1; 
    
    
  while (secondCard < 1 || secondCard > 13)  {
      
      System.out.println("Enter a number in the range [1-13] ");
      secondCard = scnr.nextInt();
    }
    
    
    switch (secondCard) {
        case 1: System.out.println("Computer card is: " + "Dalmuti");
        break;
        case 2: System.out.println("Computer card is: " + "Archbishop");
        break;
        case 3: System.out.println("Computer card is: " + "EarlMarshal");
        break;
        case 4: System.out.println("Computer card is: " + "Baroness");
        break;
        case 5: System.out.println("Computer card is: " + "Abbess");
        break;
        case 6: System.out.println("Computer card is: " + "Knight");
        break;
        case 7: System.out.println("Computer card is: " + "Seamstress");
        break;
        case 8: System.out.println("Computer card is: " + "Mason");
        break;
        case 9: System.out.println("Computer card is: " + "cook");
        break;
        case 10: System.out.println("Computer card is: " + "Shepherdess");
        break;
        case 11: System.out.println("Computer card is: " + "Stonecutter");
        break;
        case 12: System.out.println("Computer card is: " + "Peasant");
        break;
        case 13: System.out.println("Computer card is: " + "Jester");
        break;
        default: System.out.println("ERROR");
    }
    
    if (firstCard > secondCard) {
        System.out.println("The winner is Computer.");
    }

    else if (firstCard == secondCard) {
        System.out.println("it's a TIE!");
    }
    else {
            System.out.println("The winner is YOU!");
            
          
            
        }

        
    }

}



