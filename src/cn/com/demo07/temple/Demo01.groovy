package cn.com.demo07.temple

import groovy.text.SimpleTemplateEngine

/**
 * @Classname Demo01
 * @Description 模板引擎
 * @Date 2020/2/21 15:12
 * @Created by LXYPC
 */
class Demo01 {

    // 字符换模板
    static void test01(){

        def text ='This Tutorial focuses on $TutorialName. In this tutorial you will learn about $Topic'

        def binding = ["TutorialName":"Groovy", "Topic":"Templates"]
        def engine = new groovy.text.SimpleTemplateEngine()
        def template = engine.createTemplate(text)
        def writable = template.make(binding)

        println writable

    }

    // 文件模板
    static void test02(){

        def file = new File("C:/test/test02.xml")
        def binding = ['name' : 'Joe', 'id' : 1, 'subject' : 'Physics']

        def engine = new SimpleTemplateEngine()
        def template = engine.createTemplate(file)
        def writable = template.make(binding)

        println writable

    }

    public static void main(String[] args){
        test01()
        test02()

    }
}
