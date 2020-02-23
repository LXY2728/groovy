package cn.com.demo05.json

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/**
 * @Classname Demo01
 * @Description json
 * @Date 2020/2/21 14:40
 * @Created by LXYPC
 */
class Demo01 {

    // 解析json
    static void test01(){

        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')

        println(object.name);
        println(object.ID);

        Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
        lst.each { println it }
        println lst.List
        lst.List.each{
            print it+" "
        }

    }

    // 构建json
    static void test02(){

        def output = JsonOutput.toJson([name: 'John', ID: 1])
        println(output);

        def output2 = JsonOutput.toJson([ new Student(name: 'John',ID:1),
                                          new Student(name: 'Mark',ID:2)])
        println(output2);

//        Student stu1 = new Student()
//        stu1.setName("John")
//        stu1.setID(1)
//
//        Student stu2 = new Student()
//        stu2.setName("Mark")
//        stu2.setID(2)
//
//        def output3 = JsonOutput.toJson([ stu1, stu2])
//        println(output3);

    }

    public static void main(String[] args){
//        test01()
        println " "
        test02()

    }
}

class Student {
    String name
    int ID;

//    String getName() {
//        return name
//    }
//
//    void setName(String name) {
//        this.name = name
//    }
//
//    int getID() {
//        return ID
//    }
//
//    void setID(int ID) {
//        this.ID = ID
//    }


}

