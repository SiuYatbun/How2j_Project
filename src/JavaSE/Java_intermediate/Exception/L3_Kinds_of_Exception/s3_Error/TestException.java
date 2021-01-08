package JavaSE.Java_intermediate.Exception.L3_Kinds_of_Exception.s3_Error;

/*
错误Error，指的是系统级别的异常，通常是内存用光了
在默认设置下，一般java程序启动的时候，最大可以使用16m的内存
如例不停的给StringBuffer追加字符，很快就把内存使用光了。抛出OutOfMemoryError
与运行时异常一样，错误也是不要求强制捕捉的
 */

public class TestException {

    public static void main(String[] args) {

        StringBuffer sb =new StringBuffer();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sb.append('a');
        }

    }

}
