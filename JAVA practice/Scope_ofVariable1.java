public class Scope_ofVariable1 {
    public static void main(String[] args){
        int x = 15;
        {
            int y =20;
            System.out.println(x + " " + y); 
        }
        {
            System.out.println(x + " " + y);
        }
        System.out.println(x + " " + y);
    }
}
