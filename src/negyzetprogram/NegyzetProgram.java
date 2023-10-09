package negyzetprogram;

public class NegyzetProgram {

    public static void main(String[] args) {
        new NegyzetProgram().feladat();
    }
    
    private void feladat(){
        Negyzet n1 = new Negyzet(new Koordinata(1,1), 2);
        Negyzet n2 = new Negyzet(new Koordinata(1,1), 2);
        System.out.println( "Egyforma?" + egyforma(n1, n2));
        System.out.println( "Egyforma?" + n1.equals(n2));
        n1.allapot();
        System.out.println("n1 hashCode" + n1.hashCode());
        System.out.println("n2 hashCode" + n2.hashCode());
        
    }
    
    private boolean egyforma(Negyzet n1, Negyzet n2) {
        return n1.getOldal() == n2.getOldal();
    }
    
}
