public class Tester {

    public static void main(String[] args) {

//        int temper = Integer.parseInt(args[0]);
//        int volume = Integer.parseInt(args[1]);
        int temper = 70;
        int volume = 100;

        CoffeeCup cup = new CoffeeCup(temper, volume);
        VirtualPerson customer = new VirtualPerson();

        try {
            VirtualCafe.serveCustomer(customer, cup);
        } catch (TooColdException e) {
            System.out.println(e.getMessage());
        } catch (TooHotException e) {
            System.out.println(e.getMessage());
        }
//        catch (TemperatureException e){
//            System.out.println("Any other....");
//        }
    }

}