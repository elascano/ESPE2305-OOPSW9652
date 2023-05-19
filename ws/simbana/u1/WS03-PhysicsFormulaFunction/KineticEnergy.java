public class KineticEnergy{ 
	
	public static void main(String args[]){
		int mass = 28;
		int speed = 5;
		int constant = 2;
		int kinetic_energy;
		int square_of_velocity;
		square_of_velocity = speed * speed;
		kinetic_energy = (mass * square_of_velocity)/constant;
		System.out.println("The kinetic energy is " + kinetic_energy);
	}	
}