package cn.com.demo07.dsls

/**
 * @Classname Demo01
 * @Description TODO
 * @Date 2020/2/21 16:21
 * @Created by LXYPC
 */
class Demo01 {

    public static void main(String[] args){

        Project p = new Project()
        p.setDate new Date() // p.setDate(new Date())
        println p.date

        //正常
        println("正常")
        p.setDateFormat({
            return it.format('yyyy-MM-dd HH:mm:ss')
        })
        //def clos = { key -> key.format('yyyy-MM-dd HH:mm:ss') }
        def clos = { it.format('yyyy-MM-dd HH:mm:ss') }
        p.setDateFormat(clos)

        //减return
        println("减return")
        p.setDateFormat {
            it.format('yyyy-MM-dd HH:mm:ss')
        }
        //减括号
        println("减括号")
        p.setDateFormat {
            it.format 'yyyy-MM-dd HH:mm:ss'
        }

    }
}

class Project{
    Date date

    void setDateFormat(Closure formatDate){
        println formatDate(date)    //println formatDate.call(date)
    }
}

