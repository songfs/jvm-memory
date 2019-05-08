package com.song;

/**
 * GC
 */
public class SystemGC {
    public static void main(String[] args) {
        System.out.println("GC之前");
        System.gc();
        System.out.println("GC之后");


        // 不让进程结束，便于使用分析工具来查看内存情况
 /*       try {
            Thread.sleep(24 * 60 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
