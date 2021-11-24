package com.mode.Proxy.jdkProxy;

public class Main {
    public static void main(String[] args) {
        ITeacherImpl iTeacher = new ITeacherImpl();
        ITeacher instance = (ITeacher)new jdkProxy(iTeacher).getInstance();
        instance.teach();

    }
}
