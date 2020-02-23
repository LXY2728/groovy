package cn.com.demo05.xml

import groovy.xml.MarkupBuilder

/**
 * @Classname Demo01
 * @Description xml构建
 * @Date 2020/2/21 14:29
 * @Created by LXYPC
 */
class Demo01 {

    // 构建单层
    static void test01() {

        def mB = new MarkupBuilder()

        // Compose the builder
        mB.collection(shelf: 'New Arrivals') {
            movie(title: 'Enemy Behind')
            type('War, Thriller')
            format('DVD')
            year('2003')
            rating('PG')
            stars(10)
            description('Talk about a US-Japan war')
        }

    }

    // 构建多层
    static void test02() {

        def mp = [1: ['Enemy Behind', 'War, Thriller', 'DVD', '2003', 'PG', '10', 'Talk about a US-Japan war'],
                  2: ['Transformers', 'Anime, Science Fiction', 'DVD', '1989', 'R', '8', 'A scientific fiction']]

        def mB = new MarkupBuilder()

        def MOVIEDB = mB.collection('shelf': 'New Arrivals') {
            mp.each {
                sd ->
                    mB.movie('title': sd.value[0]) {
                        type(sd.value[1])
                        format(sd.value[2])
                        year(sd.value[3])
                        rating(sd.value[4])
                        stars(sd.value[4])
                        description(sd.value[5])
                    }
            }
        }
    }


    public static void main(String[] args) {
        //test01()
        test02()

    }

}
