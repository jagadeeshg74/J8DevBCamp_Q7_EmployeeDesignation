package yaksha;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;



import yaksha.*;

public class MainClassTest {

	

	@Test
	public void testEmployeeDesignation_MGR() throws IOException {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("Manish", "MGR");
		hm.put("Babu","CLK");
		hm.put("Rohit", "MGR");
		hm.put("Viru","PGR");
		hm.put("Raju","CLK");
			
		
		
//		assertArrayEquals(new String[]{"Manish","Rohit"},MainClass.obtainDesignation(hm,"MGR"));
		
//		assertArrayEquals(new String[] {"Babu","Raju"},	MainClass.obtainDesignation(hm,"CLK"));
		
		String [] a1 =new String[]{"Manish","Rohit"};
		String [] a2 =MainClass.obtainDesignation(hm,"MGR");
		
		
		
		TestUtils.yakshaAssert(TestUtils.currentTest(), Arrays.deepEquals(a1, a2)== true ?"true":"false", TestUtils.businessTestFile );
		
		
		
		
	}
	
	@Test
	public void testEmployeeDesignation_CLK() throws IOException {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("Manish", "MGR");
		hm.put("Babu","CLK");
		hm.put("Rohit", "MGR");
		hm.put("Viru","PGR");
		hm.put("Raju","CLK");
			
					
		//assertArrayEquals(new String[] {"Babu","Raju"},		MainClass.obtainDesignation(hm,"CLK"));
		
		String [] a1 = new String[] {"Babu","Raju"};
		String [] a2 =MainClass.obtainDesignation(hm,"CLK");
		
				
		TestUtils.yakshaAssert(TestUtils.currentTest(), Arrays.deepEquals(a1, a2)== true ?"true":"false", TestUtils.businessTestFile );
		
				
		
	}
	
	
	
	
	
}
