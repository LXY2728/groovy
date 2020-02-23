package cn.com.demo07.dsls

/**
 * @Classname Demo02
 * @Description DSLS
 * @Date 2020/2/21 16:24
 * @Created by LXYPC
 */
class Demo02 {

    public static void main(String[] args){
        Project_2 pj = new Project_2()
        pj.setDate new Date()
        pj.run()
    }
}

class Project_2{

    Date date

    void setDateFormat(Closure formatDate){
        println formatDate.call(date)
    }

    //将format内置
    String format(String f){
        println date.format(f)
    }

    //无形参的方法
    String showDate(){
        date.toString()
    }

    void run(){
        setDateFormat{
            println 'this is a scrip '+it
            format 'yyyy-MM-dd HH:mm:ss'
            //没有形参的话就只能乖乖写括号了
            showDate()+it
        }
    }
}

