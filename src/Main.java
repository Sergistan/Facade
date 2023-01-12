public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("00000001", "10000011"));
        System.out.println(bins.mult("00000001", "11111111"));
    }
}
