package org.tektutor;

public class Mobile {
	private Camera camera = new Camera();

	public Mobile() {
	
	}

	public Mobile(Camera camera) {
		this.camera = camera;
	}

	public boolean powerOn() throws CameraFailureException {
		System.out.println ("Mobile powerOn method invoked ...");

		//if ( camera.ON() ) {
		if (true ) {
			System.out.println ("Some complex power ON positive path ...");
			return true;
		}

		System.out.println ("Some power ON failure logic happens here ...");
		throw new CameraFailureException();
	}
}
