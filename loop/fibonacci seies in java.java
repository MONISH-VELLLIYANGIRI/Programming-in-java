import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int temp;
        System.out.printf("%d ",a);
        System.out.printf("%d ",b);
        for(int i=3;i<10;i++)
        {
            
            temp=a+b;
            System.out.printf("%d ",temp);
            a=b;
            b=temp;
        }
}
}
