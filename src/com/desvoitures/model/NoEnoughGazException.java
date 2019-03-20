package com.desvoitures.model;

public class NoEnoughGazException extends Exception {
	public NoEnoughGazException(float gasLeft) {
		super("Pas assez d'essence, il ne te reste que "+gasLeft+" Litres");
	}

}
