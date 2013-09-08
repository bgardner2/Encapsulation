package lab3;

public class PartsManager {
    private final int MAX_RECS = 10;

    private String[] partNums = new String[MAX_RECS];
    private String[] partDescs = new String[MAX_RECS];
    private double[] partPrices = new double[MAX_RECS];
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
    
    
    public int getPartNumLength(){
        return partNums.length;
    }
    
    public int getPartDescLength(){
        return partDescs.length;
    }
    
    public int getPartPricesLength(){
        return partPrices.length;
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
    
    public void SortAll(){
        // Only perform the sort if we have records
        if (emptyRow > 0) {
            // Bubble sort routine adapted from sample in text book...
            // Make sure the operations are peformed on all 3 arrays!
            for (int passNum = 1; passNum < emptyRow + 1; passNum++) {
                for (int i = 1; i <= emptyRow - passNum; i++) {
                    String temp = "";
                    temp += partPrices[i - 1];
                    partPrices[i - 1] = partPrices[i];
                    partPrices[i] = Double.parseDouble(temp);

                    temp = partNums[i - 1];
                    partNums[i - 1] = partNums[i];
                    partNums[i] = temp;

                    temp = partDescs[i - 1];
                    partDescs[i - 1] = partDescs[i];
                    partDescs[i] = temp;
                }
            }
        }
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
