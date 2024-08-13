package com.burakb.entities;

public class Referee extends Person{
	private String refereeID;  // Hakemin ID'si
	private String refereeFirstName; // Hakemin adı
	private String refereeLastName;  // Hakemin soyadı
	
	// Yapıcı (constructor)
	public Referee(String refereeID, String refereeFirstName, String refereeLastName, String name, int age, String nationality) {
		super(name, age, nationality); // Person sınıfının yapıcısını çağırır
		this.refereeID = refereeID;
		this.refereeFirstName = refereeFirstName;
		this.refereeLastName = refereeLastName;
	}
	
	// Getter ve Setter metodları
	public String getRefereeID() {
		return refereeID;
	}
	
	public void setRefereeID(String refereeID) {
		this.refereeID = refereeID;
	}
	
	public String getRefereeFirstName() {
		return refereeFirstName;
	}
	
	public void setRefereeFirstName(String refereeFirstName) {
		this.refereeFirstName = refereeFirstName;
	}
	
	public String getRefereeLastName() {
		return refereeLastName;
	}
	
	public void setRefereeLastName(String refereeLastName) {
		this.refereeLastName = refereeLastName;
	}
	
	// toString metodu
	@Override
	public String toString() {
		return super.toString() + ", Referee [refereeID=" + refereeID + ", firstName=" + refereeFirstName + ", lastName=" + refereeLastName + "]";
	}
}