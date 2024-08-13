package com.burakb.entities;

import java.time.LocalDate;

public class Fixture {
	
	private String homeTeam;
	private String awayTeam;
	private LocalDate matchDate;
	private String leagueID;
	
	
	public Fixture(String homeTeam, String awayTeam, LocalDate matchDate, String leagueID) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.matchDate = matchDate;
		this.leagueID = leagueID;
	}
	
	
	public String getHomeTeam() {
		return homeTeam;
	}
	
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	public String getAwayTeam() {
		return awayTeam;
	}
	
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public LocalDate getMatchDate() {
		return matchDate;
	}
	
	public void setMatchDate(LocalDate matchDate) {
		this.matchDate = matchDate;
	}
	
	public String getLeagueID() {
		return leagueID;
	}
	
	public void setLeagueID(String leagueID) {
		this.leagueID = leagueID;
	}
	
	
	@Override
	public String toString() {
		return "Fixture [homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", matchDate=" + matchDate + ", leagueID=" + leagueID + "]";
	}
}