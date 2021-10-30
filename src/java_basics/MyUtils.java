package java_basics;

public class MyUtils {

    public static String printSomeJunk(String argument) {
        System.out.println("Some bla bla bla "+ argument);
        return argument;
    }

    public static void printSomeJunk(int argument) {  //method signature
        System.out.println("Integer passed in: "+ argument);
    }

    public static void sum2Numbers(int firstArg, int secondArg) {
        System.out.println(firstArg+secondArg);
    }

    public int add10(int someArgument) {  //notice that you can not use this method out of this class.
        int result=someArgument+10;
        return result;
    }
}
