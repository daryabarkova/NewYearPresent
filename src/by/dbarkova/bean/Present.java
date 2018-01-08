package by.dbarkova.bean;

import java.util.Arrays;

public class Present {
	
	private Sweet[] sweets;
	private Toy[] toys;
	
	private int sweetsAmount = 0;
	private int toysAmount = 0;
	
	public Present() {
		
	}
	
	public void addSweet(Sweet sweet, int amount) {
		for(int i = sweetsAmount; i < sweetsAmount + amount; i++) {
			sweets[i] = sweet;
		}
		sweetsAmount = sweetsAmount + amount;	
	}

	public void addToy(Toy toy, int amount) {
		for (int i = toysAmount; i < toysAmount + amount; i++) {
			toys[i] = toy;
		}
		toysAmount = toysAmount + amount;
		
}
		
	public int presentWeight() {
		int totalWeight = 0;
		for(int i = 0; i < sweetsAmount; i++) {
			if(sweets[i] == null) {
				System.out.println("Present lacks a sweet!!!");
			}else {totalWeight += sweets[i].getWeight();}
		} 
		for(int c = 0; c < toysAmount; c++) {
			if(toys[c] == null) {
				System.out.println("Present lacks a toy!!!");
			}else {
				totalWeight += toys[c].getWeight(); 
			}
		}
		return totalWeight;
	}


	@Override
	public String toString() {
		return "Present [sweets=" + Arrays.toString(sweets) + ", toys=" + Arrays.toString(toys) + "]";
	}
	
}
