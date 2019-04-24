
package model;

public class Purchase {
    String idPurchase;
    String namePurchase;
    float costPurchase;
    int qualification;
    String tiket;

    public Purchase(String idPurchase, String namePurchase, float costPurchase, int qualificationPurchase, String tiket) {
        this.idPurchase = idPurchase;
        this.namePurchase = namePurchase;
        this.costPurchase = costPurchase;
        this.qualification = qualificationPurchase;
        this.tiket = tiket;
    }

    public String getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(String idPurchase) {
        this.idPurchase = idPurchase;
    }

    public String getNamePurchase() {
        return namePurchase;
    }

    public void setNamePurchase(String namePurchase) {
        this.namePurchase = namePurchase;
    }

    public float getCostPurchase() {
        return costPurchase;
    }

    public void setCostPurchase(float costPurchase) {
        this.costPurchase = costPurchase;
    }

    public int getQualificationPurchase() {
        return qualification;
    }

    public void setQualificationPurchase(int qualificationPurchase) {
        this.qualification = qualificationPurchase;
    }

    public String getTiket() {
        return tiket;
    }

    public void setTiket(String tiket) {
        this.tiket = tiket;
    }
    
    
    
}
