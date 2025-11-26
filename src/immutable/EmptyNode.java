package immutable;

import java.util.List;

public class EmptyNode implements Map{
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
    public List<Entry> getEntries() {
        return List.of();
    }
}
