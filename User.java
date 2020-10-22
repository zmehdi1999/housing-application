
public class User {
	
	protected String firstName;
	protected String lastName;
	protected String userName;
	protected String email;
	protected String password;
	protected int phoneNum;
	protected boolean registered;
	protected boolean tenant;
	protected boolean owner;
	protected int rating;
	
	public User(String firstName, String lastName, String userName, String email, String password, int phoneNum, bool registered, bool tenant, bool owner, int rating) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
		this.registered = registered;
		this.tenant = tenant;
		this.owner = owner;
		this.rating = rating; 
	}
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/////////////////	Getters	    ////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public bool getRegistered() {
		return registered;
	}
	public bool getTenant() {
		return tenant;
	}
	public bool getOwner() {
		return owner;
	}
	public int getRating() {
		return rating;
	}
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/////////////////	Setters	    ////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
	
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setRegistered(bool registered){
		this.registered = registered;
	}
	public void setTenant(bool tenant){
		this.tenant = tenant;
	}
	public void setOwner(bool owner) {
		this.owner = owner;
	}
	public void setRating(int rating) {
		this.rating = rating; 
	}
}
