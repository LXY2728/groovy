package cn.com.demo03.trait

/**
 * @Classname Demo02
 * @Description 特征实现一个接口
 * @Date 2020/2/21 12:35
 * @Created by LXYPC
 */
class Demo02 {
    public static void main(String[] args){
        Student_2 st = new Student_2();
        st.StudentID = 1;
        st.Marks1 = 10;

        st.DisplayMarks()
        st.DisplayTotal()
    }


}

//接口
interface Total {
    void DisplayTotal()
}

// 特征实现接口
trait Marks_2 implements Total {
    void DisplayMarks() {
        println("Display Marks");
    }

    void DisplayTotal() {
        println("Display Total");
    }
}

class Student_2 implements Marks_2 {
    int StudentID
    int Marks1;
}
