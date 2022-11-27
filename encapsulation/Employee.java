package encapsulation;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	
	/*	public int getId() {
		return id;
	}
	public void setId(int id) { //you can directly add setter and getter method right click --> scource--> add setter and getter
		this.id = id;       // always remember that setter and getter method are always public
	}                          // setter and getter are used for the private variable give access to another class
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
		private int id;
		private String name;
		
		
	}


