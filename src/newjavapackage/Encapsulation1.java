package newjavapackage;

public class Encapsulation1 {

	private String empName;
	private int empId;
	private int empAge;
	
	public void setName(String empName) {
		this.empName = empName;
	}
	
    public void setId(int empId) {
		this.empId = empId;
	}
    
    public void setAge(int empAge) {
		this.empAge = empAge;
	}
    
    
    public String getName() {
    	return empName;
    }
    
    public int getId() {
    	return empId;
    }
    
    public int getAge() {
    	return empAge;
    }


}
