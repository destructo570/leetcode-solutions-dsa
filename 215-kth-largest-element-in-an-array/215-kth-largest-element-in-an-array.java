class Solution {
    public int findKthLargest(int[] arr, int k) {
        
        MaxHeap heap = new MaxHeap(arr.length+1);
        
        for(int i=0; i<arr.length; i++){
            heap.insert(arr[i]);
        }
        
        int ans=0;
        for(int i=0; i<k; i++){
            ans=heap.remove();
        }
        
        return ans;
    }
    
    
public class MaxHeap {

    private int[] items;
    private int size=0;
    
    MaxHeap(int n){
        this.items=new int[n];
    }

    public void insert(int val){
        items[size++]=val;
        bubbleUp();
    }

    public int remove(){
        if(isEmpty()) throw new IllegalStateException();
        int index=0;
        int root=items[0];
        items[index] = items[--size];
        while (index<size && !isValidParent(index)){
            int largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index=largerChildIndex;
        }
        return root;
    }

    public int largerChildIndex(int index){
        if(!hasLeftChild(index)) return index;
        if(!hasRightChild(index)) return leftChildIndex(index);
        return (leftChild(index) > rightChild(index)) ? leftChildIndex(index) : rightChildIndex(index);
    }

    public boolean isValidParent(int index){
        if(!hasLeftChild(index)) return true;
        if(!hasRightChild(index)) return items[index] >= leftChild(index);
        return items[index] >= leftChild(index) && items[index]>=rightChild(index);
    }

    private boolean hasLeftChild(int index){
        return leftChildIndex(index)<=size;
    }

    private boolean hasRightChild(int index){
        return rightChildIndex(index)<=size;
    }

    private int leftChild(int index){
        return items[leftChildIndex(index)];
    }

    private int rightChild(int index){
        return items[rightChildIndex(index)];
    }

    private int leftChildIndex(int index){
        return index*2+1;
    }

    private int rightChildIndex(int index){
        return index*2+2;
    }

    private void bubbleUp(){
        if(isFull()) throw new IllegalStateException();
        int index=size-1;
        while(index>0 && items[index]>items[parentIndex(index)]){
            swap(index, parentIndex(index));
            index=parentIndex(index);
        }
    }

    public boolean isFull(){
        return size==items.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    private void swap(int first, int second){
        int temp = items[first];
        items[first]=items[second];
        items[second]=temp;
    }

    private int parentIndex(int index){
        return (index-1)/2;
    }
}


}