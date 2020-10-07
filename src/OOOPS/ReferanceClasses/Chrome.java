package OOOPS.ReferanceClasses;

public class Chrome extends RemoteWebDriver {

	@Override
	public void click() {
		System.out.println("The click implementation is FireFox");

	}

	@Override
	public void quit() {
		System.out.println("The quit implementation is FireFox");

	}

	@Override
	public void close() {
		System.out.println("The close implementation is FireFox");

	}

}
