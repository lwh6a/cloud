package com.lwh.userclient.util;

import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 代码描述: 信号量测试
 *
 * @author liuwenhao
 * @date 2021/4/8
 */

public class SemapMain {


    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);
        semaphore.acquire();
        System.out.println("业务代码");
        semaphore.release();

        Executors.newCachedThreadPool();
    }
}
