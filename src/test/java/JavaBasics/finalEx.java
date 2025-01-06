package JavaBasics;

public class finalEx {
    final int speedlimit = 90;

    void run() {
        //speedlimit=400; (we can't override the final variables)
    }

    public static void main(String[] args) {
        finalEx finalEx = new finalEx();
        finalEx.run();
    }
}
