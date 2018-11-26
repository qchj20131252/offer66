/**
 * @author 秦川江.
 * @date 2018/11/26.
 * @time 19:37.
 */

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。(n<=39)
 */
public class Fibonacci {
    public int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        int prePre = 0;
        int pre = 1;
        int result = 0;
        for (int i = 2;i <= n; i++){
            result = prePre + pre;
            prePre = pre;
            pre = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new Fibonacci().fibonacci(5);
        System.out.println(result);
    }
}
