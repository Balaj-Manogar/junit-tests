package code;

public class Template
{

	private String variableValue; 
	
	public Template(String templateText)
	{
		// TODO Auto-generated constructor stub
	}

	public void set(String variable, String value)
	{
		this.variableValue = value;
		
	}

	public String evaluate()
	{
		// TODO Auto-generated method stub
		return "Hello, " + this.variableValue;
	}

}
