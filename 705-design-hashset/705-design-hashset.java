class MyHashSet {

    LinkedList<Integer>[] hash = new LinkedList[10];

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        int index = getIndex(key);

        if(hash[index]==null){
            LinkedList<Integer> ll = new LinkedList<>();
            ll.add(key);
            hash[index] = ll;
        }else{
            if(getObject(key) == null) hash[index].add(key);
        }
    }

    public void remove(int key) {
        Integer i = getObject(key);
        if(i!=null) hash[getIndex(key)].remove(i);
    }
    
    public boolean contains(int key){
        Integer i = getObject(key);
        return i != null;
    }

    public Integer getObject(int key){
        LinkedList<Integer> ll = hash[getIndex(key)];
        
        if(ll==null) return null;

        for(int element: ll)
            if(element == key) return element;
        return null;
    }

    public int getIndex(int key){
        return key%hash.length;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */