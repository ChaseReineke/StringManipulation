public class StringManipulator {

    public String trimAndConcat(String str, String str2) {
        String str3 = str.trim();
        String str4 = str2.trim();
        String newStr = str3.concat(str4);
        
        return newStr;
    }

    public Integer getIndexOrNull(String str, char letter) {
        Integer target = str.indexOf(letter);
        if(str.indexOf(letter) == -1) {
            target = null;
        }
        return target;
    }

    public Integer getIndexOrNull(String str, String str2) {
        Integer target = str.indexOf(str2);
        if(str.indexOf(str2) == -1) {
            target = null;
        }
        return target;
    }

    public String concatSubstring(String str1, Integer int1, Integer int2, String str2) {
        String str3 =  str1.substring(int1, int2);
        String str4 = str3.concat(str2);
        return str4;
    }
}