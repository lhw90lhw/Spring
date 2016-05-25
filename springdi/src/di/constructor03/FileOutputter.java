package di.constructor03;

public class FileOutputter implements Outputter {
	private String filePath;
	
	public FileOutputter(String filePath) {
		super();
		this.filePath = filePath;
	}


	@Override
	public void output(String name, String greeting) {
		System.out.println("ConsoleOutputter => "+ greeting +
				" "+ name);
	}

}
