package lab3;

public class PartsManager {

    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];
    private int emptyRow;

    public void addPart(String partNum, String partDesc, double partPrice) {
        setPartNum(partNum, emptyRow);
        setPartDesc(partDesc, emptyRow);
        setPartPrice(partPrice, emptyRow);
        emptyRow++;
    }

    public void updatePart(String partDesc, double partPrice, int index) {
        setPartDesc(partDesc, index);
        setPartPrice(partPrice, index);
    }

    public String getPartNumAtIndex(int index) {
        return partNums[index];
    }

    public String getDescAtIndex(int index) {
        return partDescs[index];
    }

    public double getPriceAtIndex(int index) {
        return partPrices[index];
    }

    private void setPartNum(String partNum, int index) {
        this.partNums[index] = partNum;

    }

    private void setPartDesc(String partDesc, int index) {
        this.partDescs[index] = partDesc;
    }

    private void setPartPrice(double partPrice, int index) {
        this.partPrices[index] = partPrice;
    }

    public int getEmptyRow() {
        return emptyRow;
    }
}
