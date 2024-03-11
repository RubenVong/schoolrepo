package first;

public class Driver {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Spike", "bulldog", "brown", 5);
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog3=dog2;
		
		dog1.bark();
		dog1.eat();
		
		dog2.name="Fido";
		dog2.breed="boxer";
		dog2.color="white";
		dog2.age=3;
		dog2.bark();
		dog2.eat();
		
		dog3.bark();
		dog3.eat();
		dog3.setAge(-1);
		System.out.printf("Age: %d\n", dog3.getAge());
		
		System.out.printf("NoDoogs; %d\n", Dog.noDogs);
		Dog.printNoDogs();
	}

}
