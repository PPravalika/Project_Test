package com.example.innovecture.core.impl;

/**
 * @author PPRAVALIKA
 * 
 */
import com.example.innovecture.core1.*;
import com.example.innovecture.core1.Animals;

public class Dog implements Animals {

	public String habitat() {
		return "Habitat of Dog is Land";
		
	}

	public String food() {
		return "Dog is a herbivores";
		
	}

		
	public Boolean isAPet() {
		return true;
	}

	public Boolean canSwim() {
		return false;
	}

}
