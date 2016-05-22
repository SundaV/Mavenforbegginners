package dto;



import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Vehicle {

private int vehicleId;

private String vehicleName;
private String vehicleNo;

public String getVehicleNo() {
	return vehicleNo;
}

public void setVehicleNo(String vehicleNo) {
	this.vehicleNo = vehicleNo;
}

public int getVehicleId() {
	return vehicleId;
}

public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}

public String getVehicleName() {
	return vehicleName;
}

public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}

}
