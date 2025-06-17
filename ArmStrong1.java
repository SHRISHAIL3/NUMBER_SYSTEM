import java.util.Scanner;

public class ArmStrong1 {
    public static int length(int num){
        int digit=0;
        while(num>0){
            num=num/10;
            digit++;

        }
        return digit;
    }

    public static int power(int rem,int digit){
        int power=1;
        while (digit>0){
            power=power*rem;
            digit--;

        }
        return power;
    }

    static int armstrong(int num){
        int digits=length(num);
        int ans=0;
        while(num >0){
            int rem=num%10;
            ans=ans+power(rem,digits);
            num=num/10;

        }
        return ans;
        

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to know whetr its an aram strong or not");
        int num = sc.nextInt();
        int c=armstrong(num);
        if(c==num){
            System.out.println("---ARM STRONG NUMBER---");
        }else{
            System.out.println("---ITS NOT A ARM STRONG NUMBER");
        }
    }
}
