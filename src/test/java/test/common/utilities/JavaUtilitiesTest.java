package test.common.utilities;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.common.utilities.JavaUtilities;

public class JavaUtilitiesTest {

	@Test
	public void arrayTest(){
		JavaUtilities javaUtilities = new JavaUtilities();
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");
		javaUtilities.printArray(myList);
	}
	
}
