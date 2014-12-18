package org.springframework.samples.aop.annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.samples.exceptions.ProceedFailException;
import org.springframework.stereotype.Component;

/**
 * Happy day, happy life.
 * Demonstrate the usage of the pointcut expressions, just switch them which are located
 * on every advice method to observe the result is correctly or not.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:05
 */
@SuppressWarnings("unused")
@Component
@Aspect
public class TransactionAdvisor{

/*-----------------------------------------------------Execution------------------------------------------------------*/
    /**
     * The format of an execution expression is :
     * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern)
     * throws-pattern?)
     * All parts except returning type pattern(ret-type-pattern), name-pattern and param-pattern are optional.
     * * for all return type
     * * for all methods name
     * param-pattern:
     * () for no parameters
     * (*) for only one and any type parameters
     * (..) for any number andy type of parameters
     * (*,String) for two parameters, the first one for any type and the second only could be String
     * More detail:
     * http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#aop-pointcuts
     */

    /**
     * It will not match any JoinPoint at all, in Spring AOP, any given pointcut will be matched against public
     * method only. The meaning of default, private, protected modifiers-pattern is just
     */
    @Pointcut("execution(private * *(..))")
    private void privateModifiersPattern() {}

    /**
     * The same as above mentioned.
      */
    @Pointcut("execution(protected * *(..))")
    private void protectedModifiersPattern(){}

    /**
     * The execution of any public method:
     */
    @Pointcut("execution(public * *(..))")
    private void publicMethodPointcut(){}

    /**
     * The execution of any method in xxx.service package,exclude service's sub package.
     */
    @Pointcut("execution(* org.springframework.samples.aop.annotation.service.*.*(..))")
    private void servicePointcut(){}

    /**
     * The execution of any method in xxx.service package or service's sub package.
     */
    @Pointcut("execution(* org.springframework.samples.aop.annotation.action..*.*(..))")
    private void actionPointcut(){}

/*-----------------------------------------------------within and @within---------------------------------------------*/

    /**
     * The execution of any method in xxx.service package,exclude service's sub package.
     */
    @Pointcut("within(org.springframework.samples.aop.annotation.service.*)")
    private void servicePackagePointcutWithin(){}

    /**
     * The execution of any method in xxx.service package or service's sub package.
     */
    @Pointcut("within(org.springframework.samples.aop.annotation.service..*)")
    private void servicePackageAndSubPackagePointcutWithin(){}

    /**
     * Andy join point(method execution only in Spring AOP) where the declared type of
     * the target object has an @CustomTransaction annotation.
     */
    @Pointcut("@within(org.springframework.samples.aop.annotation.annotation.CustomTransaction)")
    private void customTransactionAnnotationPointcut(){}

/*-----------------------------------------------------target and @target---------------------------------------------*/

    /**
     * Andy join point(method execution only in Spring AOP)where the target object implements the SuperActionService
     * interface.Do not support wildcard.
     */
    @Pointcut("target(org.springframework.samples.aop.annotation.service.SuperActionService)")
    private void targetObjectImlSuperActionServicePointcut(){}

    /**
     * Any join point (method execution only in Spring AOP) where the target object has an @Transactional annotation,
     * just like @within expression. Do not support wildcard.
     */
    @Pointcut("@target(org.springframework.samples.aop.annotation.annotation.CustomTransaction)")
    private void targetObjectAnnotatedCustomTransactionAnnotationPointcut(){}

/*-----------------------------------------------------this-----------------------------------------------------------*/

    /**
     * Any join point(method execution only in Spring AOP)where the proxy implements the SuperActionService interface.
     * The expression must be the detail of Interface's package.name. Do not support wildcard.
     */
    @Pointcut("this(org.springframework.samples.aop.annotation.service.SuperActionService)")
    private void targetObjectImlSuperActionService(){}

/*-----------------------------------------------------args and @args-------------------------------------------------*/

    /**
     * Any join point (method execution only in Spring AOP) which takes two parameters,
     * and where the first argument passed at runtime is org.springframework.samples.aop.dto.User
     * the second is java.lang.String.
     * args(org.springframework.samples.aop.dto.User,..) -- the first parameter not change, but .. means the release
     * parameter(s) could be any number and any type.
     */
    @Pointcut("args(org.springframework.samples.aop.dto.User, java.lang.String)")
    private void specifiedArgsPointcut(){}

    /**
     * Any join point (method execution only in Spring AOP) which takes a single parameter, and where the runtime type
     * of the argument passed has the @Classified annotation
     */
    @Pointcut("@args(org.springframework.samples.aop.annotation.annotation.CustomDeprecatedAnnotation)")
    private void methodParameterAnnotatedCustomDeprecated(){}

/*-----------------------------------------------------@annotation----------------------------------------------------*/

    /**
     * Any join point (method execution only in Spring AOP) where the executing method has an
     * CustomDeprecatedAnnotation annotation:
     */
    @Pointcut("@annotation(org.springframework.samples.aop.annotation.annotation.CustomDeprecatedAnnotation) " +
            "&& args(user, desc)")
    private void methodAnnotatedByCustomDeprecatedAnnotation(org.springframework.samples.aop.dto.User user,
                                                             java.lang.String desc){}

/*-----------------------------------------------------bean-----------------------------------------------------------*/

    /**
     * Any join point (method execution only in Spring AOP) on Spring beans having names that match the
     * wildcard expression *Action.
     */
    @Pointcut("bean(*Action)")
    private void beanNameEndWithAction(){}


/*-----------------------------------------------------pointcut usage demonstrate-------------------------------------*/

//    @AfterReturning("servicePackagePointcutWithin()")
//    @AfterReturning("servicePackageAndSubPackagePointcutWithin()")
//    @After("customTransactionAnnotationPointcut()")
//    @After("targetObjectImlSuperActionServicePointcut()")
//    @After("targetObjectAnnotatedCustomTransactionAnnotationPointcut()")
//    @After("targetObjectImlSuperActionService()")
//    @After("methodParameterAnnotatedCustomDeprecated()")
//    @After("methodAnnotatedByCustomDeprecatedAnnotation()")
//    @After("beanNameEndWithAction()")
    public void afterReturning() {
        System.out.println("after returning...");
    }

//    @Before("execution(* org.springframework.samples.aop.annotation.action.*.*(..))")
//    @Before("publicMethodPointcut() && actionPointcut()")
//    @Before("publicMethodPointcut()")
    public void before() {
        System.out.println("before...");
    }

//    @After("execution(public * *(..))")
//    @After("execution(public * *())")
//    @After("execution(public * *(org.springframework.samples.aop.dto.User, String))")
//    @After("execution(public * *(*))")
//    @After("execution(* *(..))")
//    @After("execution(* )")
//    @After("execution(* org.springframework.samples.aop.annotation.service.*.*(..))")
//    @After("within(org.springframework.samples.aop.annotation.action.*)")
//    @After("within(org.springframework.samples.aop..*)")
//    @After("this(org.springframework.samples.aop.annotation.service.SuperActionService))")
//    @After("target(org.springframework.samples.aop.annotation.service.SuperActionService))")
    public void after() {
        System.out.println("after");
    }



/*-----------------------------------------------------advice definition----------------------------------------------*/

    /**
     * Demonstrate after throwing advice usage and obtain the join point's Exception
     * @param ex
     *        the Exception produced by join point.
     */
    @AfterThrowing(pointcut = "beanNameEndWithAction()", throwing = "ex")
    public void afterThrowing(ProceedFailException ex) {
        System.out.println("after throwing and the Exception stack info : ");
        ex.printStackTrace();
    }

    /**
     * Demonstrate around advice usage and obtain the join point's parameters.
     * <B>Note:</B>
     *         This method should have return value instead of void . If it's not then some method like
     *         after returning advice will failed when it try to get the join point's return value.
     * @param proceedingJoinPoint
     *        Implements of JoinPoint interface, ProceedingJoinPoint. the method of ProceedingJoinPoint proceed will
     *        be invoked automatically and return an Object instance.
     * @param user
     *        Join point's parameter, it will be full filled automatically.
     * @param desc
     *        Join point's parameter, it will be full filled automatically.
     * @throws Throwable
     *        Join point's Exception.
     */
    //@Around("methodAnnotatedByCustomDeprecatedAnnotation(user, desc)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint,
                       org.springframework.samples.aop.dto.User user, java.lang.String desc) throws Throwable {
        Object object;
        System.out.println("Parameter -- user : " + user + ", desc : " + desc);
        System.out.println("before proxy method....");
        object = proceedingJoinPoint.proceed();
        System.out.println("after proxy method...");
        return object;
    }




    @AfterReturning(pointcut = "beanNameEndWithAction()", returning = "user")
    public void afterReturningWithReturnValue(org.springframework.samples.aop.dto.User user) {
        System.out.println("after returning and the return value : " + user);
    }
}



































