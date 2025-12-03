package immutable;

import java.util.List;

public abstract class Map<Key extends Comparable<Key>, Value> {
    public interface Entry{
         Object getKey();
         Object getValue();
    }

    private class EntryValue implements Entry{
        private Object key;
        private Object value;

        @Override
        public Object getKey() {
            return key;
        }
        @Override
        public Object getValue() {
            return value;
        }
    }

     static Map create(){
        return null;
    }

    public abstract int size();
    public abstract int depth();
    public abstract boolean empty();
    public abstract Map<Key, Value> setValue(Key key, Value value);
    public abstract Object getValue(Key key);
    protected abstract void addEntries(List<Entry> list);
}
