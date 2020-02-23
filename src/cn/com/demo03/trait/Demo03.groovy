package cn.com.demo03.trait

/**
 * @Classname Demo03
 * @Description TODO
 * @Date 2020/2/21 13:49
 * @Created by LXYPC
 */
class Demo03 {
    public static void main(String[] args){
        Student st = new Student();
        st.StudentID = 1;
        st.DisplayMarks();
    }
}

trait Marks_3 {
    void DisplayMarks() {
        println("Marks1");
    }
}

trait Total_3 extends Marks_3 {
    void DisplayMarks() {
        println("Total");
    }
}

class Student_3 implements Total_3 {

    int StudentID
}
