package com.java;
import javax.swing.*;
public class Numbergame {

	public static void main(String[] args) {
int computernumber=(int)(Math.random()*100+1);
int userans=0;
int count=1;
try {
	while(userans!=computernumber)
	{
		String response=JOptionPane.showInputDialog(null,"guess a number between 1 and 100");
		userans=Integer.parseInt(response);
		JOptionPane.showMessageDialog(null," " + determineGuess(userans,computernumber,count));
		count++;
		
	}
}
catch (Exception e)
{
// To handles exception 
}
}
public static  String determineGuess(int userans,int computernumber,int count)
{
	if(userans<=0||userans>100)
	{
		return "your guess is invalid";
	}
	else if(userans==computernumber) {
		return "correct!\n Total your number of guesses are:"+count;
		
	}
	else if(userans>computernumber)
	{
		return "entered number is to high , please try again, \n number of guesses are:"+count;
		
	}
	else if(userans<computernumber)
	{
		return " entered numberis too low,try again,\n number of guesses are:"+count;
		
	}
	else {
		return "your guess is in correct \n number of guesses are:"+count;
		}
	}
}