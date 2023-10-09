package negyzetprogram;

public class Negyzet {

    Koordinata k;
    int oldal;

    public Negyzet(Koordinata k, int oldal) {
        this.k = k;
        this.oldal = oldal;
    }

    public void allapot() {
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

    public int getOldal() {
        return oldal;
    }
    

    @Override
    public String toString() {
        return "Negyzet{" + "k=" + k + ", oldal=" + oldal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.oldal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Negyzet other = (Negyzet) obj;
        return this.oldal == other.oldal;
    }
}
