public class forth {
    public static void main(String[] args){
        float fa = 97f;
        if(fa>98.6f){
            System.out.println("high");
        }else if(fa>=98.0f && fa<=98.6f){
            System.out.println("normal");
        }else{
            System.out.println("low");
        }
    }
}
