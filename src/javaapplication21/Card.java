/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author vijay
 */
public class Card {
    
 private String faces; // face of card ("Ace", "Deuce", ...)
 private String suits; // suit of card ("Hearts", "Diamonds", ...)
 // two-argument constructor initializes card's face and suit
 public Card( String cardFace, String cardSuit )
 {
 faces = cardFace; // initialize face of card
 suits = cardSuit; // initialize suit of card
 } // end two-argument Card constructor

 // return String representation of Card
 public String toString() 
 { 
 return faces + " of " + suits; 
 } // end method toString 
 }

