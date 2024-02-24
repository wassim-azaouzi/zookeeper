package zookeeper;

public class Bat extends Mammal {
	public Bat(){
		energy = 300 ;
	}
	
	public void attackTown() {
		System.out.println("Bat is attacking town");
		energy-=100;
		displayEnergy();
		
	}
	public void eatHumans(){ 
		System.out.println("BAT is eating a human");
		energy+=25;
		displayEnergy();
	}
	public void  fly(){
		System.out.println("flying");
		energy-=50;
		displayEnergy();
	}

}
