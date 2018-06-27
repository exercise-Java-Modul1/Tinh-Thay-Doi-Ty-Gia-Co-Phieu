public class Application {
    public static void main(String[] args) {
        String symbol = "ORCL";
        String name = "Oracle Corporation";
        double gia_homqua = 34.5;
        double gia_homnay = 34.35;
        Stock st = new Stock(symbol, name);
        st.previousClosingPrice(gia_homqua);
        st.currentPrice(gia_homnay);
        System.out.println("Phần trăm thay đổi là(%): " + st.getChangePercent());
    }
}
