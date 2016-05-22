package hibernate;



import java.sql.SQLException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dto.UserDetails;
import dto.Vehicle;

public class HibernateTest  {
public static void main(String[] args) throws SQLException  {
	UserDetails user=new UserDetails();
	
	user.setUserName("prr5");
	
	user.setDescription(new Date());
	user.setUserId(1234);
	user.setJoined(new Date().toString());

	
	
	Vehicle vehicle=new Vehicle();
	vehicle.setVehicleId(200);
	vehicle.setVehicleName("car");
	vehicle.setVehicleNo("AA");
	
	
	
	
	
	/*TwoWheeler t=new TwoWheeler();
	t.setBike("yahmanah");

	
	
	FourWheeler f=new FourWheeler();
	f.setcar("bentley");*/
	
	
	
	
	/*TwoWheeler bike=new TwoWheeler();
	bike.setVehicleId(200);
	bike.setSteeringHandle("bie");	
	bike.setVehicleName("honda");
	
	FourWheeler car=new FourWheeler();
	car.setVehicleId(123);
	car.setVehicleName("audi");
	car.setSteeringWheel("car");
user.getListofvehicle().add(v);*/
	
user.setVehicle(vehicle);
SessionFactory sessionFactory =	new Configuration().configure().buildSessionFactory();


Session session=sessionFactory.openSession();

session.beginTransaction();


session.save(user);




/*session.save(v);
session.save(v1);*/
//session.save(addr);
//session.save(v);
/*session.save(car);
session.save(bike);*/
/*System.out.println("vjhjg");*/

//System.out.println((UserDetails)session.get(UserDetails.class, new String("vi jay")));
session.getTransaction().commit();
 session.close();
 
 session=sessionFactory.openSession();

 session.beginTransaction();
 System.out.println(((UserDetails)session.get(UserDetails.class,"prr5")).getDescription());

 session.close();
  
// user=null;
// session=sessionFactory.openSession();
// session.beginTransaction();
 /*user=(UserDetails)session.get(UserDetails.class, "s");
 session.close();
 System.out.println(user.getListofAddress().size());*/
}
}
