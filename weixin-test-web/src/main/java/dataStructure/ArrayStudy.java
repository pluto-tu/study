package dataStructure;

/**
 * Created by tubangwu on 2019-03-19.
 *
 * @author tubangwu
 */
public class ArrayStudy {


    /**
     *   数组里面有正数、负数 量大概1000万吧，找出子集之和最大的序列出来
     *
     * @param x
     */
    public  static  void max(int[] x){
        int maxEnd=0;
        int temp=0;
        //新数组的下界与上界
        int l=0,u=0;

        for (int j = 0; j < x.length; j++) {
            //为正数 一直累加
            if(maxEnd+x[j]>0){
                maxEnd=maxEnd+x[j];
            }else{
                //加起来为负数 跳过这个2个数 从第三个开始
                l=j+1;
                maxEnd=0;
            }

            //累加后的后大于之前的值 指针才往后走
            if(temp<maxEnd){
                temp=maxEnd;
                u=j;
            }

        }
        System.out.println("--"+l);

        System.out.println("--"+u);
    }

    public static void main(String[] args) {
        int[] x = {3,-1,1,9};
        max(x);
    }
}
