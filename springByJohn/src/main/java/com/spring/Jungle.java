package com.spring;

import java.util.List;

public class Jungle {
	
	private Animal bigest;
	private List<Animal> animals;
	
	
	public Animal getBigest() {
		return bigest;
	}
	public void setBigest(Animal bigest) {
		this.bigest = bigest;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Bigest: " + bigest);
		sb.append("\n");
		sb.append("others:\n");
		for(Animal animal : animals){
			sb.append(animal);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	

}
