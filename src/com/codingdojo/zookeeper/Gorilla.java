package com.codingdojo.zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
		super();
	}
	public void throwSomething() {
		System.out.println("The gorilla has thrown something");
		energyLevel-=5;
		displayEnergy();
	}
	public void eatBananas() {
		System.out.println("The gorilla is satisfied from eating the banana");
		energyLevel+=10;
		displayEnergy();
	}
	public void climb() {
		System.out.println("The gorilla has climbed a tree");
		energyLevel-=10;
		displayEnergy();
	}
}
