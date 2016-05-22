package springhibernaye;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class InsertTest {  
public static void main(String[] args) {  
      
//    Resource r=new ClassPathResource("applicationContext.xml");  
//   BeanFactory factory=new XmlBeanFactory(r);  
      
	@SuppressWarnings("resource")
	ApplicationContext con=new ClassPathXmlApplicationContext("springhibernaye/applicationContext.xml");

	
	
    EmployeeDao dao=(EmployeeDao)con.getBean("d");  
      
    Employee e=new Employee();  
    e.setId(114);  
    e.setName("varun");  
    e.setSalary(50000);  
      
    dao.saveEmployee(e);  
    dao.updateEmployee(e);
      
}  
}  
