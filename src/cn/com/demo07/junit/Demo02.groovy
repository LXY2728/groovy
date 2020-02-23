package cn.com.demo07.junit

import junit.textui.TestRunner

/**
 * @Classname Demo02
 * @Description TODO
 * @Date 2020/2/21 15:21
 * @Created by LXYPC
 */
class Demo02 {

    public static void main(String[] args){
        TestRunner.run(AllTests.suite())
    }

}

public class Student_2 {
    String name;
    int ID;

    String Display() {
        return name +ID;
    }
}

class StudentTest_01 extends GroovyTestCase {
    void testDisplay() {
        def stud = new Student_2(name : 'Joe', ID : 1)
        def expected = 'Joe2'
        assertToString(stud.Display(), expected)
    }
}

class StudentTest_02 extends GroovyTestCase {
    void testDisplay() {
        def stud = new Student_2(name : 'Joe', ID : 2)
        def expected = 'Joe3'
        assertToString(stud.Display(), expected)
    }
}

class AllTests {

    static suite() {

        def allTests = new GroovyTestSuite()
        allTests.addTestSuite(StudentTest_01.class)
        allTests.addTestSuite(StudentTest_02.class)
        return allTests
    }
}


