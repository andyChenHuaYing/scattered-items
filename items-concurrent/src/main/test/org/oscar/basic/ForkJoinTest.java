package org.oscar.basic;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-05-05
 */
public class ForkJoinTest {
    @Test
    public void testOne() throws InterruptedException {
        // 创建随机数组成的数组:
        long[] array = new long[40000];
        fillRandom(array);
        // fork/join task:
        ForkJoinPool fjp = new ForkJoinPool(4); // 最大并发数4
        ForkJoinTask<Long> task = new SumTask(array, 0, array.length);
        long startTime = System.currentTimeMillis();
        Long result = fjp.invoke(task);
        long endTime = System.currentTimeMillis();
        System.out.println("Fork/join sum: " + result + " in " + (endTime - startTime) + " ms.");

        System.out.println("==================");
        long startTimeTwo = System.currentTimeMillis();
        long resultTwo = 0;
        for (long l : array) {
            resultTwo += l;
        }
        TimeUnit.SECONDS.sleep(1);
        long endTimeTwo = System.currentTimeMillis();

        System.out.println("Simple sum: " + resultTwo + " in " + (endTimeTwo - startTimeTwo) + " ms.");
    }

    private void fillRandom(long[] array) {
        Random random = new Random(47);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(400);
        }
    }
}

class SumTask extends RecursiveTask<Long> {

    private static final int THRESHOLD = 1000;
    private long[] array;
    private int start;
    private int end;

    SumTask(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            // 如果任务足够小,直接计算:
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
//            System.out.println(String.format("compute %d~%d = %d", start, end, sum));
            return sum;
        }
        // 任务太大,一分为二:
        int middle = (end + start) / 2;
//        System.out.println(String.format("split %d~%d ==> %d~%d, %d~%d", start, end, start, middle, middle, end));
        SumTask subtask1 = new SumTask(this.array, start, middle);
        SumTask subtask2 = new SumTask(this.array, middle, end);
        invokeAll(subtask1, subtask2);
        Long subresult1 = subtask1.join();
        Long subresult2 = subtask2.join();
        Long result = subresult1 + subresult2;
//        System.out.println("result = " + subresult1 + " + " + subresult2 + " ==> " + result);
        return result;
    }
}