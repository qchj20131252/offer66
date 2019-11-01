/**
 * @author 秦川江
 * @date 2019/11/1 18:31
 * @info 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    /**
     * 递归
     * @param target
     * @return
     */
    public int rectCover(int target) {
        if (target == 1) {
            return 1;
        }else if (target == 2) {
            return 2;
        }
        return rectCover(target - 1) + rectCover(target - 2);
    }

    /**
     * 循环
     * @param target
     * @return
     */
    public int rectCover2(int target) {
        if (target == 1) {
            return 1;
        }else if (target == 2) {
            return 2;
        }
        int a = 1, b = 2, sum = 0;
        for (int i = 3; i <= target; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }


    public static void main(String[] args) {
        RectCover s = new RectCover();
        System.out.println(s.rectCover(4));
    }
}
