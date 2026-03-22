package huan.diy.r1iot.configure;

import org.apache.catalina.connector.ClientAbortException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ClientAbortException.class)
    public void handleClientAbortException(ClientAbortException ex) {
        // 记录日志或者忽略
        System.out.println("客户端提前关闭连接，忽略：" + ex.getMessage());
    }
}