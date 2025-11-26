package immutable;

import java.util.List;

public interface Map {
    public interface Entry{
        public Object getKey();
        public Object getValue();
    }

    public static Map create(){
        return null;
    }

    public abstract int size();
    public abstract int depth();
    public abstract boolean empty();
    public abstract Map setValue(Object key, Object value);
    public abstract Object getValue(Object key);
    public List<Entry> getEntries();
    //move to implement when possible. protected abstract void addEntries()
}
