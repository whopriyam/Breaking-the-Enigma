import java.util.*;
class BreakingtheEnigma
{
    public void main()
    {int c; int s=0; int r=0; int g=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("                                BREAKING THE ENIGMA");
        
        int q = (int)(Math.random()*9000)+1000;
    
        while(q!=0)
        {
            int h=q%10;
            r=(r*10)+h;
            q/=10;
        }
        int a[]= new int[4];
        for(int i=0; i< 4; i++)
        {
            int d= r%10;
            a[i]=d;
            r/=10;
        }
        
       
        int b[]= new int[4];
        while(true)
        { System.out.println("\n");
            c=0;g++;
            System.out.println("Enter your guess.");
            int n=sc.nextInt();
            while(n!=0)
            {
                int p=n%10;
                s=(s*10)+p;
                n/=10;
            }
            for(int i=0; i<4; i++)
            {
                int e=s%10;
                b[i]= e;
                s/=10;
            }
            for(int i=0; i<4; i++)
            {
                if(a[i]==b[i])
                {
                    System.out.print("#");
                    c++;
                }
                else if(b[i]==a[0] || b[i]== a[1] || b[i] == a[2] || b[i]== a[3])
                System.out.print("O");
                else System.out.print("X");
            }
            if(c==4)
            {
                System.out.println("\n"+"             Congratualtions! You cracked the Enigma!"+"\n"+"             It only took you "+g+" tries.");
                break;
            }
        }
    }
}
