class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
            int result[]=new int[k];
            

                for(int i=0;i<k;i++){
                    
                int maxFrequency=0;
                int maxElement=0;
                    for(int key:map.keySet()){
                        if(map.get(key)>maxFrequency){
                            maxFrequency=map.get(key);
                            maxElement=key;

                        }
                    }
                    result[i]=maxElement;
                    map.remove(maxElement);
                }
            
            return result;
        }
    }
