public class AnimalShelterTester{
	
	public static void main(String [] args){
		AnimalShelter shelter1 = new AnimalShelter();

		Dog firstDog = new Dog("Dog1");
		Cat firstCat = new Cat("Cat1");
		Dog secondDog = new Dog("Dog2");
		Cat secondCat = new Cat("Cat2");
		Dog thirdDog = new Dog("Dog3");
		Cat thirdCat = new Cat("Cat3");

		shelter1.enqueue(firstDog);
		shelter1.enqueue(firstCat);
		shelter1.enqueue(secondDog);
		shelter1.enqueue(secondCat);
		shelter1.enqueue(thirdDog);
		shelter1.enqueue(thirdCat);

		System.out.println("The expected order of dequeues is as follows: Dog1, Cat1, Dog2, Dog3, Cat2, Cat3");
		System.out.println(shelter1.dequeueAny().getName());
		System.out.println(shelter1.dequeueCat().getName());
		System.out.println(shelter1.dequeueDog().getName());
		System.out.println(shelter1.dequeueDog().getName());
		System.out.println(shelter1.dequeueAny().getName());
		System.out.println(shelter1.dequeueAny().getName());
	}

}