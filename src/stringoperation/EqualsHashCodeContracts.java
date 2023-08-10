
public class EqualsHashCodeContracts {
	
	// For employee
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o) {
		if( o== null || getClass() != o.getClass() ) {
			
			return false;
			
		}
		
		if (o== this) {
			
			return true;
		}
		
		EqualsHashCodeContracts e = (EqualsHashCodeContracts)o;
		
		return(this.getId()==e.getId());
	}
	
	public int hahCode() {
		
		return getId();
	}
	
	

}
