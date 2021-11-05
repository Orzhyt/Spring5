package proxy;

import java.lang.reflect.Proxy;

public class CjcProxy {
    public static Object getProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
            (proxy, method, args) -> {
                System.out.println(method.getName() + "方法开始执行...");
                Object result = method.invoke(obj, args);
                System.out.println(method.getName() + "方法执行结束...");
                return result;
            });
    }
}
