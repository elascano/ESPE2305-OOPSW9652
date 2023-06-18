
public class ProgramForCalculate{

	public static void main (String[] args){

		double gravitacionalConstant = 0.0000000000667;
		double massObjectOne = 2356.67;
		double massObjetcTwo = 2500.56;
		double distanceTheCentreOfGravitiesOfBothObject = 5000.56;

		double gravityForce = calculateTheForceOFGravityBetweenTwoObjects(gravitacionalConstant, massObjetcTwo, massObjectOne, distanceTheCentreOfGravitiesOfBothObject);
		System.out.println("The gravity force between those two Objects is: ");
		System.out.println(gravityForce);	
	}

	public static double calculateTheForceOFGravityBetweenTwoObjects(double gravitacionalConstant, double massObjetcTwo, double massObjectOne, double distanceTheCentreOfGravitiesOfBothObject){

		double gravitacionalForce = (gravitacionalConstant*massObjectOne*massObjetcTwo)/(Math.pow(distanceTheCentreOfGravitiesOfBothObject,2));
		return gravitacionalForce;
	}
}



