package view;

import java.util.Scanner;

import Classes.*;
import Items.*;
import Races.*;
import model.*;
import model.Character;

public class ConsoleView {

	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the D&D character generator for 5th Edition!");
		System.out.println("If you would like to start a new character type 'new'");
		System.out.println("Otherwise, if you would like to load a character, type 'load'");
		
		Scanner scanInput = new Scanner(System.in);
		String s = scanInput.next();
		if(s.equals("new")) {
			Character ch = Character.getInstance();
			ch.setCharName("Buttfuck Mcgee");
			ch.setAlignment(Alignment.CHAOTICEVIL);
			ch.setRace(new Dwarf());
			ch.addCharClass(new Barbarian());
			ch.setPlayerName("Donald Duck");
			ch.getInventory().addArmor(new StuddedLeather());
			ch.getStr().toggleProficiency();

			System.out.println("Ok, starting a new character...");
			
			
			
			
			
			//Check for answer
			 
			System.out.println("What is this character's name?");
			
			System.out.println(ch);
			
			
			
		}
		
	}
	
}
