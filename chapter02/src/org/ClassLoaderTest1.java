package org;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;
import java.util.Arrays;

/**
 * @author YTM
 * @date 2020/7/6 15:32
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("*************启动类加载器**************");
        // 获取BootstrapClassLoader能够加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        Arrays.stream(urLs).forEach(System.out::println);
        System.out.println();
        // 从上面的路径中随意选择一个类,来看看它的加载器是什么
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println();


        System.out.println("*************扩展类加载器**************");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
        System.out.println();
        // 从上面的路径中随意选择一个类,来看看它的加载器是什么
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);
        System.out.println();
    }
}
