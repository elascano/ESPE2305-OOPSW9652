public class CalculatePhysicalFormulas{
	public static void main(String args[]) {
		float forceValueInNewtons = 20;
		float distansValueInMeters = 30;
		float resultOfTorque = multiplicationCalculate(forceValueInNewtons, distansValueInMeters);
		System.out.println("---- WorkshopOne ----");
		System.out.println("Pablo Zurita");
		System.out.println("Calculate Physical Formulas");
		System.out.println(resultOfTorque);
		
	}
	public static float multiplicationCalculate(float multiplying, float multiplier){
	float product = multiplying*multiplier;
	return product;
	}
}