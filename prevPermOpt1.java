import java.util.Arrays;

/**
 * @ClassName prevPermOpt1
 * @Description TODO
 * @Auther danni
 * @Date 2019/9/13 10:40]
 * @Version 1.0
 **/

public class prevPermOpt1 {
    public static int[] test(int[] array){
        for (int i = array.length-2; i >=0 ; i--) {
            if(array[i]>array[i+1]){
                int num=array[i];
                if((i+1)!=array.length-1){
                    int j=i+2;
                    while((array[j]>=array[j-1])&&(array[j]<num)&&(j<array.length)){
                        j++;
                        if(j==array.length){
                            j--;
                            break;
                        }
                        if(array[j]>=num){
                            while(array[j-1]==array[j-2]&&j>i){
                                j--;
                            }
                            int temp=array[i];
                            array[i]=array[j-1];
                            array[j-1]=temp;
                        }
                    }
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    break;
                }else{
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array={3,1,1,3};
        array=test(array);
        System.out.println(Arrays.toString(array));
    }
}
