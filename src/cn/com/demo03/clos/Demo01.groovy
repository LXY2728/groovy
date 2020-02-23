package cn.com.demo03.clos

/**
 * @Classname Demo01
 * @Description 闭包
 * @Date 2020/2/21 13:51
 * @Created by LXYPC
 */
class Demo01 {

    // 无参数
    static void test01(){
        def clos = {println "Hello World"};
        clos.call();
    }

    // 有参数
    static void test02(){
        def clos = {param->println "Hello ${param}"};
        clos.call("World");
    }

    // 隐式参数
    static void test03(){
        def clos = { println "Hello ${it}"};
        clos.call("World");
    }

    // 引用变量
    static void test04(){
        def str1 = "Hello";
        def clos = {param -> println "${str1} ${param}"}
        clos.call("World");
    }


    public static void main(String[] args){
        test01()
        test02()
        test03()
        test04()
    }
}
