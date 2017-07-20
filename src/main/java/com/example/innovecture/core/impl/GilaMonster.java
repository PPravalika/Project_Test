package com.example.innovecture.core.impl;

import com.example.innovecture.core1.Animals;

public class GilaMonster implements Animals{
	
	   public String habitat() {
			return "Habitat of GilaMonster is Deserts";
			
		}

		public String food() {
			return "GilaMonster is a carnivores";
			
		}

		public Boolean isAPet() {
			return false;
		}

		public Boolean canSwim() {
			return true;
		}

}
