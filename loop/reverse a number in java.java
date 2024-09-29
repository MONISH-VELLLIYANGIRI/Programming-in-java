import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); 
        int p=0;
        int s=n;
        while(s!=0)
        { int rem=s%10;
          p+=1;
          s/=10;
        }
        int r=(int) Math.pow(10,p-1);
        int u=0;
        while(n!=0){
            int rem=n%10;
            u+=rem*r;
            n/=10;
            r/=10;
        }
        System.out.printf("%d",u);
        
    }
}
