package first;

public class Dog {
	String name;
	String color;
	String breed;
	int age;
	
	public static int noDogs=0;
	
	public Dog() {
		noDogs++;
	}
	
	public Dog(String name, String breed, String color, int age) {
		this.name=name;
		this.breed=breed;
		this.color=color;
		this.age=age;
		noDogs++;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age>1 && age<20) {
			this.age=age;
		}
	}
	
	public void bark() {
		System.out.printf("%s says Woof, Woof\n", this.name);
	}
	
	public void eat() {
		System.out.printf("%s is Eating...\n", this.name);
	}
	
	public static void printNoDogs() {
		System.out.printf("NoDoogs; %d\n", Dog.noDogs);
	}

}
