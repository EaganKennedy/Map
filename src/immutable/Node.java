package immutable;

import java.util.List;

public class Node<Key extends Comparable<Key>, Value> extends Map<Key, Value> {
    private final Key key;
    private final Value value;
    private final Map<Key, Value> left;
    private final Map<Key, Value> right;

    public Node(Key key, Value value, Map<Key, Value> left, Map<Key, Value> right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }
    @Override
    public int size() {
        return right.size() + left.size();
    }
    @Override
    public int depth() {
        return Math.max(left.depth(), right.depth());
    }
    @Override
    public boolean empty() {
        return false;
    }
    @Override
    public Map<Key, Value> setValue(Key key, Value value) {
        return new Node<>(key, value, EmptyNode.INSTANCE, EmptyNode.INSTANCE);
    }
    @Override
    public Object getValue(Key key) {
        if(key.equals(this.key)){
            return this.value;
        }
        else{
            @SuppressWarnings("unchecked")
            Value l = (Value) left.getValue(key);
            @SuppressWarnings("unchecked")
            Value r = (Value) right.getValue(key);
            if (l == null){
                return r;
            }
            else{
                return l;
            }
        }
    }
    @Override
    protected void addEntries(List<Entry> list) {
    }
}
