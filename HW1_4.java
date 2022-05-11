import java.util.Scanner;
import static java.lang.System.out;
public class HW1_4 {
	public static void main(String[] args) {
	    out.println("Inputs numbers for converting");
	    out.println("byte-->short");
	    Scanner tachpad=new Scanner(System.in);
	    
	    byte b=tachpad.nextByte();           //1
	    short sh=(short)b;
	    out.println(sh);
	    
	    out.println("short-->int");            //2
	    short b2=tachpad.nextShort();
	    int i=(int)b2;
	    out.println(i);
	    
	    out.println("int-->long");            //3
	    int i2=tachpad.nextInt();
	    long l=(long)i2;
	    out.println(l);
	    
	    out.println("long-->int");            //4
	    long l2=tachpad.nextLong();
	    int i3=(int)l2;
	    out.println(i3);
	    
	    out.println("float-->double");            //5
	    float f=tachpad.nextFloat();
	    double d=(double)f;
	    out.println(d);
	    
	    out.println("double-->float");            //6
	    double d2=tachpad.nextDouble();
	    float f2=(float)d2;
	    out.println(f2);
	    
	    out.println("int-->boolean");            //7.1
	    int i4 =tachpad.nextInt();
	    boolean bool;
	    bool=i4>100? true:false;
	    out.println(bool);
	    
	    out.println("boolean-->int");            //7.1
	    boolean bool2  =tachpad.nextBoolean();
	    int i5;
	    i5=bool2? 777:111;
	    out.println(i5);
	    
	    out.println("String-->boolean");            //8
	    String s  =tachpad.next();
	    boolean bool3;
	    bool3=(s.length())%2==0? true:false;
	    out.println(bool3);
	    
	    out.println("Char-->String");            //9
	    char ch =tachpad.next().charAt(0);
	    String s2=""+ch;
	    out.println(s2);
	    
	    out.println("Char-->Int");            //10.1
	    char ch2 =tachpad.next().charAt(0);
	    int i7=(int)ch2;
	    out.println(i7);
	    
	     out.println("Int-->char");            //10.1
	    int i8 =tachpad.nextInt();
	    char ch3=(char)i8;
	    out.println(ch3);
	    
	    out.println("int"+"   char");          //11
	    for(int j=30;j<=150;j++){
	        char ch4=(char)j;
	        out.println(j+"    "+ch4);
	    }
	    
	    
	    
	    
		
	}  
}
