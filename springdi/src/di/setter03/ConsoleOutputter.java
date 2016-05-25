package di.setter03;

public class ConsoleOutputter implements Outputter {
	private String filePath;
	
	public ConsoleOutputter() {
		
	}
	
	public ConsoleOutputter(String filePath) {
		super();
		this.filePath = filePath;
	}
	
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void output(String name, String greeting) {
		System.out.println("ConsoleOutputter => "+ greeting +
										" "+ name);
	}

}
