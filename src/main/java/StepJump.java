/**
 * @author 秦川江
 * @date 2019/11/1 17:20
 * @info 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class StepJump {
    /**
     * 递归
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if (target == 0 || target == 1) {
            return 1;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    /**
     * 循环
     * @param target
     * @return
     */
    public int JumpFloor2(int target) {
        if (target == 1) {
            return 1;
        }else if (target == 2) {
            return 2;
        }else {
            int a = 1;
            int b = 2;
            int sum = 0;
            for (int i = 3; i <= target; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            return sum;
        }
    }
}
