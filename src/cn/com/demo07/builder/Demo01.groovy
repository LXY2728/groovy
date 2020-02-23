package cn.com.demo07.builder

/**
 * @Classname Demo01
 * @Description JsonBuilder
 * @Date 2020/2/21 15:08
 * @Created by LXYPC
 */
class Demo01 {

    public static void main(String[] args) {
        def builder = new groovy.json.JsonBuilder()

        def root = builder.students {
            student {
                studentname 'Joe'
                studentid '1'

                Marks(
                        Subject1: 10,
                        Subject2: 20,
                        Subject3: 30,
                )
            }
        }

        println(builder.toString());


    }
}
