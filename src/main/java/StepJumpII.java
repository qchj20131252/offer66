/**
 * @author 秦川江
 * @date 2019/11/1 17:45
 * @info 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class StepJumpII {
    /**
     * 递归
     * @param target
     * @return
     */
    public int jumpFloorII(int target) {
        if (target == 1 || target == 0) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= target; i++) {
            sum += jumpFloorII(target - i);
        }
        return sum;
    }

    /**
     * 动态规划
     * @param target
     * @return
     */
    public int jumpFloorII2(int target) {
        int[] result = new int[target + 2];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= target; i++) {
            result[i] = 2 * result[i - 1];
        }
        return result[target];
    }
}
