public class DispensingState implements VendingMachineState{
    public DispensingState(VendingMachine vendingMachine){
        vendingMachine.setState(new IdleState());
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, String item){
        System.out.println("Cannot select item while dispensing!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Integer coin){
        System.out.println("Cannot insert coin while dispensing!");
    }
    
    @Override
    public void dispenseItem(VendingMachine vendingMachine){
        System.out.println("Cannot dispense another item while dispensing!");

    }
    
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine){
        System.out.println("Cannot set out of order while dispensing!");
    }
} 

