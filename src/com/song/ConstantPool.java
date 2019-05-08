package com.song;

/**
 * 常量池
 * <p>
 * 相关文章：
 * 1. Java中几种常量池的区分：http://tangxman.github.io/2015/07/27/the-difference-of-java-string-pool/
 * 2. 彻底弄懂字符串常量池等相关问题:https://www.cnblogs.com/gxyandwmm/p/9495923.html
 */
public class ConstantPool {

    public static void main(String[] args) {
        String str1 = "abc"; //在堆中会有一个”abc”实例，全局StringTable中存放着”abc”的一个引用值
        String str2 = new String("def"); // 生成两个实例，一个是"def"的实例对象，并且StringTable中存储一个"def"的引用值，还有一个是new出来的一个"def"的实例对象。两个是不同的实例
        String str3 = "abc"; // 当在解析str3的时候查找StringTable，里面有”abc”的全局驻留字符串引用，所以str3的引用地址与之前的那个已存在的相同
        String str4 = str2.intern(); // str4是在运行的时候调用intern()函数，返回StringTable中”def”的引用值，如果没有就将str2的引用值添加进去，在这里，StringTable中已经有了”def”的引用值了，所以返回上面在new str2的时候添加到StringTable中的 “def”引用值
//        String str4 = str2;
        String str5 = "def"; // str5在解析的时候就也是指向存在于StringTable中的”def”的引用值
        System.out.println(str1 == str3);//true
        System.out.println(str2 == str4);//false
        System.out.println(str4 == str5);//true

    }
}
