package org.andy.items.thkinjava.annotations;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-26 19:37
 */
@SuppressWarnings("unused")
@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30)
    private String firstName;
    @SQLString(50)
    private String lastName;
    @SQLInteger
    private Integer age;
    @SQLString(value = 30,constraints = @Constraints(primaryKey = true))
    private String handle;
    private static int count;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }
}
