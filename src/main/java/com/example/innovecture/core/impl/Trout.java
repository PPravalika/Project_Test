package com.example.innovecture.core.impl;

import com.example.innovecture.core1.Animals;

public class Trout implements Animals{
	

	   public String habitat() {
			return "Habitat of Trout is Water";
			
		}

		public String food() {
			return "Trout is a Omnivores";
			
		}

		public Boolean isAPet() {
			return true;
		}

		public Boolean canSwim() {
			return false;
		}



}
