class MyHashMap {
    
    LinkedList<Entry>[] hash = new LinkedList[10];

    public void put(int key, int value) {
        int index = getIndex(key);

        if(hash[index]==null){
            LinkedList<Entry> ll = new LinkedList<>();
            ll.add(new Entry(key, value));
            hash[index] = ll;
        }else{
            LinkedList<Entry> ll = hash[index];

            for (Entry listElement : ll) {
                if(listElement.key == key){
                    listElement.val = value;
                    return;
                }
            }

            ll.add(new Entry(key, value));
        }
    }

    public int get(int key) {
        LinkedList<Entry> ll = hash[getIndex(key)];
        
        if(ll==null) return -1;
        
        for (Entry listElement : ll) {
            if(listElement.key == key)
                return listElement.val;
        }
        
        return -1;
    }

    public void remove(int key) {
        LinkedList<Entry> ll = hash[getIndex(key)];
        if(ll==null) return;
        ll.removeIf(listElement -> listElement.key == key);
    }

    public int getIndex(int key){
        return key%hash.length;
    }

    private class Entry{
        int key;
        int val;

        public Entry(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */