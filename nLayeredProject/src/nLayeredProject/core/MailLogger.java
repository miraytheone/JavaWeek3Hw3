package nLayeredProject.core;

public class MailLogger implements ILogger{

	@Override
	public void add(String data) {
		System.out.println("logged to mail: " +data);
	}

}
