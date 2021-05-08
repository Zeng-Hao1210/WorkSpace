package java;

import java.util.ArrayList;

/**
 * @author 曾滈
 * @create 2021-05-07 18:58
 */
public class Template {
    //模板六：prsf:可生成private static final
    private static final Customer cust=new Customer();

    //变形：psf
    public static final int NUM=1;//ctrl+shift +y进行变量大小写之间的转换
    //变形：psfi
    public static final int NUM2=1;

    public static final String NATION="中国";




    //模板一：psvm
    public static void main(String[] args) {

        //模板二：
        System.out.println();

//        souf就是直接打一个字符串
        System.out.printf("");


        int num=10;
        System.out.println("num = " + num);
        //soutv会根据最近的那个变量直接打印相应的变量值
        System.out.println(num);

        System.out.println("Template.main");
        //parameter就是那个p的意思

//        System.out.println("args = [" + args + "]");

        //模板三：fori
        String[] arr=new String[]{"Tom","Alex","Jerry","LiMei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //iterator:迭代器
        for (String s : arr) {
            System.out.println(s);

        }
        //itar:遍历数组的每一个元素
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
        //模块四：list.for
        ArrayList list =new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        list.add(789);
        //iter直接生成foreach
        for (Object o : list) {
            
        }
        //生成的是普通的for循环遍历
        //fori是从头到尾的一个遍历
        for (int i = 0; i < list.size(); i++) {
            
        }
//        是从尾到头的一个遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        if (list == null) {
            
        }

    }
    public void method(){
        //模板五：
        ArrayList list =new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        list.add(789);
        if (list == null) {
        //自动判断最近的那个变量
            
        }
        //变形：inn=if not null判断是否不是空值，就是inn
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }
    }



}
