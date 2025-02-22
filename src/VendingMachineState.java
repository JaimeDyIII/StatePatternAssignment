public interface VendingMachineState{
    public void selectItem(VendingMachine vendingMachine, String item);
    public void insertCoin(VendingMachine vendingMachine, Integer coin);
    public void dispenseItem(VendingMachine vendingMachine);
    public void setOutOfOrder(VendingMachine vendingMachine);
}