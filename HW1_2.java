public class HW1_2_1
{
	public static void main(String[] args) {
	    
	    if(Math.pow(5,15)>1000000000){       //1
	        System.out.println("Степень-это мощь.Power is a power");
	    }
	    
	    int a=34;                  //2
	    if(a>0){
	        System.out.println("Позитив");
	    }
	    if(a<0){
	        System.out.println("Отрицательно");
	    }
	    if(a==0){
	        System.out.println("0= "+a);
	        
	    }
	    if(Math.sqrt(15000000)<5000){      //3
	        System.out.println("Два измерения лучше, чем одно");
	        
	    }
	    if(Math.pow(2,10)<512){        //4
	        System.out.println("Pentium 2");
	    }
	    else{
	        System.out.println("ARM");
	    }
	    
	    double d1=45.67;              //5
	    double d2=23.45;
	    if(d1>d2){
	        System.out.println(d1);
	    }
	    else{
	        System.out.println(d2);
	    }
	    
	    int first=23;            //6
	    int second=3;
	    System.out.println(Math.pow(first,second));
	    System.out.println(Math.pow(second,first));
	    
	    int x=2;                  //7
	    int y=10;
	    if(Math.pow(x,y)>Math.pow(y,x)){
	        System.out.println("x в степени y больше");
	    }
	    if(Math.pow(x,y)==Math.pow(y,x)){
	        System.out.println("результаты равны");
	    }
	    if(Math.pow(x,y)<Math.pow(y,x)){
	        System.out.println("y в степени x больше");
	    }
	    
	    for(int i=1;i<=100;i++){         //8
	        System.out.print(i+" ");
	    }
	    System.out.println("");
         
        for(int i=50;i<=100;i++){         //9
	        System.out.print(i+" ");
	    }
	    System.out.println("");
	    
	    for(int i=100;i>=1;i--){         //10
	        System.out.print(i+" ");
	    }
	    System.out.println("");
	    
	     for(int i=0;i>=-100;i--){         //11
	        System.out.print(i+" ");
	    }
	    System.out.println("");
	    
	    String str="Молоко";               //12
	    String newStr="";
	    for(int i=0;i<str.length();i++){
	        newStr+=str.charAt(i);
	        if(str.charAt(i)=='о'){
	            newStr+="бро";
	        }
	    }
	    System.out.println(newStr);
	    
	    String str2="freedom";                 //13
	    System.out.println(str2.toUpperCase());
	    
	    String str3="organization";         //14
	    String strNew="";
	    for(int i=0;i<str3.length();i++){
	        if(str3.charAt(i)=='a'){
	            strNew+='@';
	            continue;
	        }
	        if(str3.charAt(i)=='o'){
	            strNew+='0';
	            continue;
	        }
	        strNew+=str3.charAt(i);
	    }
	System.out.println(strNew);
	
	
	String s1="88005553535";                  //15
	String s2="Winter";
	if(s1.length()>s2.length()){
	    System.out.println(s1+ " is longer");
	}
	if(s1.length()<s2.length()){
	    System.out.println(s2+ " is longer");
	}
	if(s1.length()==s2.length()){
	    System.out.println(s1+" and "+s2 +" ara same");
	}
	
	
	int p1=45;                          //16
	int p2=34;
	int p3=29;
	
	int pMax=Math.max(p1,Math.max(p2,p3));
	System.out.println(pMax);
	
	
	
}
}

