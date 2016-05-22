package junit;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
public class That {
	@Test
public void Test() throws Exception{
	
	
	int a=20;
	assertThat(a, equalTo(30));
//	assertThat(a, either(is(100))or(is(90)));
//	
	
}

}
