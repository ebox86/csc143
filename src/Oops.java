public class Oops {
    
//    Instatatiate a RuntimeException here.
    static RuntimeException x = new RuntimeException("Instantiated on line 4");
    
    public Oops() {
//    Instatatiate a RuntimeException here.
        //x = new RuntimeException("Instantiated in the constructor");
    }
    
    public void m1() {
        m2();
    }
    
    public void m2() {
//    Instatatiate a RuntimeException here.
     //   x = new RuntimeException("Instantiated in m2");
        m3();
    }
    
    public void m3() {
        m4();
    }
    
    public void m4() {
//    Instatatiate a RuntimeException here.
        //x = new RuntimeException("Instantiated in m4");
        throw x;
    }
    
    public void m5(RuntimeException xx){
    	x = xx;
    }
    
    public static void main(String[] args) {
//    Instatatiate a RuntimeException here.
    	Oops myOops = new Oops();
    	//myOops.m5(new RuntimeException("Instantiated in main"));
    	//myOops.m1();
    }
    
}