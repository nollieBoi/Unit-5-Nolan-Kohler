public class Die implements lockable{
    private int face;
    private int key;
    private boolean locked;

    public Die(int key){
        this.key = key;
        locked = false;
        roll();
    }

    public boolean locked(){ return locked; }

    public void setKey(int key){
        this.key = key;
    }

    public void lock(int keyInput){
        if(keyInput == key){
            locked = true;
        }
    }

    public void unlock(int keyInput){
        System.out.println("Unlocking with key: " + key + " .. beeePPPPPPE");
        if(keyInput == key){
            locked = false;
            System.out.println("SUCCESSFULLY UNLOCKED... YYAYAYAYYYAYY");
        }else{
            locked = true;
            System.out.println("Failed to unlock... key incorrect. saaadddd.");
        }
    }

    public void roll() {
        if (!locked) {
            face = (int) Math.random() * 6 + 1;
        }else {
            System.out.println("Roll method is locked, please unlock to use");
            face = 0;
        }
    }

    public int getFace(){
        return face;
    }

    @Override
    public String toString() {
        String result = "Face value is: " + face;
        return result;
    }
}
