import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
    System.out.println("1. ZEAL");
    System.out.println("2. JSPM");
    System.out.println("3. SINHGAD");

    Scanner sc = new Scanner(System.in);

    System.out.print("enter your choise 1 to 3 : ");
    int choise = sc.nextInt();
    switch(choise){
        case 1:{

            System.out.println("Zeal college of engineering and research");
            System.out.println("1. CS");
            System.out.println("2. IT");
            System.out.println("3. AI");
            System.out.println("4. CIVIL");
            System.out.println("5. MECH");
            
            System.out.print("enter your choise 1 to 5 : ");
            int choise1 = sc.nextInt();
            switch(choise1){
                case 1:
                System.out.println("number of student 200");break;
                case 2:
                System.out.println("number of student 150");break;
                case 3:
                System.out.println("number of student 170");break;
                case 4:
                System.out.println("number of student 230");break;
                case 5:
                System.out.println("number of student 300");break;
                default:
                System.out.println("invalid entry");break;
            }
        }break;
        
        case 2:{
            System.out.println("JSPM");
            System.out.println("1. CS");
            System.out.println("2. IT");
            System.out.println("3. AI");
            System.out.println("4. CIVIL");
            System.out.println("5. MECH");

            System.out.print("enter your choise 1 to 5 : ");
            int choise1 = sc.nextInt();

            switch(choise1){
                case 1:
                System.out.println("number of student 220");break;
                case 2:
                System.out.println("number of student 120");break;
                case 3:
                System.out.println("number of student 120");break;
                case 4:
                System.out.println("number of student 220");break;
                case 5:
                System.out.println("number of student 320");break;
                default:
                System.out.println("invalid entry");break;      
            }
        }break;

        case 3:{
            System.out.println("Sinhgad college of engineering");
            System.out.println("1. CS");
            System.out.println("2. IT");
            System.out.println("3. AI");
            System.out.println("4. CIVIL");
            System.out.println("5. MECH");

            System.out.print("enter your choise 1 to 5 : ");
            int choise1 = sc.nextInt();

            switch(choise1){
                case 1:
                System.out.println("number of student 205");break;
                case 2:
                System.out.println("number of student 155");break;
                case 3:
                System.out.println("number of student 175");break;
                case 4:
                System.out.println("number of student 235");break;
                case 5:
                System.out.println("number of student 305");break;
                default:
                System.out.println("invalid entry");break;
            }
        }break;
    }
    sc.close();
    }
}
