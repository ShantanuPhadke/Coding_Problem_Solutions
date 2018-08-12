import java.util.LinkedList;

public class AnimalShelter{
	//Prospective adopters have three options:
	//	(a) Adopt the "oldest" overall animal
	//	(b) Adopt the "oldest" Dog
	//  (c) Adopt the "oldest" Cat
	// Note: Here "oldest" is based on arrival times
	private LinkedList<Animal> animals;

	public AnimalShelter(){
		this.animals = new LinkedList<Animal>();
	}

	public void enqueue(Animal animal){
		animals.add(animal);
	}

	public Animal dequeueAny(){
		Animal current = animals.remove();
		return current;
	}

	public Dog dequeueDog(){
		Animal current = animals.getFirst();
		int index = 1;
		while(current != null && !(current instanceof Dog)){
			current = animals.get(index);
			index+=1;
		}
		animals.remove(current);
		return (Dog)(current);
	}

	public Cat dequeueCat(){
		Animal current = animals.getFirst();
		int index = 1;
		while(current != null && !(current instanceof Cat)){
			current = animals.get(index);
			index+=1;
		}
		animals.remove(current);
		return (Cat)(current);
	}

}