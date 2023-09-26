public class Program7 {
    public static void main(String[] args){
        int sellingPrice = 1200; //300  //900
        int costprice = 1000;    //500  //900
        if(sellingPrice>costprice){
            System.out.println("Profit is = " + (sellingPrice-costprice));
        }else if(sellingPrice<costprice){
            System.out.println("Loss is = " + (costprice-sellingPrice));
        }else{
            System.out.println("No profit or loass");
        }
    }
}
