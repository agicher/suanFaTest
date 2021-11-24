package com.mode.Adapter.comp;

/**
 * 对象适配器
 * 基于 组合
 * 组合 相对灵活一些
 */
public class Adpator implements ITarget {
    private Adaptee adaptee;
    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }

    @Override
    public void f3() {
        adaptee.fc();
    }
}
