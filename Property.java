<<<<<<< HEAD
public class Property {
	
	public Property() {
		
	}
	
	public bool Vacancy() {
		
	}
	
	public String Location() {
	}
	public double Price() {
	}
	
	public int yearBuilt() {
	}
	
	public int numBed() {
		
	}
	public int numBath() {
	}
	public bool washerAndDryer() {
	}
	
	public bool pool() {
	}
	public bool parking() {
	}
	public bool lawncare() {
	}
	public int vistaWS() {
	}
	public int fpWS() {
	}
	public int uscWS() {
	}
	public ArrayList<String> userReviews() {
	}
	public ArrayList<String> landlordReviews() {
		
	}
		
		
	
	
	
}
=======
public class Property {
	
	protected String location;
	protected String Vacancy;
	protected double Price;
	protected int yearBuilt;
	protected int numBed;
	protected int numBath;
	protected String washerAndDryer;
	protected String pool;
	protected String parking;
	protected String lawncare;
	protected int vistaWS;
	protected int fpWS;
	protected int uscWS;
	
	public Property(String location, String Vacancy, double Price, int yearBuilt, int numBed, int numBath, String washerAndDryer, String pool, String parking, String lawncare, int vistaWS, int fpWS, int uscWS){
		this.location = location;
		this.Vacancy = Vacancy;
		this.Price = Price;
		this.yearBuilt = yearBuilt;
		this.numBed = numBed;
		this.numBath = numBath;
		this.washerAndDryer = washerAndDryer;
		this.pool = pool;
		this.parking = parking;
		this.lawncare = lawncare;
		this.vistaWS = vistaWS;
		this.fpWS = fpWS;
		this.uscWS = uscWS;
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
	public String getWasherAndDryer() {
		return washerAndDryer;
	}
	public String getPool() {
		return pool;
	}
	public String getParking() {
		return parking;
	}
	public String getLawncare(){
		return lawncare;
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
	public void setWasherAndDryer(String washerAndDryer) {
		this.washerAndDryer = washerAndDryer;
	}
	public void setPool(String pool) {
		this.pool = pool;
	}
	public void setParking (String parking) {
		this.parking = parking;
	}
	public void setLawncare(String lawncare) {
		this.lawncare = lawncare;
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
	public ArrayList<String> userReviews() {
	}
	public ArrayList<String> landlordReviews() {
		
	}
		
		
	
	
	
}
>>>>>>> branch 'main' of https://github.com/zmehdi1999/housing-application.git
