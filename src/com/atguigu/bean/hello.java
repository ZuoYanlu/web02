package com.atguigu.bean;


import java.util.ArrayList;
import java.util.List;

public class hello {

    public static void main(String[] args) {
        //List list = new ArrayList();
        List<String> lists = new ArrayList();
        lists.add("zhangsan");
        lists.add("lisi");
        lists.add("wangwu");
        for (String list:lists
             ) {
            System.out.println(list);
        }

        int i;
        if (lists !=null ) {
            i =27;
        } else {
            i=555;
        }
        System.out.println("i = " + i);

    }
}
