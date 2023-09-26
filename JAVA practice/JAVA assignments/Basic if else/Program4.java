public class Program4 {
    public static void main(String[] args){
        int a=4;
        if(a>=0 && a<=5){
            if(a==0){
                System.out.println("zero");
            }else if(a==1){
                System.out.println("one");
            }else if(a==2){
                System.out.println("two");
            }else if(a==3){
                System.out.println("three");
            }else if(a==4){
                System.out.println("four");
            }else if(a==5){
                System.out.println("five");
            }
        }else if(a>5){
            System.err.println("number is greater than 5");
        }else{
            System.err.println("number is neither greater than 5 nor between 0 to 5");
        }
// ====================================================================================================
        int b=6;
        if(b>=0 && b<=5){
            if(b==0){
                System.out.println("zero");
            }else if(b==1){
                System.out.println("one");
            }else if(b==2){
                System.out.println("two");
            }else if(b==3){
                System.out.println("three");
            }else if(b==4){
                System.out.println("four");
            }else if(b==5){
                System.out.println("five");
            }
        }else if(b>5){
            System.err.println("number is greater than 5");
        }else{
            System.err.println("number is neither greater than 5 nor between 0 to 5");
        }
// =======================================================================================================
        int c=-6;
        if(c>=0 && c<=5){
            if(c==0){
                System.out.println("zero");
            }else if(c==1){
                System.out.println("one");
            }else if(c==2){
                System.out.println("two");
            }else if(c==3){
                System.out.println("three");
            }else if(c==4){
                System.out.println("four");
            }else if(c==5){
                System.out.println("five");
            }
        }else if(c>5){
            System.err.println("number is greater than 5");
        }else{
            System.err.println("number is neither greater than 5 nor between 0 to 5");
        }
    }
}
