public class euler6{
  
  public int sqr(){
    int count = 1;
    int tot = 0;
    while(count <= 100){
      int sqr = count * count;
      tot += sqr;
      count++;
    }
    
    return tot;
  }
  
  public int sumsqr(){
    int count = 1;
    int sum = 0;
    int tot = 0;
    
    while(count <= 100){
      sum += count;
      count++;
    }
    tot = sum * sum;
    return tot;
  }
  
  
  public static void main(String[] args){
     
     euler6 e6 = new  euler6();
     
     int sqr = e6.sqr();
     int sumsqr = e6.sumsqr();
     int fin = 0;
     
     System.out.println("Square of nat numbers: "+sqr);
     System.out.println("Square of sum of nat numbers: " + sumsqr);
     
     if (sqr > sumsqr){
       fin = sqr - sumsqr;
     } else{
       fin = sumsqr - sqr;
     }
     
     System.out.println(""+fin);
     
     
  }
}