
public class MainEqualsHashCodeContracts {
	
	public static void main(String args[]) {
		
		EqualsHashCodeContracts e1 = new EqualsHashCodeContracts();
		
		e1.setId(1);
		e1.setName("John");
		
		EqualsHashCodeContracts e2 = new EqualsHashCodeContracts();
		
		e2.setId(1);
		e2.setName("John");
		
		System.out.println("Shallow compare "+ (e1==e2));
		System.out.println("Deep compare "+ (e1.equals(e2)));
		
		
	}

}
