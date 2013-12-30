import static org.junit.Assert.*;

import org.junit.Test;

import controller.PingMaster;
import controller.PingResponse;


public class PingMasterTests {

	@Test
	public void pingOnce() {
		PingMaster pingMaster = new PingMaster();
		PingResponse actual = pingMaster.ping("www.burhanaras.net");
		assertTrue(actual.isSuccess());
		System.out.println(actual.getMessage());
	}
	
	@Test
	public void pingTwice() {
		PingMaster pingMaster = new PingMaster();
		PingResponse actual = pingMaster.ping("www.burhanaras.net", 2);
		assertTrue(actual.isSuccess());
		System.out.println(actual.getMessage());
	}

}
