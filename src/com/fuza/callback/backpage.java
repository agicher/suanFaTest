package com.fuza.callback;

public class backpage {
    //0-1 背包问题有很多变体，我这里介绍一种比较基础的。
    // 我们有一个背包，背包总的承载重量是 Wkg。现在我们有 n 个物品，
    // 每个物品的重量不等，并且不可分割。我们现在期望选择几件物品，装载到背包中。
    // 在不超过背包所能装载重量的前提下，如何让背包中物品的总重量最大
    public int maxW = Integer.MIN_VALUE;
    public void f(int i, int[] items, int n, int w, int cw){

        if (cw ==w || i == n){
            if (maxW < cw) maxW = cw;
            return;
        }

        f(i+1,items,n,w,cw);
        if (cw + items[i] <= w){
            f(i+1,items,n,w,items[i]+cw);
        }
    }

}
