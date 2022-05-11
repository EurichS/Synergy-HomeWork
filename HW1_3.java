import java.util.Scanner;
import static java.lang.System.out;
public class HW1_3{
    
	public static void main(String[] args) {
	    
	    Scanner keyboard=new Scanner(System.in);
	    
	    out.println("Input a string");              //2
	    String userString=keyboard.nextLine();
	    out.println("Length of string= "+userString.length());
	    
	    
	    out.println("Input 2 strings");   //3
	    userString=keyboard.nextLine();
	    String userString2=keyboard.nextLine();
	    out.println("Sum of their lengths= "+(userString.length()+userString2.length()));
	    
	    
	    out.println("Input 3 strings");     //4
	    String userString5=keyboard.nextLine();
	    String userString6=keyboard.nextLine();
	    String userString7=keyboard.nextLine();
	    int l=userString5.length();
	    int l2=userString6.length();
	    int l3=userString7.length();
	    int min=Math.min(l,Math.min(l2,l3));
	    String minL="";
	    if(min==l){minL=userString5;}
	    if(min==l2){minL=userString6;}
	    if(min==l3){minL=userString7;}
	    out.println("The shortest string is(or one of the shortest): "+minL);
	    
	    
	    out.println("Input 3 fractional number");        //5
	    double f=keyboard.nextDouble();
	    double f2=keyboard.nextDouble();
	    double f3=keyboard.nextDouble();
	    String sqrt2="";
	    if(Math.sqrt(f)<=2){
	        sqrt2+=f;
	        sqrt2+=" ";
	    }
	    if(Math.sqrt(f2)<=2){
	        sqrt2+=f2;
	        sqrt2+=" ";
	    }
	    if(Math.sqrt(f3)<=2){
	        sqrt2+=f3;
	        sqrt2+=" ";
	    }
	    out.println("Numbers with square root <2: "+sqrt2);
	    
	    int x = 1;       //6
     while (x>=-3) {        // значение Х выводится 5 раз
        out.print(x);
        x = x - 1;
        }
        
        String str = "Hell";   //7
     while (str.length()<10) {   // метод вызывается 1 раз, поскольку логическое
         str = str + "o";        //  выражение выдает false
         }
         
         out.println("");
         out.println("Input 2 integer");      //8
         int q=keyboard.nextInt();  
         int q2=keyboard.nextInt();
         double resultQ;
         if(q>q2){
             resultQ=(double)q2/q;
         }
         else{
             resultQ=(double)q/q2;
         }
         out.println("Result of division: "+resultQ);
         
         
         out.println("Input string for cutting");    //9
         String userString9=keyboard.next();   
         if(userString9.length()>5){
         out.println("Cut string: "+userString9.substring(0,5));
         }
         if(userString9.length()<=5){
             out.println(userString9);
         }
         
         
         out.println("Input true");
         boolean tr=keyboard.nextBoolean();    //10
         if(tr){
             out.println("Истина");
         }
         
         
         out.println("Input 3 number again");        //11
         int q7=keyboard.nextInt();
	     int q8=keyboard.nextInt();
	     int q9=keyboard.nextInt();
	     boolean negative=false;
	     boolean even=false;
	     boolean $1000=false;
	     if(q7<0||q8<0||q9<0){negative=true;}
	     if(q7%2==0||q8%2==0||q9%2==0){even=true;}
	     if(q7>1000||q8>1000||q9>1000){$1000=true;}
	     out.printf("There are:\nNegative: %b\nEven: %b\n>1000: %b\n",negative,even,$1000);
	     
	     
	     out.println("Input 3 string for mass cutting");                //12
	     String strN=keyboard.next();
	     String strN2=keyboard.next();
	     String strN3 =keyboard.next();
	     int placeOfCutting=Math.min(strN.length(),Math.min(strN2.length(),strN3.length()));
	     out.printf("Cutting strings:\n %s\n %s\n %s\n",strN.substring(0,placeOfCutting),strN2.substring(0,placeOfCutting),strN3.substring(0,placeOfCutting));
	     
	     
	      out.println("Input string");                       //13
	      String strP=keyboard.next();
	      out.println("Player 1, there you see a world? Input 2 numbers.");
	      int st=keyboard.nextInt();
	      int fn=keyboard.nextInt();
	      String firstPlayer=strP.substring(st,fn);
	      out.println("World of first player: "+firstPlayer);
	      out.println("Player 1, there you see a world? Input 2 numbers.");
	      int st2=keyboard.nextInt();
	      int fn2=keyboard.nextInt();
	      String secondPlayer=strP.substring(st2,fn2);
	       out.println("World of second player: "+secondPlayer);
	       if(firstPlayer.length()>secondPlayer.length()){
	           out.println("First player win!");
	       }
	       if(firstPlayer.length()<secondPlayer.length()){
	           out.println("Second player win!");
	       }
	       if(firstPlayer.length()==secondPlayer.length()){
	           out.println("Drow!");
	       }
	      
         
         
	}
	
}

