package cn.com.demo04

/**
 * @Classname Demo01
 * @Description 文件读取
 * @Date 2020/2/21 14:11
 * @Created by LXYPC
 */
class Demo01 {

    // eachLine
    static void test01(){

        new File("C:/test.txt").eachLine {
            flieName -> println  flieName
        }

        new File("C:/test.txt").eachLine {
            println it
        }
    }

    // text
    static void test02(){

        File file = new File("C:/test.txt")
        println file.text

    }

    // readLines
    static void test03(){

        File file = new File("C:/test.txt")
        def list = file.readLines() ;
        list.each {
            println it
        }

    }
    public static void main(String[] args){

        test01()
        test02()
        test03()
    }
}
