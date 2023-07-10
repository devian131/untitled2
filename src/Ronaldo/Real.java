package Ronaldo;

public class Real extends Ronaldo {
    public static int main(String[] args) {
        int count=0;
        int maxCount=0;
        int[] nums={1,1,0,1,1,1};
        for(int i=0; i< nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }
            else{
                maxCount= Math.max(maxCount,count);
            }

        }

        return count;
    }
}
