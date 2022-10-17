package nLayeredProject.core;

public class FileLogger implements ILogger{

	@Override
	public void add(String data) {
		System.out.println("Logged to file: " +data);
	}

	
}
