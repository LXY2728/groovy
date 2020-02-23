package cn.com.demo07.junit

/**
 * @Classname Demo01
 * @Description junit
 * @Date 2020/2/21 15:16
 * @Created by LXYPC
 */
class Demo01 {

    public static void main(String[] args){
        StudentTest test = new StudentTest()
        test.testDisplay()

    }

}

public class Student {
    String name;
    int ID;

    String Display() {
        return name+ID;
    }
}

class StudentTest extends GroovyTestCase {

    void testDisplay() {
        def stud = new Student(name: 'Joe', ID: 1)
        println stud.Display()
        def expected = "Joe2"
        assertToString(stud.Display(), expected)
    }
}


