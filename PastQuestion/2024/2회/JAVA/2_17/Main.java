public class Main {
    public static String rf(String str, int index, boolean[] seen) {
        if(index < 0) return "";
        char c = str.charAt(index);//d
        String result = rf(str, index-1, seen); //(,6,)
        if(!seen[c]) {
            seen[c] = true;
            return c + result;
        }
        return result;              //cbacaba
    }
    public static void main(String[] args) {
        String str = "abacabcd";
        int length = str.length();//8
        boolean[] seen = new boolean[256];
        System.out.print(rf(str,length-1, seen)); //(aba,7,s)
    }
}
