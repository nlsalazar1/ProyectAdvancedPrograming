
package model;

public class Saucer {
    
    String idSaucer;
    String name;
    float cost;
    int qualification;

    public Saucer(String idSaurce, String name, float cost, int qualification) {
        this.idSaucer = idSaurce;
        this.name = name;
        this.cost = cost;
        this.qualification = qualification;
    }

    public Saucer(String idSaurce, String name, float cost) {
        this.idSaucer = idSaurce;
        this.name = name;
        this.cost = cost;
    }
    
    

    public String getIdSaurce() {
        return idSaucer;
    }

    public void setIdSaurce(String idSaurce) {
        this.idSaucer = idSaurce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }
    
    
    
}
