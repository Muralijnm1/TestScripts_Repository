package OOOPS.ReferanceClasses;

public class InternetExplorer extends RemoteWebDriver {

	@Override
	public void click() {
		System.out.println("The click implementation in IE");

	}

	@Override
	public void quit() {
		System.out.println("The quit implementation in IE");

	}

	@Override
	public void close() {
		System.out.println("The close implementation in IE");

	}

}
