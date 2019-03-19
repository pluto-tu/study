package leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tubangwu on 2019-03-17.
 *
 * @author tubangwu
 */
public class FindString {

    public static void main(String[] args) {
<<<<<<< HEAD
        String s="abab";
        String ss="baba";
        System.out.println("------"+findCharMost1(s)+"---"+findCharMost1(ss));
    }



    public static char findCharMost1(String s) {
=======
        String s="aabbcccbda";
        System.out.println("----"+findCharMost(s));
    }

    /**
     * 字符串中  最先满足次数最大
     *
     * @param s
     * @return
     */
    public static char findCharMost(String s) {
>>>>>>> fc62bf4f45937df12d50cb1aecc54cd94ef00d0a
        //记录字符串中的字符
        List<Character> list=new ArrayList<>();
        //记录对应字符出现的次数
        List<Integer> list2=new ArrayList<>();
        //因为题目要求最先达到次数，那么我就倒着来遍历字符串
        //那么记录顺序的list中就有字符串的顺序了
        for(int i=s.length()-1;i>=0;i--){
            if(!list.contains(s.charAt(i))) {
                //如果字符没有出现过,那么add到list中
                list.add(s.charAt(i));
                //同时在list2对应位置赋值为1
                list2.add(1);
            }else {
                //如果字符出现过，那么找到其对应的index
                int index=list.indexOf(s.charAt(i));
                //在list2对应位置将次数++
                list2.set(index,list2.get(index)+1);
            }
        }
        int max=list2.get(list2.size()-1);
        int j=list2.size()-1;
        //记录顺序的list中是按后到的字符放在前面的顺序
        //所以我们只要倒着遍历找到最大值就可以了
        for(int i=list2.size()-2;i>=0;i--){
            if(list2.get(i)>max){
                max=list2.get(i);
                j=i;
            }
        }
        return list.get(j);

    }

    /**
     * 字符串中最先出现 满足次数最大
     *
     * @param string
     * @return
     */
    private static Character getMax(String string){

        List<Character> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i =0;i<string.length();i++){
            if(!list1.contains(string.charAt(i))){
                list1.add(string.charAt(i));
                list2.add(1);
            }else {
                int index = list1.indexOf(string.charAt(i));
                list2.set(index,list2.get(index)+1);
            }
        }
        int max = list2.get(0);
        int index = 0;
        for(int i=0;i<list2.size();i++){
            if(list2.get(i)>max){
                max = list2.get(i);
                index=i;
            }
        }
        return list1.get(index);
    }

}
