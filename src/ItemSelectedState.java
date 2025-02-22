
public class ItemSelectedState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine vendingMachine, String item){
        System.out.println("Item already selected!");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Integer coin){
        System.out.println("Inserted: " + coin + " Pesos");
        vendingMachine.setBalance(vendingMachine.getBalance() + coin);
        System.out.println("Current Balance: " + vendingMachine.getBalance() + " Pesos");
    }
    
    @Override
    public void dispenseItem(VendingMachine vendingMachine){
        String itemSelected = vendingMachine.getItemSelected();
        Integer itemSelectedPrice = vendingMachine.getItemInventory().get(itemSelected);
        Integer balance = vendingMachine.getBalance();

        if(balance < itemSelectedPrice){
            System.out.println("Choose another drink and make sure you have sufficient balance!");
            vendingMachine.setItemSelected("");
            vendingMachine.setState(new IdleState());
            return;
        }
        
        vendingMachine.setBalance(balance - itemSelectedPrice);
        System.out.println("Dispensing: " + vendingMachine.getItemSelected());
        System.out.println(vendingMachine.getItemSelected() + " has been dispensed!");
        vendingMachine.setItemSelected(null);
        vendingMachine.setState(new IdleState());
    }
    
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine){
        vendingMachine.setState(new OutOfOrderState());
        System.out.println("Machine is now Out of Order!");
    }
}
