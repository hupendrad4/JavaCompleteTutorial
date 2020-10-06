

interface  ClassInterface {

	abstract void methodForInterface();
	

}


class AnyClass implements ClassInterface{
	
	public void methodForInterface() {
		
		System.out.println("The Method is Abstract");
	}

	
}
