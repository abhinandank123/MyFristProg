public class RevNum {
    public static void main(String[] args) {
       
        int number=132;
          int k;
          int rev=0;
          while(number!=0){
              k=number%10;
              rev=(rev*10)+k;
              number=number/10;
  
          }
          System.out.println("Reverse Number is "+rev);
  
      }
    
}
