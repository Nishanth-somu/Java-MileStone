class Solution {
    public int addDigits(int num) {
        while(num>9){
        int tot = 0;
        while(num > 0){
            tot = tot + num % 10;
            num  = num / 10; 
        }
        num = tot;
        }
        return num;
    }
}