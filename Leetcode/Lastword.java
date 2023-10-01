/**
 * length of Lastword......
 */
public class Lastword {
    public static void main(String[] args) {
        String str = "i will go to market tomorrow";
        System.out.println(Lastof(str));

    }

    static int Lastof(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) != ' ') {
                count++;

            } else {
                break;
            }

        }
        return count;
    }
}
// output=8