class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int ans[]=new int[n];
        // ans[0]=1;
        // for(int i =1;i<n;i++){
        //     ans[i]=ans[i-1]*nums[i-1];
        // }
        // int rightProduct = 1;
        // for(int i = n-1;i>=0;i--){
        //     ans[i]= ans[i]*rightProduct;
        //     rightProduct = rightProduct*nums[i];
            
        // }
        // return ans;
        int mul = 1;
        int a=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                a+=1;
                if(a==2){
                    mul=0;
                    break;
                }
                continue;
            }
            mul = nums[i]*mul;
        }
        int d=1;
         for(int i =0;i<nums.length;i++){
            if(a==2){
                nums[i]=0;
                continue;
            }
            if(a==1){
            if(nums[i]==0){
                nums[i]=mul;
                continue;
            }
            if(nums[i]!=0){
                nums[i]=0;
            continue;
            }
            }
            d=mul/nums[i];
            nums[i]=d;
            
        }
        return nums;
        
    }
}  
