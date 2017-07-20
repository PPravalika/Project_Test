package com.example.innovecture.core.impl;

import com.example.innovecture.core1.Animals;

public class GoldFish implements Animals {
	

	   public String habitat() {
			return "Habitat of GoldFish is Water";
			
		}

		public String food() {
			return "GoldFish is a Omnivores ";
			
		}

	
		public Boolean isAPet() {
			return true;
		}

		public Boolean canSwim() {
			return true;
		}

}
