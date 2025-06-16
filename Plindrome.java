public class Plindrome {

    static int pali(int num){
        int rev=0;
        while(num !=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        return  rev;

    }

    public static void main(String[] args) {
        int num=121;
        int c=pali(num);
        if(c==num) {
            System.out.println("ITS A PALI");
        }
        else{
            System.out.println("ITS NOT A PALI");

        }

    }
}
