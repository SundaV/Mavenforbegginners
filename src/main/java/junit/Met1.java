package junit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.hibernate.hql.ast.origin.hql.parse.HQLParser.aliasClause_return;
import org.hibernate.hql.ast.origin.hql.parse.HQLParser.mainEntityPersisterReference_return;
import org.hibernate.hql.ast.origin.hql.parse.HQLParser.new_key_return;

public class Met1 extends Met {
	
	private Met m;
	
	
	public Met getM() {
		return m;
	}


	public void setM(Met m) {
		this.m = m;
	}

private Map<Integer,Object > mp =new HashMap<Integer, Object>();






	public Map<Integer, Object> getMp() {
	return mp;
}


public void setMp(Map<Integer, Object> mp) {
	this.mp = mp;
}


	public static void main(String[] args) {
		
		
		Met m=new Met();

		
	m.getAl().add(10);
	System.out.println(m.getAl());
	

	
//m.getAl().add(10);
//m.setAl(m.getAl());
int i=10;
Integer wrap=new Integer(i);
System.out.println(wrap);
int unwrap=wrap.intValue();
System.out.println(unwrap);
		
		
		
		
	
		
		
	
	}

}
