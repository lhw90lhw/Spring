package di.constructor03;

public class ConsoleOutputter implements Outputter {
	private String filePath;
	
	public ConsoleOutputter(String filePath) {
		super();
		this.filePath = filePath;
	}


	@Override
	public void output(String name, String greeting) {
		System.out.println("ConsoleOutputter => "+ greeting +
										" "+ name);
	}

}
