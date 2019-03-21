/**
 * @author 秦川江
 * @date 2019/3/21 21:23
 * @info 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为
 *       We%20Are%20Happy。
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        char[] charArr = str.toString().toCharArray();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < charArr.length; i++){
            if (charArr[i] == ' '){
                res.append("%20");
            }else {
                res.append(charArr[i]);
            }
        }
        return res.toString();
    }

    //使用正则匹配
    public static String replaceSpace1(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }

    //类似于第一个方法
    public static String replaceSpace2(StringBuffer str) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                res.append("%20");
            }else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    //在原字符串上替换，效率高
    public static String replaceSpace3(StringBuffer str) {
        int spaceCount = 0;
        int oldStrLength = str.length();
        for (int i = 0; i < oldStrLength; i++){
            if (str.charAt(i) == ' '){
                spaceCount++;
            }
        }
        int newStrLength = spaceCount * 2 + oldStrLength;
        str.setLength(newStrLength);
        for (int indexOfNew = newStrLength - 1, indexOfOld = oldStrLength - 1; indexOfOld >= 0; indexOfOld--){
            if (str.charAt(indexOfOld) == ' '){
                str.setCharAt(indexOfNew--, '0');
                str.setCharAt(indexOfNew--, '2');
                str.setCharAt(indexOfNew--, '%');
            }else {
                str.setCharAt(indexOfNew--,str.charAt(indexOfOld));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        long start = System.currentTimeMillis();
        String res = replaceSpace(str);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "," + res);

        long start1 = System.currentTimeMillis();
        String res1 = replaceSpace1(str);
        long end1 = System.currentTimeMillis();
        System.out.println((end1 - start1) + "," + res1);

        long start2 = System.currentTimeMillis();
        String res2 = replaceSpace2(str);
        long end2 = System.currentTimeMillis();
        System.out.println((end2 - start2) + "," + res2);

        long start3 = System.currentTimeMillis();
        String res3 = replaceSpace3(str);
        long end3 = System.currentTimeMillis();
        System.out.println((end3 - start3) + "," + res3);
    }
}
