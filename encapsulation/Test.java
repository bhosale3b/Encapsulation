package encapsulation;

public class Test {
		public static void main(String[] args) {
			Employee e = new Employee();
			e.setId(10);
			e.setName("pooja");
			System.out.println("outer id :"+e.getId());
			System.out.println("outer id :"+e.getName());
		}


}
