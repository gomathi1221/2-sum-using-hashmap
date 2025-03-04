// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
       HashMap<Integer,Integer>h=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           int c=target-arr[i];
           if(h.containsKey(c)){
               return true;
           }
           else{
               h.put(arr[i],i);
           }
       }
         
         return false;
    }
    
}