package cn.com.demo03.clos

/**
 * @Classname Demo03
 * @Description 集合遍历
 * @Date 2020/2/21 14:00
 * @Created by LXYPC
 */
class Demo03 {

    // 遍历list
    static void test_list(){

        def lst = [11, 12, 13, 14];
        lst.each{
            print it+"\t"
        }
        println " "
        lst.each{
            param-> print param+"\t"
        }
    }

    // 遍历map
    static void test_map(){

        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]


        mp.each{
            key,value-> println "key: "+key+"\t"+"value: "+value
        }
        println " "

        mp.each{
            println it
        }
        println " "

        mp.each{
             println "key: "+it.key+"\t"+"value: "+it.value
        }
    }

    public static void main(String[] args){

        test_list();
        println " "
        test_map();


    }
}
