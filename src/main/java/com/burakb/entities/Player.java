package com.burakb.entities;

import java.util.Set;

public class Player extends Person{
	private String playerID;
	private String playerName;
	private int playerAge;
	private double piRating;
	private String currentClub;
	private double value;
	private double wage;
	private Set<Position> positions;
	private Position preferredPosition;
	
	
	public Player(String playerID, String playerName, int playerAge, double piRating, String currentClub, double value, double wage, Set<Position> positions, Position preferredPosition, String name, int age, String nationality) {
		super(name, age, nationality);
		this.playerID = playerID;
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.piRating = piRating;
		this.currentClub = currentClub;
		this.value = value;
		this.wage = wage;
		this.positions = positions;
		this.preferredPosition = preferredPosition;
	}
	
	
	public String getPlayerID() {
		return playerID;
	}
	
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getPlayerAge() {
		return playerAge;
	}
	
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	
	public double getPiRating() {
		return piRating;
	}
	
	public void setPiRating(double piRating) {
		this.piRating = piRating;
	}
	
	public String getCurrentClub() {
		return currentClub;
	}
	
	public void setCurrentClub(String currentClub) {
		this.currentClub = currentClub;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public double getWage() {
		return wage;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public Set<Position> getPositions() {
		return positions;
	}
	
	public void setPositions(Set<Position> positions) {
		this.positions = positions;
	}
	
	public Position getPreferredPosition() {
		return preferredPosition;
	}
	
	public void setPreferredPosition(Position preferredPosition) {
		this.preferredPosition = preferredPosition;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", Player [playerID=" + playerID + ", playerName=" + playerName + ", playerAge=" + playerAge + ", piRating=" + piRating + ", currentClub=" + currentClub + ", value=" + value + ", wage=" + wage + ", positions=" + positions + ", preferredPosition=" + preferredPosition + "]";
	}
}