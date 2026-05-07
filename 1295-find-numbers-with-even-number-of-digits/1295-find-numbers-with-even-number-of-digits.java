class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ;
        for(int num : nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }

    boolean isEven(int num){
        int numberOfDigits = Countdigits(num);
        if(numberOfDigits % 2==0){
            return true;
        }
        return false;
    }

    int Countdigits(int nums){
       int count = 0;
       while(nums > 0){
        count++;
        nums = nums/10;
       }
     return count;
    }
}