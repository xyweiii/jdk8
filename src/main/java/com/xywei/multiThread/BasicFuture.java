package com.xywei.multiThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Project:jdk8
 * File: com.xywei.multiThread
 *
 * @author : xywei
 * @date : 2018-12-20
 */

public class BasicFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Integer> f = es.submit(() -> {
            // 异步计算
            // ……
            // 然后返回结果
            System.out.println("aaa");
            return 100;

        });
        es.shutdown();
        while (f.isDone()) {
            System.out.println(f.get());
            break;
        }
    }
}

