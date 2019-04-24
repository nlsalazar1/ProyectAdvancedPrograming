
package model;

public class Saucer {
    
    String idSaucer;
    String nameSaucer;
    float costSaucer;
    int qualification;

    public Saucer(String idSaurce, String name, float cost, int qualification) {
        this.idSaucer = idSaurce;
        this.nameSaucer = name;
        this.costSaucer = cost;
        this.qualification = qualification;
    }

    public Saucer(String idSaurce, String name, float cost) {
        this.idSaucer = idSaurce;
        this.nameSaucer = name;
        this.costSaucer = cost;
    }
    
    

    public String getIdSaurce() {
        return idSaucer;
    }

    public void setIdSaurce(String idSaurce) {
        this.idSaucer = idSaurce;
    }

    public String getName() {
        return nameSaucer;
    }

    public void setName(String name) {
        this.nameSaucer = name;
    }

    public float getCost() {
        return costSaucer;
    }

    public void setCost(float cost) {
        this.costSaucer = cost;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }
    
    
    
}
