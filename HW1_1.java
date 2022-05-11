public class HW1_1;
{
	public static void main(String[] args) {
	    
	    System.out.println("Aleksey"); //1           //2>>
	    System.out.println(" Ночь, улица, фонарь, аптека,\n Бессмысленный и тусклый свет.\n Живи еще хоть четверть века -\n Всё будет так. Исхода нет.\n\n Умрешь — начнешь опять сначала\n И повторится всё, как встарь:\n Ночь, ледяная рябь канала,\n Аптека, улица, фонарь.");
	    
	    int x=2+2*2; //4
        System.out.println(x);  
    
         x=(2+2)*2;         //5
        System.out.println(x); 
        
        double y=(double)100/Math.PI;       //6
        System.out.println(y); 
        
        System.out.println(Math.pow(12345,3));         //7
        
        System.out.printf("%.2f \n",Math.sqrt(Math.pow(2,10)));        //8
        
        System.out.printf("%.2f \n",Math.pow(Math.sqrt(2),10));       //9
        
        // long infinity= x/0;    получаем бесконечность       //10
       
        String start="Hello,";                           //11
        String end=" world!";
        System.out.println(start+end);
        
        //System.out.println(start-end);               //12
        //System.out.println(start/end);
        
        String str=start+Math.PI;                   //13
        System.out.println(str);
        
        //2.3X+5=0                             //14
        System.out.printf("%.2f \n",linearX(2.3,5));
        
        //(5.5X+15)*(3.75X+1)                   //15
        
        quadraticX(5.5,15,3.75,1);
        
        //2.5X*X+7X+10=0                  //16
        System.out.println("Discriminannt= "+discriminant(2.5,7,10));
        
	}
	//ax+b=0
	static double linearX(double a,double b){
	    double x=(double)-b/a;
	    return x;
	}
	
	
	 //(ax+b)*(cx+d)=0
	static void quadraticX(double a,double b,double c,double d){
	    double x=(double)-b/a;
	    double x2=(double)-d/c;
	    System.out.printf("x1= %.2f x2= %.2f \n",x,x2);
	}
	
	//ax*x+bx+c=0;                   
	static double discriminant(double a,double b,double c){
	    return b*b-4*a*c;
	}
}

