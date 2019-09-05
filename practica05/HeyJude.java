public class HeyJude{
    public static void main(String[] args){
	String Hey = "Hey Jude ";
	String Dont = "dont ";
	String Makem = "make it bad";
	String Beafraid = "be afraid";
	String Letm  = "let me down";
	String Takesad = "take a sad song and make it better";
	String Youwere = "you were made to go out and get her";
	String Youhave = "you have found her now go and get her";
	String Rememberto = "remember to";
	String Lether = " let her into your heart";
	String Letunder =" let her under your skin";
	String Theny = "then you";
	String Canst = " can start";
	String Begu = " begin";
	String Tomakeit = " to make it better";
	String Better = "better ";
	String Na = "na ";
  String OH = ", oh";
	int r = 0, i=0, m=0, p=0, q=0;
	while(r < 7){
       if(r==0 || r==1 || r==3 || r==5) {
		System.out.print(Hey);
    System.out.print(Dont);
  } if(r==1) {
    System.out.println(Beafraid);
    System.out.println(Youwere);
    System.out.print(Rememberto);
    System.out.println(Letunder);
    System.out.print(Theny);
    System.out.print(Begu);
    System.out.println(Tomakeit);
 } if(r==2){
   while(i<10){ System.out.print(Na);
     i++;
   }System.out.print("\n");
 }
  if(r==3) {
    System.out.println(Letm);
    System.out.println(Youhave);
    System.out.print(Rememberto);
    System.out.println(Lether);
    System.out.print(Theny);
    System.out.print(Canst);
    System.out.println(Tomakeit);
  } if(r==4){
    while(m<10){ System.out.print(Na);
      m++;
    }System.out.print("\n");
  }
  if(r==0 || r==5 ) {
    System.out.println(Makem);
     System.out.println(Takesad);
      System.out.print(Rememberto);
        if(r==0){ System.out.println(Lether);}
         if(r==5){ System.out.println(Letunder);}
          System.out.print(Theny);
           if(r==0){ System.out.print(Canst);
            System.out.println(Tomakeit);}
             if(r==5){ System.out.print(Begu);
              System.out.println(Tomakeit);
              if(r==5){
                while(p<5){ System.out.print(Better);
                  p++;
                }System.out.println(OH);
              }System.out.print("\n"); 
              if(r==5){
                while(q<10){ System.out.print(Na);
                  q++;
                }System.out.print(Hey);
              }
            }

      } System.out.println();
 r++;
	}
    }
}
