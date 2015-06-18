import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ref {
	
	   private static final Object[] EMPTY = {};
	 
	   public void reflect() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	     Room r = new Room(false, false, false, false, false);
	     Class<?> secretClass = r.getClass();
	 
	     // Print all the method names & execution result
	     Method methods[] = secretClass.getDeclaredMethods();
	     System.out.println("Access all the methods");
	     for (Method method : methods) {
	        System.out.println("Method Name: " + method.getName());
	        System.out.println("Return type: " + method.getReturnType());
	        method.setAccessible(true);
	        System.out.println(method.invoke(r, EMPTY) + "\n");
	     }
	 
	     // Print all the field names & values
	     Field fields[] = secretClass.getDeclaredFields();
	     System.out.println("Access all the fields");
	     for (Field field : fields) {
	        System.out.println("Field Name: " + field.getName());
	        field.setAccessible(true);
	        System.out.println(field.get(r) + "\n");
	     }
	  }
}
