package com.codingdojo.zookeeper;

public class Bat extends Mammal{
	public Bat() {
		super();
		energyLevel=300;
	}
	
	public void fly() {
		System.out.println("flap flap");
		energyLevel-=50;
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel+=25;
		displayEnergy();
	}
	public void attackTown() {
		System.out.println("The town is on fire!");
		energyLevel-=100;
		displayEnergy();
	}
}
