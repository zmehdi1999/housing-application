import java.util.ArrayList;

public class Property {
	protected String location;
	protected String Vacancy;
	protected double Price;
	protected int yearBuilt;
	protected int numBed;
	protected int numBath;
	protected Boolean washerAndDryer;
	protected Boolean pool;
	protected Boolean parking;
	protected Boolean pets;
	protected int vistaWS;
	protected int fpWS;
	protected int uscWS;
	
	public Property(String location, String Vacancy, double Price, int yearBuilt, int numBed, int numBath, Boolean washerAndDryer, Boolean pool, Boolean parking, Boolean pets, int vistaWS, int fpWS, int uscWS){
		this.location = location;
		this.Vacancy = Vacancy;
		this.Price = Price;
		this.yearBuilt = yearBuilt;
		this.numBed = numBed;
		this.numBath = numBath;
		this.washerAndDryer = washerAndDryer;
		this.pool = pool;
		this.parking = parking;
		this.pets = pets;
		this.vistaWS = vistaWS;
		this.fpWS = fpWS;
		this.uscWS = uscWS;
	}
	
	public enum Amenity {
		WASHER,DRYER,GYM,POOL,TRANSPORT,PETS,FURNITURE,WIFI,WALKTOCAMPUS;
	}
	
	
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/////////////////	Getters	    ////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
	public String getLocation() {
		return location;
	}
	public String getVacancy() {
		return Vacancy;
	}
	public double getPrice() {
		return Price;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public int getNumBed() {
		return numBed;
	}
	public int getNumBath() {
		return numBath;
	}
	public Boolean getWasherAndDryer() {
		return washerAndDryer;
	}
	public Boolean getPool() {
		return pool;
	}
	public Boolean getParking() {
		return parking;
	}
	public Boolean getPets(){
		return pets;
	}
	public int getVistaWS() {
		return vistaWS;
	}
	public int getFPWS() {
		return fpWS;
	}
	public int getUSCWS() {
		return uscWS;
	}
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/////////////////	Setters	    ////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
	
	public void setLocation(String location) {
		this.location = location;
	}
	public void setVacancy(String Vacancy) {
		this.Vacancy = Vacancy;
	}
	public void setPrice(double Price) {
		this.Price = Price;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public void setNumBed(int numBed) {
		this.numBed = numBed;
	}
	public void setNumBath(int numBath) {
		this.numBath = numBath;
	}
	public void setWasherAndDryer(Boolean washerAndDryer) {
		this.washerAndDryer = washerAndDryer;
	}
	public void setPool(Boolean pool) {
		this.pool = pool;
	}
	public void setParking (Boolean parking) {
		this.parking = parking;
	}
	public void setLawncare(Boolean pets) {
		this.pets = pets;
	}
	public void setVistaWS(int vistaWS) {
		this.vistaWS = vistaWS;
	}
	public void setFPWS(int fpWS) {
		this.fpWS = fpWS;
	}
	public void setUSCWS(int uscWS) {
		this.uscWS = uscWS;
	}
/////////////////////////////////////////////////////////////////
	/////////////// ARRAYS ////////////////////////
	///////////////////////////////////////////////
	public ArrayList<String> userReviews;
	public ArrayList<String> landlordReviews;
	//end of class
	public static Property getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	public void getProperties()
	{
		//TODO 
	}
}
