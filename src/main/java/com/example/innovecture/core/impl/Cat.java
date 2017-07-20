package com.example.innovecture.core.impl;

/**
 * @author PPRAVALIKA
 * 
 */

import com.example.innovecture.core1.Animals;

public class Cat implements Animals {

	public String habitat() {
        return "Habitat of Cat is Land";
		
	}

	public String food() {
		return "Cat is a herbivores";

		
	}

	public Boolean isAPet() {
		return true;
	}

	public Boolean canSwim() {
		return false;
	}
 
	}

