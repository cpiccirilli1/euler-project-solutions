import java.lang.Math;

public class euler9{
  public static void main(String[] args){
    
    for(int a = 1; a < 1000; a++){
      
      for(int b = 1; b < 1000; b++){
        
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c = a2 + b2;
        double csqr = Math.sqrt(c);
        double sum = a + b + csqr;
        // System.out.println(""+sum);
        if (sum == 1000.0){
          double prod = a*b*csqr;
          System.out.println("" + prod);
          
        }
        
      }
      
    }
    
  }
}