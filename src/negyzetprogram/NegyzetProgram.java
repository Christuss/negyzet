package negyzetprogram;

public class NegyzetProgram {

    public static void main(String[] args) {
        new NegyzetProgram().feladat();
    }
    
    private void feladat(){
        Negyzet n1 = new Negyzet(new Koordinata(1,1), 2);
        Negyzet n2 = new Negyzet(new Koordinata(1,1), 2);
        System.out.println( "Egyforma? " + negyzetOsszehasonlit(n1, n2));
        n1.allapot();
        
    }
    
    private boolean negyzetOsszehasonlit(Negyzet n1, Negyzet n2) {
        if (n1.getOldal() == n2.getOldal()) {
            return true;
        } else {
            return false;
        }
        
    }
    
}
