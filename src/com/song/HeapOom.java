package com.song;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: songfs@133.cn
 * @date: 2019/4/25 9:03
 * @description:
 */
public class HeapOom {
    public static void main(String[] args) {
        // 此list实例会存放在堆内存中
        List<byte[]> list = new ArrayList<>();
        int i = 0;
        boolean flag = true;
        while (flag) {
            try {
                i++;
                // 每次增加一个1M大小的数组对象
                list.add(new byte[1024 * 1024]);
            } catch (Throwable e) {
                e.printStackTrace();
                flag = false;
                // 记录次数
                System.out.println("count=" + i);
            }
        }

        // 不让进程结束，便于使用分析工具来查看内存情况
        try {
            Thread.sleep(24 * 60 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
