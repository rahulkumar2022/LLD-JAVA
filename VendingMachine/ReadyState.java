package VendingMachine;

public class ReadyState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product selected, Please move forward with payments ");

    }

    @Override
    public void insertCoin(Coin coin) {
        vendingMachine.addCoin(coin);
        System.out.println("Coin inserted "+coin);
        checkPaymentStatus();

    }

    @Override
    public void insertNote(Note note) {
        vendingMachine.addNote(note);
        System.out.println("");
    }

    @Override
    public void dispenseProduct() {

    }

    @Override
    public void returnChange() {

    }
    private void checkPaymentStatus(){
        if(vendingMachine.getTotalPayment()==vendingMachine.getSelectedProduct().getPrice())
    }
}
