public class Program10 {
    public static void main(String[] args){
        int year = 2002;
        if(year>=1883 && year<=1900){
            System.out.println("Lost Generation");
        }else if(year>=1901 && year<=1927){
            System.out.println("Greatest Generation");
        }else if(year>=1928 && year<=1945){
            System.out.println("Silent Generation");
        }else if(year>=1946 && year<=1964){
            System.out.println("baby Boomers");
        }else if(year>=1965 && year<=1980){
            System.out.println("Generation X");
        }else if(year>=1981 && year<=1996){
            System.out.println("Millennials");
        }else if(year>=1997 && year<=2012){
            System.out.println("Generatiom Z");
        }else if(year>=2012 && year<=2023){
            System.out.println("Generation Alpha");
        }else{
            System.out.println("invalid entry");
        }
    }
}
