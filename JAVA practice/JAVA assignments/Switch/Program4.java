import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. movies");
        System.out.println("2. series");
        
        System.out.print("enter your choise 1 or 2 : ");
        int num = sc.nextInt();

        switch(num){
            case 1:{
                System.out.println("1. Founder");
                System.out.println("2. snowden");
                System.out.println("3. jobs");
                System.out.println("4. Her");
                System.out.println("5. social network");
                System.out.println("6. wall E");
                System.out.println("7. AI");

                System.out.print("enter your choise 1 to 7 : ");
                int num2 = sc.nextInt();

                switch(num2){
                    case 1:
                        System.out.println();break;
                    case 2:
                        System.out.println("1. silicon valley");
                        System.out.println("2. Devs");
                        System.out.println("3. the IT crowd");
                        System.out.println("4. mr Robot");
                        break;
                    default:
                        System.err.println("envalid entry");break;
                }
            }break;
            
            case 2:{

            }break;
            default:
                System.out.println("invalid entry");
                break;
        }
        sc.close();
    }
}
