public class VirtualPerson {

    private static final int TOO_COLD = 65;
    private static final int TOO_HOT = 85;


    public void drinkCoffee(CoffeeCup cup) throws TooColdException, TooHotException {
            if (cup.getTemperature() < TOO_COLD) {
                throw new TooColdException("Coffee is Too Cold");
            } else if (cup.getTemperature() > TOO_HOT) {
                throw new TooHotException("Coffee is Too Hot");
            }
            System.out.println("It fine...Drinking...");
            cup.setContent(0);
        }
    }


//    public void drinkCoffee(CoffeeCup cup){
//        try {
//            if (cup.getTemperature() < TOO_COLD) {
//                throw new TooColdException("Coffee is Too Cold");
//            } else if (cup.getTemperature() > TOO_HOT) {
//                throw new TooHotException("Coffee is Too Hot");
//            }
//            System.out.println("It fine...Drinking...");
//        } catch (Exception e){
//            System.out.println("Something is wrong");
//        }
//    }

