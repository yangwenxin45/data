package net.yangwenxin.dsa;

public class ExceptionQueueFull extends RuntimeException {

    public ExceptionQueueFull(String err) {
        super(err);
    }
}
