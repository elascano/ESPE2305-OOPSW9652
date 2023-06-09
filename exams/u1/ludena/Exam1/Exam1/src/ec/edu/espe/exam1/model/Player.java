
package ec.edu.espe.exam1.model;

/**
 *
 * @author Edison Ludeña. BugBuster, DCCP-ESPE
 */
public class Player {
    private String name;
    private int age;
    private String id;
    private String team;


    public Player(String name, int age, String id, String team) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "name=" + name + ",/n age=" + age + ",/n id=" + id + ",/n team=" + team + '}';
    }
    
    
    
}
