 /**ROMAN TO INTEGER
  *Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
  */
 public class Roman13 {
    public int romanToInt(String s) {
        char [] myarray = s.toCharArray();
        int sum = 0;

        String[][] arr = {
                {"I", "1"},
                {"V", "5"},
                {"X", "10"},
                {"L", "50"},
                {"C", "100"},
                {"D", "500"},
                {"M", "1000"}
        };

        String[][] condition = {
                {"IV", "4"},
                {"IX", "9"},
                {"XL", "40"},
                {"XC", "90"},
                {"CD", "400"},
                {"CM", "900"}
            };

        for (int i = 0; i < myarray.length; i++) {

          String str = "";
          if ((i+1) < (myarray.length)){
              str +=myarray[i];
              str +=myarray[i+1];
          }

          boolean cond = false;

            test1:for (int j = 0; j < condition.length ; j++) {
              if (str == "") break test1;
                    if (condition[j][0].equals(str)) {
                        int a = Integer.parseInt(condition[j][1]);
                        sum += a;
                        i = i + 1;

                        cond=true;
                        break test1;

                }
            }


            test2:for (int l = 0; l < arr.length; l++) {
              if (cond) break test2;
              
                if (arr[l][0].equals(String.valueOf(myarray[i]))) {
                    int a = Integer.parseInt(arr[l][1]);
                    sum += a;

                    break test2;
                }
            }

        }


        return sum;
    }
}