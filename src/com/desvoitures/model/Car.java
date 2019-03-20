package com.desvoitures.model;

public class Car {
	private final static float tankSize = 70;
	private float tank = tankSize;
	private boolean started = true;
	
	public void drive(float distance) throws NoEnoughGazException, EngineIsOffException {
		if(!started) {
			throw new EngineIsOffException();
		}
		if(tank < distance*.08) {
			this.tank = 0;
			this.started = false;
			throw new NoEnoughGazException(tank);
		}
		tank -= distance*.08;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Car [tank=" + tank + "]";
	}

	public boolean isStarted() {
		return started;
	}

	public float getTank() {
		return tank;
	}

	public void setTank(float tank) {
		this.tank = tank;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}
	
	
}
