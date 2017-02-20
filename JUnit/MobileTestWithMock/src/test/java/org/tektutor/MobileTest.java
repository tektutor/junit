package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MobileTest {

	@Test
	public void testPowerOnWhenCameraFunctionNormally()
		throws CameraFailureException {
		//Mocking
		Camera mockedCamera = mock ( Camera.class );

		//Stubbing - hard coding response of Camera ON method
		when( mockedCamera.ON() ).thenReturn ( true );
	
		Mobile mobile = new Mobile( mockedCamera );
		assertTrue ( mobile.powerOn() );

		verify ( mockedCamera ).ON();
	}

	@Test(expected=CameraFailureException.class)
	public void testPowerOnWhenCameraFunctionsAbnormally() 
		throws CameraFailureException {
		//Mocking
		Camera mockedCamera = mock ( Camera.class );

		//Stubbing - hard coding response of Camera ON method
		when( mockedCamera.ON() ).thenReturn ( false );
	
		Mobile mobile = new Mobile( mockedCamera );
		mobile.powerOn();
	}


}
