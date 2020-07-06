package org;

/**
 * @author YTM
 * @date 2020/7/6 16:01
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            // 1.
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);
            // 2.
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);

            // 3.
            ClassLoader classLoader2 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
