package com.launcher.simulator.vehicles;

import com.launcher.simulator.Coordinates;

/**
 * Aircraft
 */
public class Aircraft {
	protected long id;
	protected String name;
	protected Coordinates coordinates;

	private static long idCounter = 0;

	protected Aircraft(String name, Coordinates coordinates) {
		this.id = nextId();
		this.coordinates = coordinates;
		this.name = name;
	}

	private long nextId() {
		return ++idCounter;
	}
}
