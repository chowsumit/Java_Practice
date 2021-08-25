package newjavapackage;

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation1 obj = new Encapsulation1();
		
		obj.setName("Alivia");
		obj.setId(845057);
		obj.setAge(3);
		
		System.out.println("The employee name is "+obj.getName());
		System.out.println("The employee Id is "+obj.getId());
		System.out.println("The employee age is "+obj.getAge());
	}

}
