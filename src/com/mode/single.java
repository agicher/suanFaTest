package com.mode;

public class single {
}

// 饿汉模式
class singleton_enhan{
    private static final singleton_enhan instance = new singleton_enhan();
    private singleton_enhan(){}
    public static singleton_enhan getInstance(){
        return instance;
    }
}

//懒汉模式
class singleton_lanhan{
    private static singleton_lanhan instance;
    private singleton_lanhan(){}
    public synchronized static singleton_lanhan getInstance(){
        if (instance == null) return new singleton_lanhan();
        return instance;
    }
}

//双层校验
class singleton_double{
    private static singleton_double instance;
    private singleton_double(){}
    public static singleton_double getInstance(){
        if (instance == null){
            synchronized (singleton_double.class){
                if (instance == null){
                    return new singleton_double();
                }
            }
        }
        return instance;
    }
}

//今天太内部类
class singleton_static{
   private singleton_static(){}
    public static class instance{
        private static singleton_static instance = new singleton_static();
    }
    public singleton_static getInstance(){
       return instance.instance;
    }
}

//枚举
class singleton_enum{
    private enum getInstance{
        INSTANCE;
        private final singleton_enum instance;
        private getInstance(){
            instance = new singleton_enum();
        }
        public singleton_enum getInstance(){return instance;}
    }

    public static singleton_enum getInstance(){
        return getInstance.INSTANCE.getInstance();
    }
}