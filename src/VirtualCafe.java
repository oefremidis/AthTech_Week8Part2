public class VirtualCafe {

    public static void serveCustomer(VirtualPerson vp, CoffeeCup cup)
            throws TooHotException, TooColdException{
            vp.drinkCoffee(cup);
    }
}


//    public static void serveCustomer(VirtualPerson vp, CoffeeCup cup){
//        try {
//            vp.drinkCoffee(cup);
//        } catch (TooColdException e){
//            System.out.println(e.getMessage());
//        } catch (TooHotException e){
//            System.out.println(e.getMessage());
//        }
//    }
