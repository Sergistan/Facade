public class BinOps {

    public String sum(String a, String b) {
        int aParse = Integer.parseInt(a, 2);
        int bParse = Integer.parseInt(b, 2);
        int result = aParse + bParse;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int aParse = Integer.parseInt(a, 2);
        int bParse = Integer.parseInt(b, 2);
        int result = aParse * bParse;
        return Integer.toBinaryString(result);
    }
}
