import java.util.ArrayList;

public class Property {
	protected int id;
	protected String location;
	protected Boolean vacancy;
	protected int price;
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
	protected Boolean wifi; 
	protected Boolean gym;
	protected Boolean furnished;
	
	public Property(Boolean wifi, Boolean gym, Boolean furnished, int id, String location, Boolean vacancy, int price, int yearBuilt, int numBed, int numBath, Boolean washerAndDryer, Boolean pool, Boolean parking, Boolean pets, int vistaWS, int fpWS, int uscWS){
		this.id = id;
		this.wifi = wifi;
		this.gym = gym;
		this.furnished = furnished;
		this.location = location;
		this.vacancy = vacancy;
		this.price = price;
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
	public Boolean getWifi() {
		return wifi;
	}
	public Boolean getGym() {
		return gym;
	}
	public Boolean getFurnished() {
		return furnished;
	}
	public int getID() {
		return id;
	}
	public String getLocation() {
		return location;
	}
	public Boolean getVacancy() {
		return vacancy;
	}
	public double getPrice() {
		return price;
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
	public int getUscWS() {
		return uscWS;
	}
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/////////////////	Setters	    ////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}
	public void setGym(Boolean gym) {
		this.gym = gym;
	}
	public void setFurnished(Boolean furnished) {
		this.furnished= furnished;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setVacancy(Boolean vacancy) {
		this.vacancy = vacancy;
	}
	public void setPrice(int price) {
		this.price = price;
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
	/*public static Property getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	public void getProperties()
	{
		//TODO 
	}*/
}
