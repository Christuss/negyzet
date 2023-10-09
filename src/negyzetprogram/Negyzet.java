
package negyzetprogram;

public class Negyzet {
    Koordinata k;
    int oldal;
    
    public void allapot(){
        System.out.printf("koordináták:%d - %d terulet:%.2f \n", this.k.getX(), this.k.getX(), Math.pow(this.oldal, 2));
    }
    

    public void setOldal(int oldal) {
        this.oldal = oldal;
    }

    public Koordinata getK() {
        return k;
    }

    public void setK(Koordinata k) {
        this.k = k;
    }
    
    
}
