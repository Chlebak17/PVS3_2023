package oop.collections.mapping;

public class MyHashTable{

    Entry[] data;

    int getHashCode(String s){
        char[] a = s.toCharArray();

        return s.hashCode()% data.length;
    }

    int get(String key){
        int index = getHashCode(key);
        Entry concurrent = data[index];
        while (concurrent != null){
            if (concurrent.fileKey.equals(key)){
                return concurrent.fileVal;
            }
            concurrent = concurrent.next;
        }
        return -1;
    }

    public MyHashTable(int initialCapacity) {
        data = new Entry[initialCapacity];
    }

    void add(String key, int value){
        int index = getHashCode(key);
        Entry toAdd = new Entry(key, value);
        toAdd.next = data[index];
        data[index] = toAdd;
    }





}class Entry{
    public String fileKey;
    int fileVal;
    Entry next;

    public Entry(String fileName, int fileIndex) {
        this.fileKey = fileName;
        this.fileVal = fileIndex;
    }
}
