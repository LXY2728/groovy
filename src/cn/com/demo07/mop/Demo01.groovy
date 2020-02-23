package cn.com.demo07.mop

/**
 * @Classname Demo01
 * @Description TODO
 * @Date 2020/2/21 15:48
 * @Created by LXYPC
 */
class Demo01 {

    public static void main(String[] args){

        Student mst = new Student();
        mst.Name = "Joe";
        mst.ID = 1;

        println(mst.Name);
        println(mst.ID);

        println mst.hello()
        println mst.work("123","121")

    }
}

class Student implements GroovyInterceptable {
    protected dynamicProps=[:]

    void setProperty(String pName,val) {
        dynamicProps[pName] = val
    }

    def hello() {
        'Hello Word'
    }

    def getProperty(String pName) {
        dynamicProps[pName]
    }

    def methodMissing(String name, def args) {
        return "Missing method $name $args"
    }

//    def invokeMethod(String name, Object args) {
//        return  "called invokeMethod $name $args "
//    }



}
