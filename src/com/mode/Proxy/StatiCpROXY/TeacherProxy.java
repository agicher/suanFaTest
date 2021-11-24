package com.mode.Proxy.StatiCpROXY;

public class TeacherProxy implements ITeacher{
    private ITeacher teacher;
    public TeacherProxy(ITeacher teacher){
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("start   Proxy");
        teacher.teach();
        System.out.println("end    Proxy");
    }
}
