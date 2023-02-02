import java.util.*;;
public class Switchcase {
    public static void main(String[] args) {
        int choice;
        int a,b,sum,dif,mult;
        a=10;
        b=4;
        Scanner1 sc=new Scanner1(System.in);
        System.out.println("Enter your choice ");
        choice=sc.nextInt();
       
            switch(choice){
                case 1: 
                sum=a+b;
                System.out.println(sum);

                case 2:
                dif=a-b;
                System.out.println(dif);
                
                case 3:
                mult=a*b;
                System.out.println(mult);

                default:
                System.out.println("invalid values");
            }
        }
    }

