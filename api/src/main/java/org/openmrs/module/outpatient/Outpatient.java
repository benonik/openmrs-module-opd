/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.outpatient;

import java.io.Serializable;
import org.openmrs.BaseOpenmrsObject;
import org.openmrs.BaseOpenmrsMetadata;
import java.util.Date;

/**
 * It is a model class. It should extend either {@link BaseOpenmrsObject} or {@link BaseOpenmrsMetadata}.
 */
public class Outpatient extends BaseOpenmrsObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String patientId;
	private Integer outPatientId;
	private String phoneNumber;
	private String resident;
	private String county;
	private String gender;
	private Date dateOfBirth;

	/*change and creation meta-data*/

	private String createdBy;
	private Date  dateCreated;
	private String changedBy;
	private Date  dateChanged;

	//setters and getters
	public Integer getOutpatientId(){
		return outPatientId;
	}
	public void setOutPatientId(Integer outPatientId)
	{
		this.outPatientId=outPatientId;
	}
    public String getPatientId(){ return patientId; }
    public void setPatientId(String patientId){ this.patientId=patientId;}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public String getResident(){
		return resident;
	}
	public void setResident(String resident){
		this.resident=resident;
	}
	public String getCounty(){
		return county;
	}
	public void setCounty(String county){
		this.county=county;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public Date getDateOfBirth(){
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth){
		this.dateOfBirth=dateOfBirth;
	}
	//some code to go here
	//
	public String getCreatedBy(){
		return createdBy;
	}
	public void setCreatedBy(String changedBy){
		this.changedBy=changedBy;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated=dateCreated;
	}
	public String getChangedBy(){
		return changedBy;
	}
	public void setChangedBy(String changedBy){
		this.changedBy=changedBy;
	}
	public Date getDateChanged(){
		return dateChanged;
	}
	public void setDateChanged(Date dateChanged){
		this.dateChanged=dateChanged;
	}



	@Override
	public Integer getId() {
		return getOutpatientId();
	}

	@Override
	public void setId(Integer id) {
		setOutPatientId(id);
	}


}