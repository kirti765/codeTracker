import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B) {
return countSquares(A,B);
}
   
 public int countSquares(int num1, int num2) 
    { 
         int i,N,A,B,count,lo,hi,max,sqrt=(int)Math.sqrt(1000000000);
        long square;
 
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        map.put(1,0);
 
 for(i=2;i<=sqrt;i++)
        {
            if(!map.containsKey(i))
            {
                arr.add(i);
                map.put(i, 0);
                square=i;
                square*=square;
                count=1;
 
                while(square<=1000000000)
                {
                    map.put((int)square,count++);
                    arr.add((int)square);
                    square*=square;
                }
                
                
            }
        }
          Collections.sort(arr);
        int a[]=new int[arr.size()];
 
        for(i=0;i<arr.size();i++) {
            a[i]=arr.get(i);
        }
             max=0;
 
            A=num1;
            B=num2;
 
            lo=(int)Math.sqrt(A);
            hi=(int)Math.sqrt(B);
 
            if(lo*lo<A)
                lo++;
 
            lo*=lo;
            hi*=hi;
 
            lo=Arrays.binarySearch(a,lo);
            hi=Arrays.binarySearch(a,hi);
 
            for(i=lo;i<=hi;i++)
                max=Math.max(max,map.get(a[i]));
        return max;
    }
}
