package com.song;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * 永久代
 * 需要使用 JDK 1.7
 */
public class PermGenOom {
    final static List<ClassLoader> classLoaderList = new ArrayList<ClassLoader>();
    public final static String M2 = "sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款sadfasdfasdfasdfjkasdhfkjasdhfkl上大咖减肥教和收到卡复活上岛咖啡电话费萨克京东方暗时刻的积分爱仕达发技术的付款就暗示付了款";

    final static List<String> strList = new ArrayList<String>();

    public static void main(String[] args) {
        URL url = null;

        try {
            url = new File(PermGenOom.class.getResource("/").getPath()).toURI().toURL();
//            url = new File("/temp").toURI().toURL();
            System.out.println(url.getPath());
            URL[] urls = {url};
            int i=0;
            while (true) {
                i++;
                ClassLoader loader = new URLClassLoader(urls);
//                Class.forName("com.song.Test",true,loader);

                loader.loadClass("com.song.Test");
                loader.setClassAssertionStatus("com.song.Test",true);
                classLoaderList.add(loader);
//                strList.add(M2+i);

//                ClassLoader classLoader = PermGenOom.class.getClassLoader();
//                classLoader.loadClass("com.song.Test");
//                classLoaderList.add(classLoader);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 不让进程结束，便于使用分析工具来查看内存情况
        try {
            Thread.sleep(24 * 60 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
