package dto;

 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javassist.expr.NewArray;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAttribute;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="PANDA")
public class UserDetails {

	
	
	private int userId;

	

	@Id	 
	private String userName;
	
	//@Temporal(TemporalType.TIMESTAMP)
	private String joined;
	
@Embedded
private Vehicle vehicle;

	

	
	
	
//	@JoinTable( name="USER_VEHICLE" ,joinColumns=@JoinColumn(name="USER_ID"),inverseJoinColumns=@JoinColumn(name="VEHICLE_ID")
//	)
	
	


		


		
	

		


	


		public Vehicle getVehicle() {
	return vehicle;
}

public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
@Temporal(TemporalType.DATE)	
		private Date description;

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getJoined() {
		return joined;
	}

	public void setJoined(String joineddate) {
		this.joined = joined;
	}

	

	public Date getDescription() {
		return description;
	}

	public void setDescription(Date description) {
		this.description = description;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
