package immutable;

import java.util.List;

public class EmptyNode<Key extends Comparable<Key>, Value> extends Map<Key, Value> {

    @SuppressWarnings("rawtypes")
    public static final EmptyNode INSTANCE = new EmptyNode<>();

    private EmptyNode() {
    }
    @Override
    public int size() {
        return 0;
    }
    @Override
    public int depth() {
        return 0;
    }
    @Override
    public boolean empty() {
        return true;
    }
    @Override
    public Map<Key, Value> setValue(Key key, Value value) {
        return new Node(key, value, EmptyNode.INSTANCE, EmptyNode.INSTANCE);
    }
    @Override
    public Object getValue(Key key) {
        return null;
    }
    @Override
    protected void addEntries(List<Entry> list) {
    }
}
