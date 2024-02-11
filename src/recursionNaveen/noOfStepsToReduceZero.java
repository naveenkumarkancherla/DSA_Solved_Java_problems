package recursionNaveen;

import org.w3c.dom.ls.LSOutput;

public class noOfStepsToReduceZero {
    public static void main(String[] args) {
        int num = 14;
        int ans = noOfSteps(num);
        System.out.println(ans);
    }

    public static int noOfSteps(int num) {
        int count = 0;
        return steps(num, count);
    }

    private static int steps(int num, int count) {
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            return steps(num/2,count + 1);
        }else{
           return  steps(num - 1,count +1);
        }
    }


}
