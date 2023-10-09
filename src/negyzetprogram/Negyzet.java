
package negyzetprogram;

public class Negyzet {
    int x;
    int y;
    int oldal;
    
    public void allapot(){
        System.out.printf("koordináták:%d - %d terulet:%.2f", this.x, this.y, Math.pow(this.oldal, 2));
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOldal(int oldal) {
        this.oldal = oldal;
    }
    
}
