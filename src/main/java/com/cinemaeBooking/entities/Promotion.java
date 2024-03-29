package com.cinemaeBooking.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="promotion")
public class Promotion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int promotionId;
	
	private String promotionCode;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	private float promotional_Value;

	//@OneToOne(mappedBy = "promotion", cascade = CascadeType.ALL)

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "promotion")
	private Set<Booking> bookingList;
	
	@Transient
    private RStatus rStatus;
	
	public int getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}
	public String getPromotionCode() {
		return promotionCode;
	}
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getPromotional_Value() {
		return promotional_Value;
	}
	public void setPromotional_Value(float promotional_Value) {
		this.promotional_Value = promotional_Value;
	}
	public RStatus getRStatus() {
        return this.rStatus;
    }

    public void setRStatus(RStatus rStatus) {
        this.rStatus = rStatus;
    }


	/*public Set<Booking> getBookingList() {
		return this.bookingList;
	}

	public void setBookingList(Set<Booking> bookingList) {
		this.bookingList = bookingList;
	}*/
	

}
