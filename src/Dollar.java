public class Dollar {

    int amount;
    int multiplier = 2;

    Dollar(int amount) {
        this.amount = amount;
    }
    Dollar times(int multiplier) {
        return new Dollar (amount * multiplier);
    }
}
