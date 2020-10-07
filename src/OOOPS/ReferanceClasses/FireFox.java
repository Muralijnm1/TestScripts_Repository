package OOOPS.ReferanceClasses;

public class FireFox extends RemoteWebDriver {

	@Override
	public void click() {
		System.out.println("The click implementation is Chrome");

	}

	@Override
	public void quit() {
		System.out.println("The quit implementation is Chrome");

	}

	@Override
	public void close() {
		System.out.println("The close implementation is Chrome");

	}

}
