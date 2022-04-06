package rent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookerId;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int gamerId;
	private long balance;
	private int bonus;
	
	private String firstName;
	private String lastName;
	private String address;
	private int pin;
	private Long contactNumerPrimary;
	private String email;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public User(long userId, int bookerId, int gamerId, long balance, int bonus, String firstName, String lastName,
			String address, int pin, Long contactNumerPrimary, String email) {
		super();
		this.userId = userId;
		this.bookerId = bookerId;
		this.gamerId = gamerId;
		this.balance = balance;
		this.bonus = bonus;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pin = pin;
		this.contactNumerPrimary = contactNumerPrimary;
		this.email = email;
	}




	public long getUserId() {
		return userId;
	}




	public void setUserId(long userId) {
		this.userId = userId;
	}




	public int getBookerId() {
		return bookerId;
	}




	public void setBookerId(int bookerId) {
		this.bookerId = bookerId;
	}




	public int getGamerId() {
		return gamerId;
	}




	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}




	public long getBalance() {
		return balance;
	}




	public void setBalance(long balance) {
		this.balance = balance;
	}




	public int getBonus() {
		return bonus;
	}




	public void setBonus(int bonus) {
		this.bonus = bonus;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public int getPin() {
		return pin;
	}




	public void setPin(int pin) {
		this.pin = pin;
	}




	public Long getContactNumerPrimary() {
		return contactNumerPrimary;
	}




	public void setContactNumerPrimary(Long contactNumerPrimary) {
		this.contactNumerPrimary = contactNumerPrimary;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}



	
	
	
}
