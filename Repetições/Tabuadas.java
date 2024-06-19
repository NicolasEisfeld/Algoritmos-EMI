public class Tabuadas {
   public static void main(String [] args) {     
       for(int i = 2; i < 10; i++) {
           System.out.println("Tabuada do "+ i);
           for(int mult = 0; mult < 10; mult++) {
               System.out.println(i + " x " + mult + " = " + (i*mult));
           }
       }
   } 
}
