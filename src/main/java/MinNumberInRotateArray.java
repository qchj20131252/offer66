/**
 * @author 秦川江
 * @date 2019/11/1 16:01
 * @info 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {
    /**
     * 简单的数组遍历
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        int arrayLength = array.length;
        if (arrayLength == 0) {
            return 0;
        }else if (arrayLength == 1) {
            return array[0];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[0];
    }

    /**
     * 利用数组特性，使用二分法查找
     * @param array
     * @return
     */
    public int minNumberInRotateArray2(int [] array) {
        int left = 0;
        int right = array.length - 1;
        if (left > right) {
            return 0;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] > array[right]) {
                left = mid + 1;
            }else if (array[mid] == array[right]){
                right--;
            }else{
                right = mid;
            }
        }
        return array[left];
    }
}
