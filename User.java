
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
	
	
	
	
	public String setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String 
	
	public User createAccount(User user)
	{
		return user;
	}
	
	private String setPassword(String password)
	{
		return null;
	}
	
	

}
