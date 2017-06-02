/**
 * Created by sean on 2017/6/2.
 */
public class HelloImpl implements HelloApi {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}