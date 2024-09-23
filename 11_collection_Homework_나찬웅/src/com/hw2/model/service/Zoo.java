package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.dto.Animal;

public class Zoo {

	private List<Animal> animals;
	
	public Zoo() {
		animals = new ArrayList<>();
	}
	
	
	
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
		//System.out.println(animal.getName() + "이/가 추가되었습니다.");
		
	}
	
	
	
	public void showAnimals() {
		System.out.println("동물들의 울음소리를 들어보세요:");
		for(Animal animalsound :animals) {
			animalsound.sound();
		}
		
		
	}
	
	
	
	public void displayMenu() {
		System.out.println("1. 동물 추가");
		System.out.println("2. 동물 목록 조회");
		System.out.println("3. 종료");
		
		

	}
	
	
	
	
	
	
}
