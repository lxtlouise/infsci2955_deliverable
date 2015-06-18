import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test.*;


public class testJunit {
@Test
public void dotestJunit(){
	String s1 = "A";
	String s2 = "b";
	boolean b = s1.equalsIgnoreCase(s2);
	assertFalse(b);
}
}
