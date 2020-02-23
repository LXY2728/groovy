package cn.com.demo05.xml

/**
 * @Classname Demo02
 * @Description xml解析
 * @Date 2020/2/21 14:37
 * @Created by LXYPC
 */
class Demo02 {

    static void test01(){
        def parser = new XmlParser()
        def doc = parser.parse("C:/test/test03.xml");

        doc.student.each{
            bk->
                print("studen id:")
                println "${bk['@id']}"

                print("studen name:")
                println "${bk.name[0].text()}"

                print("studen age:")
                println "${bk.age[0].text()}"

                print("studen sex:")
                println "${bk.sex[0].text()}"
        }

    }

    public static void main(String[] args){
        test01()

    }
}
