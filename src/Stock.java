public class Stock {
    private  String symbol;
    private  String name_cophieu;
    private double gia_homqua;
    private double gia_hientai;

    public Stock(String symbol, String name_cophieu) {

    }

    public void symbol(String symbol) {
        this.symbol = symbol;
    }

    public void name(String name_cophieu) {
        this.name_cophieu = name_cophieu;
    }

    public void previousClosingPrice(double gia_homqua) {
        this.gia_homqua = gia_homqua;
    }

    public void currentPrice(double gia_hientai) {
        this.gia_hientai = gia_hientai;
    }

    public double getChangePercent() {
        return (gia_hientai - gia_homqua)*100/ gia_homqua;
    }
}
