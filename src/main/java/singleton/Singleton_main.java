package singleton;
public class Singleton_main{
    public static void main(String[] args) {
        System.out.println("Two singletons were created but it displays only one!!\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}