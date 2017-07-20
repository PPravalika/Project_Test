package com.example.innovecture.main.core;

import java.util.List;

import com.example.innovecture.main.AnimalData;

public interface IAnimal {
	public AnimalData getAnimalInformation(String animalName);
	public List<String> getAllPets(List<String> animals);
}
