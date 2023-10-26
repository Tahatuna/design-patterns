package singleton;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        for (; ; ) {
            i++;
            Singleton singleton = Singleton.getSingleton();
            //NotSingleton singleton = new NotSingleton();
            if (i == 10) {
                break;
            }
        }
    }
}
