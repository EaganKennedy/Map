package immutable;

import java.util.List;

public class Node extends Map {

    public Node(Object key, Object value, Map left, Map right) {

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
        return false;
    }
    @Override
    public Map setValue(Object key, Object value) {
        return null;
    }
    @Override
    public Object getValue(Object key) {
        return null;
    }
    @Override
    protected void addEntries(List<Entry> list) {
    }
}
