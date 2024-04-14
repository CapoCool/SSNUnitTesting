import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SSNTest {
	
	ssnCorrected ssn = new ssnCorrected();

	
	@Test
	public void testID1() {
		
		assertEquals("valid ssn", ssn.validateSSN("555-55-5555"));
	}
	
	@Test
	public void testID2() {
		
		assertEquals("valid ssn", ssn.validateSSN("123-12-1234"));
	}
	
	@Test
	public void testID3() {
		
		assertEquals("valid ssn", ssn.validateSSN("485-65-5545"));
	}
	
	@Test
	public void testID4() {
		
		assertEquals("valid ssn", ssn.validateSSN("654-12-2213"));
	}
	
	@Test
	public void testID5() {
		
		assertEquals("valid ssn", ssn.validateSSN("556-66-5455"));
	}
	
	@Test
	public void testID6() {
		
		assertEquals("invalid ssn", ssn.validateSSN("555-98-444"));
	}
	
	@Test
	public void testID7() {
		
		assertEquals("Incorrect format", ssn.validateSSN("49755-1234"));
	}
	
	@Test
	public void testID8() {
		
		assertEquals("invalid ssn", ssn.validateSSN("11-66-5455"));
	}
	
	@Test
	public void testID9() {
		
		assertEquals("invalid ssn", ssn.validateSSN("000-66-5455"));
	}
	
	@Test
	public void testID10() {
		
		assertEquals("invalid ssn", ssn.validateSSN("950-66-5455"));
	}
	
	@Test
	public void testID11() {
		
		assertEquals("invalid ssn", ssn.validateSSN("123-123-1234"));
	}
	
	@Test
	public void testID12() {
		
		assertEquals("invalid ssn", ssn.validateSSN("123-00-1234"));
	}
	
	@Test
	public void testID13() {
		
		assertEquals("invalid ssn", ssn.validateSSN("123-12-123"));
	}
	
	@Test
	public void testID14() {
		
		assertEquals("invalid ssn", ssn.validateSSN("123-12-0000"));
	}
	
	
	
	
	
}
