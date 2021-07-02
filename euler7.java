import java.util.ArrayList;

public class euler7 {
  int number = 2;
  ArrayList<Integer> primes = new ArrayList<Integer>();
  ArrayList<Integer> nums = new ArrayList<Integer>();
  public int getNumber(){
    return number;
  }
  
  public void calcs(){
    
    while (primes.size() < 10002){
      ArrayList<Boolean> flags = new ArrayList<Boolean>();
      if (primes.size() == 0){
        primes.add(2);
        nums.add(2);
        
      }
    
      this.populate(flags);
      boolean istrue = this.alltrue(flags);
      
      if (istrue == true){
        int z = primes.size();
        primes.add(number);
        System.out.println(""+z+"  -------------------------------------------------- "+number);
      }
      
      number++;
      //nums.add(number);
    } // end while
  } // end calcs
  
  public void populate(ArrayList<Boolean> flags){
      //System.out.println("Testing: "+ number);
      for (int i : primes){
      
        int m = number % i;
        if (m == 0 && i != number){
          flags.add(false);
        }
        else{
          flags.add(true);
        }
      } // end for
  }
  
  public Boolean alltrue(ArrayList<Boolean> array){
      //System.out.println("Checking Flags: ");
      
      for(Boolean b: array){
        if(b == false){
          return false;
        }
      }
      
      return true;
  }//end alltrue
  
  
  public static void main(String[] args){
    
    
    euler7 e7 = new euler7();
    
    e7.calcs();
    
    
    
  }
  
}