package com.desvoitures.model;

public class Entry {

	public static void main(String[] args) {
		Car c = new Car();
		try {
			c.drive(300);
			c.drive(300);
			c.drive(300);
			c.drive(300);			
		}catch (EngineIsOffException e) {
			System.out.println("Allumes la voiture...");
		} catch (NoEnoughGazException e) {
			System.out.println("Vous n'avez plus d'essence, la voiture s'arrête");
		}
	}
}