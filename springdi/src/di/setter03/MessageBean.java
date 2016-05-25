package di.setter03;

public class MessageBean implements InterMessage {
	private String name;
	private String greeting;
	private Outputter outputter;		
	
	public MessageBean() {
	}	

	public MessageBean(String name, String greeting, Outputter outputter) {
		super();
		this.name = name;
		this.greeting = greeting;
		this.outputter = outputter;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public Outputter getOutputter() {
		return outputter;
	}

	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

	@Override
	public void sayHello() {
		outputter.output(name, greeting);
	}

}
