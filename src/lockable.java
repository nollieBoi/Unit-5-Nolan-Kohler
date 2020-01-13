public interface lockable {
    int key = 0;
    Boolean isLocked = false;

    void setKey(int key);

    void lock(int key);

    void unlock(int key);

    Boolean locked();
}
