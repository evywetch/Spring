package springFromBook;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import soundsystem.CompactDisc;




public class CDPlayerTest {

	
	@Autowired
	private CompactDisc cd;
	
	
	@Test
	public void cdShouldNotBeNull() {
	assertNotNull(cd);
	}
	

}
