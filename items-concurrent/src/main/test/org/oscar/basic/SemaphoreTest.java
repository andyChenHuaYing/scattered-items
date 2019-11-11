package org.oscar.basic;

import org.junit.Test;

import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

/**
 * @author huaying
 * @version 0.0.1
 * @date 2019-05-15
 */
public class SemaphoreTest {

    @Test
    public void name() {
        ObjectPool<String, Integer> pool = new ObjectPool<>(2);
        for (int i = 0; i < 10; i++) {
            pool.add(i + "");
        }

        while (true) {
            Integer exec = pool.exec(Integer::parseInt);
            if (exec == null) {
                break;
            }
            System.out.println(exec);
        }
    }
}

class ObjectPool<T, R> {

    private List<T> elements = new Vector<>();
    private Semaphore semaphore;

    public ObjectPool(int size) {
        this.semaphore = new Semaphore(size);
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public R exec(Function<T, R> call){
        try {
            System.out.println(System.currentTimeMillis() + "-> before");
            semaphore.acquire();
            System.out.println(System.currentTimeMillis() + "-> after");
            T remove = elements.remove(0);
            if (Objects.nonNull(remove)) {
                return call.apply(remove);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return null;
    }
}
