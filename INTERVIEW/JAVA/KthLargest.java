import java.util.PriorityQueue;

class KthLargest{
    
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i: nums){
            minHeap.add(i);
            if (minHeap.size() > k){
                minHeap.remove();
            } 
        }
        return minHeap.remove();
    }

    public static void main(String args []){
        int [] numbers = {1,2,3,4,5,6};
        System.out.println( findKthLargest(numbers, 2));
    }


}