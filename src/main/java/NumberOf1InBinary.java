import java.util.Queue;
import java.util.Stack;

/**
 * @author 秦川江
 * @date 2019/11/1 18:59
 * @info 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1InBinary {
    /**
     * 位操作，***********需要加强
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((flag & n) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }


    public static void main(String[] args) {
        NumberOf1InBinary s = new NumberOf1InBinary();
        System.out.println(s.NumberOf1(2));
        System.out.println(3 << 1);
    }
}
