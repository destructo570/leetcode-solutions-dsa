class MyHashMap {
    
    LinkedList<Entry>[] hash = new LinkedList[10];
    
    public void put(int key, int value) {
        int index = getIndex(key);
       

        if(hash[index]==null){
            LinkedList<Entry> ll = new LinkedList<>();
            ll.add(new Entry(key, value));
            hash[index] = ll;
        }else{
            Entry e = getEntry(key);
            if(e != null)
                e.val = value;
            else hash[index].add(new Entry(key, value));
        }
    }

    public int get(int key) {
        Entry e = getEntry(key);
        return e==null?-1:e.val;
    }

    public void remove(int key) {
        Entry e = getEntry(key);
        if(e!=null) hash[getIndex(key)].remove(e);
    }

    public int getIndex(int key){
        return key%hash.length;
    }

    public Entry getEntry(int key){
        LinkedList<Entry> ll = hash[getIndex(key)];

        if(ll != null) {
            for (Entry listElement : ll) {
                if (listElement.key == key)
                    return listElement;
            }
        }
        return null;
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