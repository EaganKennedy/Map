package immutable;

import java.util.List;

public abstract class Map<Key extends Comparable<Key>, Value> {
    public interface Entry{
         Object getKey();
         Object getValue();
    }

    @SuppressWarnings("rawtypes")
    public static Map create(){
        return EmptyNode.INSTANCE;
    }

    public abstract int size();
    public abstract int depth();
    public abstract boolean empty();
    public abstract Map<Key, Value> setValue(Key key, Value value);
    public abstract Object getValue(Key key);
    public abstract void addEntries(List<Entry> list);
}
