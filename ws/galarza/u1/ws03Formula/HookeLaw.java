public class HookeLaw {
	public static void main(String args[]){
		float forceChange = 98;
		float distanceChange = 37;
		float springConstant = 0;
		springConstant = computeSpringConstant(forceChange,distanceChange);
		printLines(forceChange, distanceChange, springConstant);
	}
	public static void printLines (float force, float distance, float spring){
		System.out.println("HOOKE'S LAW CALCULATOR");
		System.out.println("\n Unknown elastic constant");
		System.out.println("k = dF/dx = " + force + "/" + distance);
		System.out.println("k = " + spring + "[N/m]");
	}
	public static float computeSpringConstant (float force, float distance){
		float springConstant = 0;
		springConstant = force/distance;
		return springConstant;
	}
}