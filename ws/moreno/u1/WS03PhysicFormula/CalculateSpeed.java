
class CalculateAngularSpeed{
	public static void main(String arg[]){
		int frecuency =29;
		int constant =6;
		int angularSpeed = CalculateProduct(constant,frecuency);
		System.out.println("the angular speed is:"+angularSpeed);
	}
	public static int CalculateProduct(int frec,int k){
		int product;
		product = (frec*k);
		return product;

		
	}

}