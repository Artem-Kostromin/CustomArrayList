import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        CustomArrayList myArrList = new CustomArrayList();
        int[] arr = {1,2,3,5,6,7,8,3,21,5,2,6,78,9};
        for(int i:arr){
            myArrList.add(i);
        }
        myArrList.add(4, 100);
        System.out.println(myArrList.get(5));
    }
}
