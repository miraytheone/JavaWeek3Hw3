package nLayeredProject.core;

public class DatabaseLogger implements ILogger {

	@Override
	public void add(String data) {
		System.out.println("Logged to db: " +data);
		
	}

}
