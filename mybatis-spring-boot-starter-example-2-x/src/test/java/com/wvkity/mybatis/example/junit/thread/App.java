package com.wvkity.mybatis.example.junit.thread;

public class App {

    public interface Inter {
        String test();
    }
    public static class Parent implements Inter {
        @Override
        public String test() {
            System.out.println("我是父类的test方法.");
            this.text();
            return "test";
        }
        public String text() {
            System.out.println("我是父类的text方法，但是返回值为null");
            return null;
        }
    }
    public static class Child extends Parent {
        @Override
        public String text() {
            System.out.println("我是子类的text方法，重写了父类的方法，返回值为text");
            return "text";
        }
    }
    public static class Proxy {
        Inter c;
        public void test() {
            c.test();
        }
    }
    public static void main(String[] args) {
        Parent p = new Child();
        Proxy proxy = new Proxy();
        proxy.c = p;
        proxy.test();
    }
}
