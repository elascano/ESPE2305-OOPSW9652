
/* Calculate the time it takes a particle, formula: time=speed/distance */
	

  public class TimeTravel {

      public static void main(String args[]) {

             float speed = 67;

             float distance = 40;

			 System.out.println("\nSpeed= " + speed);
			 System.out.println("\nDistance= " + distance);
			 

             System.out.println("\nTime it takes= "+operation(speed,distance));

       }
	   
	public static float operation(float spd, float dte){   
	   
	   float result = spd/dte;
	   
	   return result;
	   
	   }
	}
 







