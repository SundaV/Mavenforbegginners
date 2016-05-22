package mypack;

public class StoredProc {

public static void main(String[] args) {
	add(19);
	add(20,30,50,20);
}
public static void add(int... x){
	
	
	int sum=0;
	int y=0;
	for (int i : x) {
		sum=sum+i;
	}
	System.out.println(sum);
	
}


}
