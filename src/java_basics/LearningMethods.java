package java_basics;

public class LearningMethods {  // If we change the public class to private, we cannot use it in any other class than this class.

    public static void main(String[] args) {

//		System.out.println("asdasdasdas");
//		System.out.println(MyUtils.printSomeJunk("34"));
//		MyUtils.printSomeJunk(34);
//		MyUtils.sum2Numbers(10, 23);
//		int myvar=MyUtils.add10(99)+1000-50;
//		System.out.println(myvar);
//		ExampleClass.doSomething();

//		MyUtils.add10();  !!!we can not use without static method. If we want to use add10 method without static keyword, we have to do extra things:

        MyUtils myVar;
        myVar=new MyUtils();
        myVar.add10(0);
    }


}
