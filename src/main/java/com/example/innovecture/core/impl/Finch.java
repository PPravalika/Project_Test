package com.example.innovecture.core.impl;

import com.example.innovecture.core1.Animals;

public class Finch implements Animals {

	   public String habitat() {
			return "Habitat of Finch is Land";
			
		}

		public String food() {
			return "Finch is a herbivore ";

			
		}

		public Boolean isAPet() {
			return true;
		}

		public Boolean canSwim() {
			return false;
		}

	
}
