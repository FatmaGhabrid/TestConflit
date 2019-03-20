package com.desvoitures.model;

public class EngineIsOffException extends RuntimeException {
	public EngineIsOffException() {
		super("La voiture n'est pas démarrée");
	}

}
