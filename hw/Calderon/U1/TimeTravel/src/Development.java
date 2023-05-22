
/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Development {
    
    private float speed;
    private float distance;
    private float time;
    String toCVS;

    public Development(float speed, float distance, float time) {
        this.speed = speed;
        this.distance = distance;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Development{" + "speed=" + speed + ", distance=" + distance + ", time=" + time + '}';
    }
    
    public String toCVS(){
        return this.distance+","+this.speed+","+this.time;
        
    }
    

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setTime(float time) {
        this.time = time;
    }


    
    public float getSpeed() {
        return speed;
    }

    public float getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
