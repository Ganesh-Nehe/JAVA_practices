public class Switch6 {
    public static void main(String[] args){
        String str = "thorat";
        switch(str){
            case "oh pune":
                {
                    String str1 = "veg";
                    switch(str1){
                        case "veg":
                            {
                                String str2 = "starter";
                                switch(str2){
                                    case "starter":
                                        System.out.println("masala papad");break;
                                    case "main course":
                                        System.out.println("paneer tikka");break;
                                }
                            }break;
                        case "non veg":
                            {
                                String str2="starter";
                                switch(str2){
                                    case "starter":
                                        System.out.println("sadha papad");break;
                                    case "main course":
                                        System.out.println("sadha chiken tikka");
                                }
                            }break;
                    }
                }break;
                case "thorat":{
                    String str1 = "non veg";
                    switch(str1){
                        case "veg":
                            {
                                String str2 = "starter";
                                switch(str2){
                                    case "starter":
                                        System.out.println("masala papad.2");break;
                                    case "main course":
                                        System.out.println("paneer tikka.2");break;
                                }
                            }break;
                        case "non veg":
                            {
                                String str2="starter";
                                switch(str2){
                                    case "starter":
                                        System.out.println("sadha papad.2");break;
                                    case "main course":
                                        System.out.println("sadha chiken tikka.2");
                                }
                            }break;
                    }
                }break;
        }
    }   
}
