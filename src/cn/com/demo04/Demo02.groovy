package cn.com.demo04

/**
 * @Classname Demo02
 * @Description 文件写入
 * @Date 2020/2/21 14:17
 * @Created by LXYPC
 */
class Demo02 {

    //覆盖写入
    static void test01(){
        new File('C:/test.txt').withWriter('utf-8') {
            writer -> writer.writeLine 'Hello World'
        }

        // 第二种写法
        new File("C:/test.txt").withPrintWriter { printWriter ->
            printWriter.println('The first content of file')
        }

    }

    // 追加写入
    static void test02(){

        File file = new File("C:/test.txt")
        file.append( '\nHello World' )

    }

    public static void main(String[] args){
        test01()
        test02()
    }
}
