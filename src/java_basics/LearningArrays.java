package java_basics;

public class LearningArrays {

    public static void main(String[] args) {

        double[] values=new double[100];
        values[0]=1000;
        values[1]=33.44;
        values[99]=93432;

        System.out.println(values[0]);

//		String[] words=new String[] {"My","name","is"};

        String[] words=new String[3];
        words[0]="My";
        words[1]="Names";
        words[2]="is";

        System.out.println(words[0]);

        //increase the String size
        words=new String[10]; //after that all the slots will be deleted

        System.out.println(words[0]);
    }

}
