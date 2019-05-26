class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        return getSmallestNumber(getLength(N));
    }
    
    public int getSmallestNumber(int length) {
        int result =0;
        if(length>1) {
            result ++;
        for (int i = 0;i<length-1;i++) {
            result = result*10;   
          }
        }
        return result;
        
    }
    
    public int getLength (int number){
     int count = 0;
     while(number!=0){
         number /=10;
         count++;
     }
    return  count;
    }
        
}

