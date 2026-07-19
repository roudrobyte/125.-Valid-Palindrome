class Solution {
    public int reverse(int x) {
        boolean isPos = false;
        if(x<0){
            x = x*(-1);
        }
        else{
            isPos = true;
        }
        int temp1 = x;
        int temp2 = 0;
        while(temp1>0){
            int rem = temp1%10; 
            if (temp2 > Integer.MAX_VALUE / 10 || (temp2 == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if(temp2 < Integer.MIN_VALUE / 10 || (temp2 == Integer.MIN_VALUE / 10 && rem > -8)) {
                return 0;
        }
            temp2 = (temp2*10)+rem;
            temp1/=10;
        }
        if(isPos){
            return temp2;
        }
        else{
            return temp2*(-1);
        }
    }
}