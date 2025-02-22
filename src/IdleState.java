public class IdleState implements VendingMachineState{    
    @Override
    public void selectItem(VendingMachine vendingMachine, String item){   
        if (vendingMachine.getItemInventory().containsKey(item)) {
            vendingMachine.setItemSelected(item);
            System.out.println("You have selected: " + vendingMachine.getItemSelected());
            vendingMachine.setState(new ItemSelectedState());
        } else {
            System.out.println("Invalid Item Selected!\nItem Inventory: ");
            vendingMachine.printItemInventory();
        }

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Integer coin){
        System.out.println("Select item first before inserting coin!");

    }
    
    @Override
    public void dispenseItem(VendingMachine vendingMachine){
        System.out.println("Select item first and insert coin before dispensing!");
    }
    
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine){
        vendingMachine.setState(new OutOfOrderState());
        System.out.println("Machine is now Out of Order!");
    }
}
