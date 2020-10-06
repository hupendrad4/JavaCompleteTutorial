
abstract class Animal {
	
	 abstract void  SoundOfAnimal() ;

}


class Cat extends Animal{
	
	void SoundOfAnimal() {
		
		System.out.println("Meaw Meaw ");
	}
}

class Dog extends Animal{
	
	void SoundOfAnimal() {
		
		System.out.println("Bhow Bhow ");
	}
}

class runner{
	
	public static void main(String args[]) {
	//	Animal animal =new Animal();  Can't create objects to Abstract class
		
		Dog dog=new Dog();
		dog.SoundOfAnimal();
		// Dog implements abstract method,
        //so we can create object to Dog
		
	    	Animal A1=dog;
		
		
		
	}
}