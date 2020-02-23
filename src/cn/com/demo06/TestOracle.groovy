package cn.com.demo06

import groovy.sql.Sql


class TestOracle {

    static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"
    static final String DRIVER = "oracle.jdbc.driver.OracleDriver"

    static final String USER = "LXY"
    static final String PWD = "12345678"

    public static void createTable() {

        def sql = Sql.newInstance(URL, USER, PWD, DRIVER)

        def sqlstr = """CREATE TABLE student ( 
         id NUMBER(4) NOT NULL,
         name CHAR(20),
         age NUMBER(2) )"""

        sql.execute(sqlstr);
        sql.close()

    }

    // 添加
    public static void addStudent() {

        def sql = Sql.newInstance(URL, USER, PWD, DRIVER)

        int id = 1
        String name = "Mohan"
        int age = 20

        def sqlstr = "INSERT INTO student(id,name,age) VALUES(${id}, ${name}, ${age})"

        println sqlstr
        try {
            sql.execute(sqlstr);
            sql.commit()
            println("Successfully committed")
        } catch (Exception ex) {
            sql.rollback()
            println("Transaction rollback")
        }

        sql.close()

    }

    // 修改
    public static void updateStudent() {

        def sql = Sql.newInstance(URL, USER, PWD, DRIVER)

        int id = 1
        def sqlstr = "UPDATE student SET age = age + 1 WHERE id = ${id} "

        try {
            sql.execute(sqlstr);
            sql.commit()
            println("Successfully committed")
        } catch (Exception ex) {
            sql.rollback()
            println("Transaction rollback")
        }

        sql.close()

    }

    // 删除
    public static void deleteStudent() {

        def sql = Sql.newInstance(URL, USER, PWD, DRIVER)

        int id = 1
        //def sqlstr = "delete from student"
        def sqlstr = "delete from student WHERE id = ${id} "

        try {
            sql.execute(sqlstr);
            sql.commit()
            println("Successfully committed")
        } catch (Exception ex) {
            sql.rollback()
            println("Transaction rollback")
        }

        sql.close()

    }

    // 查询
    public static void selectStudent() {
        // Creating a connection to the database
        def sql = Sql.newInstance(URL, USER, PWD, DRIVER)

        sql.eachRow('select * from student order by id') {
            tp ->
                println([tp.id, tp.name, tp.age])
        }

        sql.close()
    }


    public static void main(String[] args){

        //createTable()
        //addStudent()
        updateStudent()
        //deleteStudent()
        selectStudent()


    }
}


