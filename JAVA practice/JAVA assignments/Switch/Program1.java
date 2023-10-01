public class Program1 {
    public static void main(String[] args){
        int marathi = 89;
        int hindi = 67;
        int english = 58;
        int math = 98;
        int science = 87;

        if(marathi<40 || hindi<40 || english<40 || math<40 || science<40){
            System.out.println("you hava failed in exam");
        }else{
            int ans = (marathi+hindi+english+math+science)/5;
            String str;
            if(ans>=75){
                str = "dist";
            }else if(ans>=60 && ans<75){
                str = "first";
            }else if(ans>=45 && ans<60){
                str = "second";
            }else{
                str = "third";
            }
            System.out.print("you pass with ");
            switch(str){
                case "dist":
                    System.out.println("distingtion");
                    break;
                case "first":
                    System.out.println("first class");
                    break;
                case "second":
                    System.out.println("second class");
                    break;
                case "third":
                    System.out.println("third class");
                    break;
                default:
                    System.out.println("invalid entry");
                    break;
            }
        }
    }
}
