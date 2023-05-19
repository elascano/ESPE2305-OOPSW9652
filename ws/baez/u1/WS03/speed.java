public class Speed{
	public static void main(String[] arg)
	float time=5;
	float initialSpeed=15;
	float acceleration=10;
	float speed;
	speed=computeSpeed(time, acceleration, initialSpeed);
}
public static float computeSpeed(float time, float acceleration, float initialSpeed){
	float speed;
	speed=initialSpeed+time*acceleration;
	return speed;
}