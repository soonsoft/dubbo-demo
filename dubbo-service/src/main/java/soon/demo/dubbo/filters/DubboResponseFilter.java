package soon.demo.dubbo.filters;


import com.alibaba.dubbo.rpc.*;

public class DubboResponseFilter implements Filter {

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        System.out.println("process response start...");
        System.out.println("interface: " + invocation.getInvoker().getInterface().getSimpleName());
        System.out.println("methodName: " + invocation.getMethodName());
        System.out.println("arguments: " + invocation.getArguments());
        System.out.println("process response end");

        return invoker.invoke(invocation);
    }
}
