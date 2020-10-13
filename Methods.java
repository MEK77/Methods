import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1=0 , num2=0 , num3=0 , totalsum ;
        double avg ;

        System.out.println("Enter three no.");

        for (int inp=1 ; inp<=3 ; inp++ )
        {
            System.out.println("Enter no."+inp);
            num1= input.nextInt();
        }
        totalsum = sum(num1 , num2 , num3);
        avg = average(num1 , num2 , num3);

        Display(totalsum , avg);


    }
                   public static int sum (int M , int E , int K)
                    {
                        return M + E + K ;
                    }

                   public static double average (int W , int Z , int A)
                   {
                       return sum(W , Z , A) / 3 ;
                   }

                   public static void Display (int M , double E)
                   {
                       System.out.println("The sum of the three no. are"+M) ;
                       System.out.println("The average of the three no. are"+E) ;
                   }




}
  /* public static void drawline (char z , int length )
  {
                  for (int i=0 ; i<length ; i++ )
                  {
                      System.out.print(z);
                  }
      System.out.println();
  } */

  /*  System.out.println("Start") ;

        drawline('-' , 100);

        System.out.println("Welcome to jumanji");

        drawline('*' , 20 );

        int x=50 , y=100 , total=0 ;

        System.out.println(sum(x , y));

        total=sum(x , y) ;

        total=sum(y , x) * 100 ;

        System.out.println(total); */