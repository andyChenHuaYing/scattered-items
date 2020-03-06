package org.oscar.basic;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author huaying
 * @version 0.0.1
 * @date 2019-05-05
 */
public class CompletableFutureTest {

    @Test
    public void name() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> f1 = CompletableFuture.runAsync(() -> {
            System.out.println("T1 洗水壶。。。");
            sleep(1);

            System.out.println("T1 烧开水。。。");
            sleep(15);
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() ->{
            System.out.println("T2 洗茶壶。。。");
            sleep(1);

            System.out.println("T2 洗茶杯。。。");
            sleep(2);

            System.out.println("T2 拿茶叶。。。");
            sleep(1);
            return "龙井...";
        });

        CompletableFuture<String> f3 = f1.thenCombine(f2, (__, tf) -> {
            System.out.println("T1 拿到茶叶：" + tf);
            System.out.println("T1 泡茶...");
            return "上茶:" + tf;
        });

        f3.join();

        String s = f3.get();
        System.out.println(s);
    }

    private void sleep(long second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
