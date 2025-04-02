
public class Mitarbeiter {

	protected String name;
	protected int id;

	public Mitarbeiter(String name, int id){

		this.name = name;
		this.id = id;

	}
}

class Programmierer extends Mitarbeiter{
	
	private String programmiersprache;
	
	public Programmierer(String name, int id, String programmiersprache){
		super(name, id);
		this.programmiersprache = programmiersprache;
		
	}
	
}