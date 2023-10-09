package negyzetprogram;

public class NegyzetProgram {

    public static void main(String[] args) {
        new NegyzetProgram().feladat();
    }
    
    private void feladat(){
        Negyzet n1 = new Negyzet(new Koordinata(1,1), 2);
        n1.setOldal(2);
        n1.allapot();
        
    }
    
}
