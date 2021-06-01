// 258. Add Digits
class Solution {
    public int addDigits(int num) {
        int r = 0;
        while(num != 0){
            r = r + (num % 10);
            num = num / 10;
        }
        if(r <= 9) return r;
        else return (r % 9 == 0)? 9 : r % 9;
    }
}