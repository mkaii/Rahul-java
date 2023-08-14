public class EggPack extends CartItem{

    private final int numEggsPerPack;
    private final String bestBeforeDate;


    public EggPack(String name, String brand, double price, String description, int numEggsPerPack, String bestBeforeDate) {
        super(name, brand, price, description, Category.EGG);
        this.numEggsPerPack = numEggsPerPack;
        this.bestBeforeDate = bestBeforeDate;
    }

    public EggPack(String name, String brand, double price, String description, int numEggsPerPack, String bestBeforeDate, Integer countOfItem) {
        super(name, brand, price, description, Category.EGG,countOfItem);
        this.numEggsPerPack = numEggsPerPack;
        this.bestBeforeDate = bestBeforeDate;
    }

    public int getNumEggsPerPack() {

        return numEggsPerPack;
    }

    public String getBestBeforeDate() {

        return bestBeforeDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nnumEggsPerPack: " + numEggsPerPack +
                "\nbestBeforeDate: " + bestBeforeDate ;

    }
}
