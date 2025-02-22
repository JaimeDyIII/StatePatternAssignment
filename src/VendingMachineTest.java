public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Idle State
        vendingMachine.insertCoin(1);
        vendingMachine.dispenseItem();
        vendingMachine.selectItem("Milk");
        vendingMachine.selectItem("Coffee");

        // Item Selected State
        vendingMachine.selectItem("Coffee");
        vendingMachine.dispenseItem();

        // Back to idle state due to lack of balance
        vendingMachine.selectItem("Coffee");
        vendingMachine.insertCoin(30);
        vendingMachine.dispenseItem();

        // Dispensing State automatically returns to idle state
        
        // Out of order state
        vendingMachine.setOutOfOrder();
        vendingMachine.selectItem("Coffee");
        vendingMachine.insertCoin(25);
        vendingMachine.dispenseItem();
    }
}