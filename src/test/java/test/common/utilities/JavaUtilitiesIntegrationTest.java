package test.common.utilities;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.common.utilities.JavaUtilities;

public class JavaUtilitiesIntegrationTest {

	@Test
	public void arrayTest(){
		JavaUtilities javaUtilities = new JavaUtilities();
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");
		javaUtilities.printArray(myList);
	}
	
	@Test
	public void stringToArrayTest(){
		JavaUtilities javaUtilities = new JavaUtilities();
		String astr = "string1,String2";
		String[] expected = {"string1", "String2"};
		String[] result = javaUtilities.stringToArray(astr, ",");
		Assert.assertArrayEquals(expected, result);
	}
}
