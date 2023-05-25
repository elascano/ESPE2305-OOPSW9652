public class ExerciseAcceleration{
	public static void main(String args[]){
		
		int	FinalVelocity=15;
		int InitialVelocity=0;
		int Time=5;
		
		System.out.println("\nThe InitialVelocity is: "+InitialVelocity);
		System.out.println("The FinalVelocity is: "+FinalVelocity);
		System.out.println("The Time is: "+Time);
		System.out.println("The Acceleration formula is:(FinalVelocity-InitialVelocity)/Time");
		System.out.println("\nThe Acceleration is: "+acceleration(FinalVelocity,InitialVelocity,Time));
	}
	public static int acceleration(int LastVelocity,int CeroVelocity,int LastTime){

		int Acceleration= (LastVelocity-CeroVelocity)/LastTime;
		
		return Acceleration;
	}
}