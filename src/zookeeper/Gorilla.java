package zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("Gorilla is throwing stuff");
		energy-=5;
		displayEnergy();
		
	}
	public void eatBananas(){ 
		System.out.println("Gorilla is eating bananna");
		energy+=10;
		displayEnergy();
	}
	public void  climb(){
		System.out.println("Gorilla is climbing a tree");
		energy-=10;
		displayEnergy();
	}

}
