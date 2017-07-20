package com.example.innovecture.core.impl;

import com.example.innovecture.core1.Animals;

public class Turtle implements Animals{
	

	   public String habitat() {
			return "Habitat of Turtle is Water";
			
		}

		public String food() {
			return "Turtle is a Omnivores ";
			
		}

		public Boolean isAPet() {
			return false;
		}

		public Boolean canSwim() {
			return true;
		}

	
}
