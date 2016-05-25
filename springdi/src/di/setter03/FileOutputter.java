package di.setter03;

public class FileOutputter implements Outputter {
	private String filePath;
	
	public FileOutputter(){
		
	}
	
	public FileOutputter(String filePath) {
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
		System.out.println("FileOutputter => "+ greeting +
				" "+ name);
	}

}
