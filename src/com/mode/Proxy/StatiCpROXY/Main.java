package com.mode.Proxy.StatiCpROXY;

public class Main {
    public static void main(String[] args) {
        ITeacherImpl iTeacher = new ITeacherImpl();
        TeacherProxy teacherProxy = new TeacherProxy(iTeacher);
        teacherProxy.teach();
    }
}
