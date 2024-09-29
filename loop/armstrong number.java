import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); 
        int p=0;
        int s=n;
        int k=n;
        while(s!=0)
        { int rem=s%10;
          p+=1;
          s/=10;
        }
        int u=0;
        while(n!=0)
        {
            int rem=n%10;
            u+=(int) Math.pow(rem,p);
            n/=10;
        }
        if(k==u)
        {
            System.out.printf("Its  a armstrong number :)");
        }
        else
        {
            System.out.printf("Its not a armstrong number :(");
        }
        
    }
}
