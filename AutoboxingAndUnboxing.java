public class AutoboxingAndUnboxing {
    public static void main(String[] args){
        //wrapper class-->درجاوا به ما این امکان را میدهند که اشیا را به داده های اولیه وداده های اولیه را به اشیا تبدیل کنیم.
        //autoboxing:primitive data--->obj
        //unboxing :obj--->primitive
        /* wrapper class       primitive
           Boolean               boolean
            Integer                int
            Float                  float
            Character               char
            .....

         */
        Integer myNum=new Integer(5);
        int i=myNum.intValue();
        int j=myNum; //unboxing
        System.out.println("i="+i);
        System.out.println("j="+j);//print unboxing

    }
}
