package org.andy.items.thkinjava.annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 * Created date: 2014-11-06 21:02
 */
public class UseCaseTracker {

    public static void trackUseCase(List<Integer> useCases, Class<?> c) {
        for (Method method : c.getDeclaredMethods()) {
            UseCase useCase = method.getAnnotation(UseCase.class);
            if (useCase != null) {
                System.out.println("UseCase id : " + useCase.id() + " " + "UseCase desciption : " + useCase.description());
                useCases.remove(new Integer(useCase.id()));
            }
        }

        for (int id : useCases) {
            System.out.println("Unable to find UseCase with id : " + id);
        }
    }

    public static void main(String[] args) {
        List<Integer> usecaseList = new ArrayList<Integer>();
        Collections.addAll(usecaseList, 47, 48, 49, 50);
        trackUseCase(usecaseList, PassWordUtils.class);
    }
}
