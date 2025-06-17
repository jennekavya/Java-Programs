public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // update left boundary
                } else {
                    trappedWater += leftMax - height[left]; // trap water
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // update right boundary
                } else {
                    trappedWater += rightMax - height[right]; // trap water
                }
                right--;
            }
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height);
        System.out.println("Trapped rainwater: " + result);
    }
}
