class Solution {
    public int leastInterval(char[] tasks, int n) {

        int freqarr[]=new int [26];
        for(char ch :tasks){
            freqarr[ch-'A']++;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++){
            if(freqarr[i]>0) pq.offer(freqarr[i]);
        }
     int time=0;
     while(!pq.isEmpty()){
        int cycles =n+1;
        List<Integer> store=new ArrayList<>();
        int taskcount=0;
        while(cycles-- >0 && !pq.isEmpty()){
            int freq=pq.poll();
            if(freq > 1) store.add(freq-1);
            taskcount++;
        }
        store.forEach(pq:: offer);
        time +=(pq.isEmpty() ? taskcount:n+1) ;    
        }
  return time;
        
    }
}
