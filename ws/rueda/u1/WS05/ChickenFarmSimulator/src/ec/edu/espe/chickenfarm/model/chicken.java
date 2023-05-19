package ec.edu.espe.chickenfarm.model;

import java.until.Date:

/**
 *
 * @author Juan Rueda, The Javas, DCCO-ESPE
 */
public class chicken {

    @Override
    public String toString() {
        return "chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + ", bornOnDate=" + bornOnDate + '}';
    }
    int id;
    String name;
    String color;
    int age;
    boolean isMolting;
    Date bornOnDate;
   
    public void doStuff(int forTime){
    cluck();
    wander();
    drink();
    poop();
    
    
    }
    
    private void cluck(){
        System.out.println("the chicken" + name + "is clucking");
    
    }
    private void wander(){
        System.out.println("the chicken" + name + "is wandering");
    }
    private void eat(){
        System.out.println("the chicken" + name + "is eating");
    }
    private void drink(){
        System.out.println("the chicken"+ name + "is drinking");
    }
    private Poop poop(){
        System.out.println("the chicken"+ name + "is pooping");
        return.new poop;
        
    }
}
