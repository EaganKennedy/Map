package immutable;

import java.util.List;

public class EmptyNode extends Map {

    public static final EmptyNode INSTANCE = new EmptyNode();

    private EmptyNode() {}
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
    public Map setValue(Object key, Object value) {
        return new Node(key, value, EmptyNode.INSTANCE, EmptyNode.INSTANCE);
    }
    @Override
    public Object getValue(Object key) {
        return null;
    }
    @Override
    protected void addEntries(List<Entry> list) {

    }
}
