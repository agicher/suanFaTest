package com.mode.Adapter.extendImpl;

/**
 * 基于继承实现
 */
public class Adaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }

    @Override
    public void f3() {
        super.fc();
    }
}
