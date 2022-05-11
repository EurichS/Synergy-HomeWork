import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;
public class HW1_5
{
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner(System.in);
	    
	    out.println("Input 2 numbers");              //1
	    double d=keyboard.nextDouble();
	    double d2=keyboard.nextDouble();
	    double d2d=Math.pow(d2,d);
	    out.println("y^x= "+d2d);
	    
	    out.println("Input 3 numbers");             //2,3
	    double d3=keyboard.nextDouble();
	    double d4=keyboard.nextDouble();
	    double d5=keyboard.nextDouble();
	    double d2d2d=Math.pow(Math.pow(d3,d4),d5);
	    out.println("y^x^z= "+d2d2d);
	    
	    out.println("Input 2 strings");  
	    String s=keyboard.next();       //4
	    String s2=keyboard.next();
	    int sl=s.length();
	    int s2l=s2.length();
	    int abs=Math.abs(sl-s2l);
	    out.println("difference of lengths: "+abs);
	    
	    out.println("Input 3 strings");     //5,6
	    String s3=keyboard.next();       
	    String s4=keyboard.next();
	    String s5=keyboard.next();
	    int max=Math.max(Math.max(s3.length(),s4.length()),s5.length());
	    int min=Math.min(Math.min(s3.length(),s4.length()),s5.length());
	    int diff=max-min;
	    out.println("difference of lengths: "+diff);
	    
	    out.println("Culculator (2+2*2=8). Input 3 numbers and 2 maths");  //7
	     double d6=keyboard.nextDouble();
	     char ch=keyboard.next().charAt(0);  
	     double d7=keyboard.nextDouble();
	     char ch2=keyboard.next().charAt(0);  
	     double d8=keyboard.nextDouble();
	     
	     double firstResult=$culc(d6,d7,ch);
	     double secondResult=$culc(firstResult,d8,ch2);
	     out.println("Вывод: "+secondResult);
	     
	     
	     out.println("Culculator (2+2*2=6). Input 3 numbers and 2 maths");  //8
	     double d9=keyboard.nextDouble();
	     char ch3=keyboard.next().charAt(0);  
	      d8=keyboard.nextDouble();
	     char ch4=keyboard.next().charAt(0);  
	     double d10=keyboard.nextDouble();
	     
	     if(priority(ch3,ch4)){
	         firstResult=$culc(d8,d10,ch4);
	         secondResult=$culc(d9,firstResult,ch3);
	     }
	     else{
	         firstResult=$culc(d9,d8,ch3);
	         secondResult=$culc(firstResult,d10,ch4);
	     }
	      out.println("Вывод: "+secondResult);
	      
	      out.println("Alphabet: ");              //9
	      for(char i='a';i<='z';i++){
	          out.print(i+" ");
	      }
	      out.println("");
	      out.println("Input number of alphabets letter ");   //10
	      int numb=keyboard.nextInt();
	      char a='a';
	      char b=(char)(a+numb-1);
	      out.println(b);
	      
	      out.println("Random letter:");       //11
	      Random rand=new Random();
	      int randLetter=rand.nextInt(25)+1;
	      b=(char)(a+randLetter-1);
	      out.println(b);
	      
	      out.println("Random integer 11-22:");   //12
	      out.println(rand.nextInt(11)+11);
	      
	    
	     
	     
		
	}
	
	
	
	
	static double $culc(double n1,double n2,char symb){
	if(symb=='+'){
	    return n1+n2;
	}
		if(symb=='-'){
	    return n1-n2;
	}
		if(symb=='*'){
	    return n1*n2;
	}
		if(symb=='/'){
	    return n1/n2;
	}
	return 0;
 }
 
 
 static boolean priority(char f,char f2){
     if((f2=='*'||f2=='/')&&(f=='-'||f=='+')){
         return true;
     }
     return false;
 }
	

	
}
