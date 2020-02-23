package cn.com.demo03.trait

/**
 * @Classname Demo01
 * @Description 实现特征
 * @Date 2020/2/21 12:32
 * @Created by LXYPC
 */
class Demo01 {

    public static void main(String[] args){
        Student st = new Student();
        st.StudentID = 1;
        st.Marks1 = 10;
        st.DisplayMarks()
    }

}

trait Marks {
    void DisplayMarks() {
        println("Display Marks");
    }
}

class Student implements Marks {
    int StudentID
    int Marks1;
}