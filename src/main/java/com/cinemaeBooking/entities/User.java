package com.cinemaeBooking.entities;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userID;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailID;
    private String phoneNumber;
    private Boolean promotionEnabled;
    private String verificationCode;

	//@OneToMany(mappedBy = "user")
	@OneToMany(mappedBy = "user", cascade=CascadeType.ALL)
    private Set<PaymentCard> paymentCards;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private HomeAddress address;

	//@OneToOne
	//@JoinColumn(name = "roleID")
	@ManyToOne(optional = true)
	@JoinColumn(name ="roleID")
	private UserType usertype;

	//@OneToOne
	//@JoinColumn(name = "statusID")
	@ManyToOne(optional = true)
	@JoinColumn(name ="statusID")
	//@ManyToOne
    //@JoinColumn(name = "statusID")
	private Status status;

	//@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
	private Set<Booking> bookingList;

	@Transient
	private String newPassword;

	@Transient
	private RStatus rstatus;
    
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailID() {
		return this.emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public Set<PaymentCard> getPaymentCards() {
		return this.paymentCards;
	}

	public void setPaymentCards(Set<PaymentCard> paymentCards) {
		this.paymentCards = paymentCards;
	}


	public HomeAddress getAddress() {
		return this.address;
	}

	public void setAddress(HomeAddress address) {
		this.address = address;
	}	

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public UserType getUsertype() {
		return this.usertype;
	}

	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Boolean isPromotionEnabled() {
		return this.promotionEnabled;
	}

	public Boolean getPromotionEnabled() {
		return this.promotionEnabled;
	}

	public void setPromotionEnabled(Boolean promotionEnabled) {
		this.promotionEnabled = promotionEnabled;
	}

	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public RStatus getRstatus() {
		return this.rstatus;
	}

	public void setRstatus(RStatus rstatus) {
		this.rstatus = rstatus;
	}

	/*public Set<Booking> getBookingList() {
		return this.bookingList;
	}

	public void setBookingList(Set<Booking> bookingList) {
		this.bookingList = bookingList;
	}*/

}