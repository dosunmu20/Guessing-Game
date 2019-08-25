/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StartGame { 
    
Player targetNumber;
  int[] players = new int[3];
  boolean p1IsRight = false;
  boolean p2IsRight = false;
  boolean p3IsRight = false; 
  boolean flag = true;
    
    public void startGame(){
    
     targetNumber = new Player(); 
     Scanner scan = new Scanner(System.in);
     
  
     
     
     while(flag){ 
         System.out.println("Players should guess a number between 0 AND 10");
         
        
         
         for (int i = 0; i<=2; i++){
             try{
             System.out.println("Player"+(i+1)+ " guess your number: ");
             players[i] = scan.nextInt(); 
             if (players[i] > 10 ){
               System.out.println( "Player" +(i+1)+ " please enter a valid integer between 0 and 10");
               players[i] = scan.nextInt();
             }
             } catch (Exception e){
                System.out.println(e); 
                System.out.println("Enter a valid integer between 0 and 10");
                players[i] = scan.nextInt();
             } 
            
             
         }      
         int number = targetNumber.guess();
         
         if (players[0] == number){
             p1IsRight = true;
         }
         
         if (players[1] == number){
             p2IsRight = true;
         }
         
         if (players[2] == number){
             p3IsRight = true;
         }
         
         if (p3IsRight || p2IsRight || p1IsRight ){
             System.out.println("We have a Winnner!");
             System.out.println("Player 1 guessed right? " +p1IsRight);
             System.out.println("Player 2 guessed right? " +p2IsRight);
             System.out.println("Player 3 guessed right? " +p3IsRight);
             
             System.out.println("Do you still want to play? if yes, enter 1 else enter another number");
             int intTemp = scan.nextInt(); 
             System.out.println("");
             if (intTemp == 1)
                continue;  
             else 
                break;
         } 
         
         else {
             System.out.println("oops! no one got it right. The correct number is " +number);
             System.out.println("Press \"1\" to end game or \"any other number to continue\" to retry");
             int n = scan.nextInt();
            System.out.println("");
             if ( n == 1){
                 System.out.println("The game has ended!");
                 flag = false;
             }
         }
         
         
   
     }
     
    }  
}
