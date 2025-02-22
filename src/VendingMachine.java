import java.util.HashMap;

public class VendingMachine {
    private HashMap<String, Integer> itemInventory = new HashMap<>();
    private Integer balance = 0;
    private String itemSelected = "";
    private VendingMachineState state;

    public VendingMachine(){
        state = new IdleState();
        initializeInventory();
        System.out.println("Welcome to this Vending Machine!\nYou can select your drink: ");
        printItemInventory();
    }    

    private void initializeInventory(){
        itemInventory.put("Water", 20);
        itemInventory.put("Cola", 25);
        itemInventory.put("Coffee", 25);
    }
    
    public void printItemInventory(){
        for (String inventoryItem : getItemInventory().keySet()) {
            System.out.println("- " + inventoryItem);
        }
        System.out.println();
    }

    public void selectItem(String item){
        state.selectItem(this, item);
    }

    public void insertCoin(Integer coin){
        state.insertCoin(this, coin);
    }

    public void dispenseItem(){
        state.dispenseItem(this);
    }

    public void setOutOfOrder(){
        state.setOutOfOrder(this);
    }

    public void setState(VendingMachineState state){
        this.state = state;
    }

    public HashMap<String, Integer> getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(HashMap<String, Integer>itemInventory) {
        this.itemInventory = itemInventory;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getItemSelected() {
        return itemSelected;
    }
    
    public void setItemSelected(String itemSelected) {
        this.itemSelected = itemSelected;
    }
}
