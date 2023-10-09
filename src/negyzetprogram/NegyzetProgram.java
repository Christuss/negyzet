package negyzetprogram;

public class NegyzetProgram {

    public static void main(String[] args) {
        new NegyzetProgram().feladat();
    }
    
    private void feladat(){
        Negyzet n1 = new Negyzet();
        n1.setOldal(2);
        n1.setX(3);
        n1.setY(4);
        n1.allapot();
        
    }
    
}
