

class PetShop {

	public static void main(String[] args) {

		var pet1 = new Pet(3, "Buddy", "Dog");
		var pet2 = new Pet(5, "Luna", "Cat");
		var pet3 = new Pet(1, "Tweety", "Bird");

		pet1.speak();
		pet2.speak();
		pet3.speak();

		pet1.have_birthday();
		
	}
}
