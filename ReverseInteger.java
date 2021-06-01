// 7. Reverse Integer

class Solution {
    public int reverse(int x) {
        long res = 0;
        while(x != 0)
        {
            if(res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10)
                return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int)res;
    }
}