// Algorithm to encrypt an input using a particular hashing pattern
// Author Pedro

package encrytion;
import java.util.Scanner;



public class Encrytion {

   
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in); 
        
       System.out.println("Enter a word to encrypt");
       String encrypt = input.nextLine();
       
       System.out.println("The word you entered is" +encrypt);
       
       String encrypted = "";
       String alphabets = ("abcdefghijklmnopqrstuvwxyz");
       String passkey = encrypt.toLowerCase();
       for(int i = 0; i < encrypt.length(); i++){
           String a = String.valueOf(encrypt.charAt(i));
           
          for(int j = 0; j < alphabets.length(); j++){
           String b = String.valueOf(alphabets.charAt(j));
           
           if (a.equals(b)){
               int n = j +1;
               
               if (n%2 == 0){
                   String evenEncrypted = "e" + n/2;
                   encrypted += evenEncrypted;
                   
               }
               else{
                   String oddEncrypted = "o" + ((n*3) + 1);
                   encrypted += oddEncrypted;
               }
               
           }
              
       }
      
   }
   System.out.println("The encrypted value is "  +encrypted);   
}
        
}
    
  
