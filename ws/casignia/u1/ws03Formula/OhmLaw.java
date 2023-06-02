public class OhmLaw{
	public static void main(String args[]){
		System.out.printf("---------- OHM LAW ----------\n");
		System.out.printf("Voltage = Current * Resistance\n");
		float current = 2;
		float resistance = 5;
		float voltage = calculateVoltage(current, resistance);
		System.out.printf("Voltage = %f [V] \n", voltage);
	}
	public static float calculateVoltage(float current, float resistance){
		float voltage = current * resistance;
		return voltage;
	}
}