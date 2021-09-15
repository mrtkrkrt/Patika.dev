public class Main {
    public static void main(String[] args) {
        int[] nums = {1,11,8,5,9};
        int len = nums.length;
        double sum = 0.0;

        for(int i : nums){
            sum += 1.0/i;
        }

        double result = len/sum;
        System.out.println("Result : " + result);
    }
}
