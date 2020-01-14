public interface lockable{

    void setKey(int key);

    void lock(int key);

    void unlock(int key);

    boolean locked();
}
