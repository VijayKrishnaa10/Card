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
public class DeckofCardTest {
 public static void main( String args[] )
 {
 DeckOfCards myDeckOfCards = new DeckOfCards();
 myDeckOfCards.shuffle(); // place Cards in random order

 // print all 52 Cards in the order in which they are dealt
 for ( int i = 0; i <13; i++ )
 {
 // deal and print 4 Cards
 System.out.printf( "%-20s%-20s%-20s%-20s\n",
 myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
 myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
 } // end for
 } // end main
 }

