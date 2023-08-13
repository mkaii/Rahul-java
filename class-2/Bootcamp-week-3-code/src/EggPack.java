public class EggPack extends Item{

    private final int numberOfEggs;
    private final String bestBeforeDate;

    public EggPack(String name, String brand, double price, String description, int numberOfEggs, String bestBeforeDate) {
        super(name, brand, price, description);
        this.numberOfEggs = numberOfEggs;
        this.bestBeforeDate = bestBeforeDate;
    }

    public int getNumberOfEggs() {

        return numberOfEggs;
    }

    public String getBestBeforeDate() {

        return bestBeforeDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of eggs: " + numberOfEggs + "\nBest before: " + bestBeforeDate;
    }
}
