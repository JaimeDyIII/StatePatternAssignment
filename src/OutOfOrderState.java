public class OutOfOrderState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine vendingMachine, String item){
        System.out.println("Out of Order!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Integer coin){
        System.out.println("Out of Order!");
    }
    
    @Override
    public void dispenseItem(VendingMachine vendingMachine){
        System.out.println("Out of Order!");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine){
        System.out.println("Out of Order!");
    }
} 