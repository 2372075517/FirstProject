package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author xzh
 * @data 2020/5/31 - 14:41
 **/
public class model {

    //模板六: prsf: 可生成 private static final
    private static final Customer CUST = new Customer();
    //变形: psf   public static final
    //psfi  public static final int
    //psfs  public static final String



    //模板一:psvm
    public static void main(String[] args) {

        //模板二:sout
        System.out.println();
        //变形: soutp/  soutm/  soutv/  xxx.sout
        System.out.println("args = [" + args + "]");

        System.out.println("model.main");

        int num = 0;
        System.out.println("num = " + num);

        System.out.println(num);

        //模板三:  fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei"};
        for (int i = 0; i < arr.length; i++) {
            
        }

        //变形:   iter
        for (String s : arr) {

        }
        //变形:   itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }


        //模板四:  list.for
        ArrayList<String> list = new ArrayList<>();
        for (String s : list) {
            
        }

        //变形:   list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //变形:   list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }


    public void method(){
        System.out.println("model.method");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(123);
        list.add(345);
        list.add(567);

        //模板五: ifn
        if (list == null) {
            
        }

        //变形: inn
        if (list != null) {
            
        }

        // xxx.null  xxx.nn
        if (list == null) {

        }

        if (list != null) {

        }
    }
}
