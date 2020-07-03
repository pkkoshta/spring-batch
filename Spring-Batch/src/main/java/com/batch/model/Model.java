package com.batch.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Model implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sno;
	private String officeName;
	private String pinCode;
	private String officeType;
	private String deliveryStatus;
	private String divisionName;
	private String regionName;
	private String circleName;
	private String taluk;
	private String districtName;
	private String stateName;
	private String telephone;
	private String relatedSubOffice;
	private String relatedHeadOffice;

	public Model() {		
	}
	public Model(int sno, String officeName, String pinCode, String officeType, String deliveryStatus, String divisionName,
			String regionName, String circleName, String taluk, String districtName, String stateName, String telephone,
			String relatedSubOffice, String relatedHeadOffice) {
		super();
		this.sno = sno;
		this.officeName = officeName;
		this.pinCode = pinCode;
		this.officeType = officeType;
		this.deliveryStatus = deliveryStatus;
		this.divisionName = divisionName;
		this.regionName = regionName;
		this.circleName = circleName;
		this.taluk = taluk;
		this.districtName = districtName;
		this.stateName = stateName;
		this.telephone = telephone;
		this.relatedSubOffice = relatedSubOffice;
		this.relatedHeadOffice = relatedHeadOffice;
	}





	public int getSno() {
		return sno;
	}





	public void setSno(int sno) {
		this.sno = sno;
	}





	public String getOfficeName() {
		return officeName;
	}





	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}





	public String getPinCode() {
		return pinCode;
	}





	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}





	public String getOfficeType() {
		return officeType;
	}





	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}





	public String getDeliveryStatus() {
		return deliveryStatus;
	}





	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}





	public String getDivisionName() {
		return divisionName;
	}





	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}





	public String getRegionName() {
		return regionName;
	}





	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}





	public String getCircleName() {
		return circleName;
	}





	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}





	public String getTaluk() {
		return taluk;
	}





	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}





	public String getDistrictName() {
		return districtName;
	}





	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}





	public String getStateName() {
		return stateName;
	}





	public void setStateName(String stateName) {
		this.stateName = stateName;
	}





	public String getTelephone() {
		return telephone;
	}





	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}





	public String getRelatedSubOffice() {
		return relatedSubOffice;
	}





	public void setRelatedSubOffice(String relatedSubOffice) {
		this.relatedSubOffice = relatedSubOffice;
	}





	public String getRelatedHeadOffice() {
		return relatedHeadOffice;
	}





	public void setRelatedHeadOffice(String relatedHeadOffice) {
		this.relatedHeadOffice = relatedHeadOffice;
	}





	@Override
	public String toString() {
		return "Model [  officename=" + officeName + ", pincode=" + pinCode + ", officetype="
				+ officeType + ", deliverystatus=" + deliveryStatus + ", regionname=" + regionName + ", circlename="
				+ circleName + ", taluk=" + taluk + ", districtname=" + districtName + ", statename=" + stateName
				+ ", telephone=" + telephone + ", relatedsuboffice=" + relatedSubOffice + ", relatedheadoffice="
				+ relatedHeadOffice + "]";
	}



}
