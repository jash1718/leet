/**
 * find the index of the First occurence in a String...
 */
public class index {

    public static void main(String[] args) {
        String str1 = "maddy";
        String str2 = "mad";

        System.out.println(strStr(str1, str2));
    }

    public static int strStr(String str1, String str2) {
        return (str1.indexOf(str2));
    }
}
// ouput=0
// if it is not the ouput will be zero..
