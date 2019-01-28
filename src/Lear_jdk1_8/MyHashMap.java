package Lear_jdk1_8;

// 手写HashMap实现
public class MyHashMap<K,V> {
    // 定义数组
    private Entry[] table;

    // 容量
    private static final Integer CAPACITRY = 8;

    private Integer size = 0;

    public MyHashMap(){
        // 初始化数组
        this.table = new Entry[CAPACITRY];
    }
    public int size(){
        return size;
    }

    public Object get(Object key){
        int hashCode = key.hashCode();
        int index = hashCode % 8;

        // 如果key存在，即返回值
        for(Entry<K,V> entry = table[index]; entry!=null; entry = entry.next){
            if (entry.k.equals(key)){
                return entry.v;
            }
        }
        return null;
    }

    // Object返回旧的值
    public Object put(K key,V value){
        int hashCode = key.hashCode();
        int index = hashCode % 8;

        // 如果key存在，即覆盖
        for(Entry<K,V> entry = table[index]; entry!=null; entry = entry.next){
            if (entry.k.equals(key)){
                V oldValue = entry.v;
                entry.v = value;
                return oldValue;
            }
        }

        addEntry(key, value, index);
        return null;
    }

    // 添加到数组中
    private void addEntry(K key, V value, int index) {
        table[index] = new Entry(key,value, (Entry) table[index]);
        size++;
    }

    // 节点对象
    class Entry<K,V>{

        private K k;
        private V v;
        private Entry<K,V>  next;

        public Entry(K k, V v, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        for (int i = 0;i<10;i++) {
            myHashMap.put("张三"+i, "李四"+i);
        }
        System.out.println(myHashMap.get("张三"));
    }

}
