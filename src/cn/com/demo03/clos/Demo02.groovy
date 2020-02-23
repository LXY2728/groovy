package cn.com.demo03.clos

/**
 * @Classname Demo02
 * @Description 闭包作为参数传递
 * @Date 2020/2/21 13:58
 * @Created by LXYPC
 */
class Demo02 {

    def static Display(clo) {
        clo.call("Word");
    }


    public static void main(String[] args){
        def clos = { param -> println "Hello ${param}" }
        Demo02.Display(clos);

    }
}
