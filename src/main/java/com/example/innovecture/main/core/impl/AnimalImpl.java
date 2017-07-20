package com.example.innovecture.main.core.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.innovecture.main.AnimalData;
import com.example.innovecture.main.core.IAnimal;

public class AnimalImpl implements IAnimal {

	@Override
	public AnimalData getAnimalInformation(String animalName) {
		AnimalData animalData = null;
		if (animalName.equalsIgnoreCase("Cat")) {
			animalData = new AnimalData();
			animalData.setAnimalName("Cat");
			animalData.setIsPet(true);
			animalData.setIsVeg(false);
		} else if (animalName.equalsIgnoreCase("Dog")) {
			animalData = new AnimalData();
			animalData.setAnimalName("Dog");
			animalData.setIsPet(true);
			animalData.setIsVeg(false);
		}else if (animalName.equalsIgnoreCase("Eagle")) {
			animalData = new AnimalData();
			animalData.setAnimalName("Eagle");
			animalData.setIsPet(false);
			animalData.setIsVeg(false);
		}else if (animalName.equalsIgnoreCase("Finch")) {
			animalData = new AnimalData();
			animalData.setAnimalName("Finch");
			animalData.setIsPet(true);
			animalData.setIsVeg(false);
		}else if (animalName.equalsIgnoreCase("GilaMonster")) {
			animalData = new AnimalData();
			animalData.setAnimalName("GilaMonster");
			animalData.setIsPet(false);
			animalData.setIsVeg(false);
		}else if (animalName.equalsIgnoreCase("GoldFish")) {
			animalData = new AnimalData();
			animalData.setAnimalName("GoldFish");
			animalData.setIsPet(true);
			animalData.setIsVeg(true);
		}else if (animalName.equalsIgnoreCase("Trout")) {
			animalData = new AnimalData();
			animalData.setAnimalName("Trout");
			animalData.setIsPet(true);
			animalData.setIsVeg(true);
		}else if (animalName.equalsIgnoreCase("Turtle")) {
			animalData = new AnimalData();
			animalData.setAnimalName("Turtle");
			animalData.setIsPet(false);
			animalData.setIsVeg(false);
		}
		return animalData;
	}

	@Override
	public List<String> getAllPets(List<String> animals) {
		List<String> petAnimals = new ArrayList<String>();
		for (String animalData : animals) {
			AnimalData data = getAnimalInformation(animalData);
			if (data.getIsPet()) {
				petAnimals.add(data.getAnimalName());
			}

		}
		return petAnimals;
	}

}
