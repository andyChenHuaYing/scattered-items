package org.alien.design.pattern.composite.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/1
 */
public abstract class Corp {
    private String name;
    private String position;
    private String salary;
    private Corp parent;

    public Corp(String name, String position, String salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return "Corp{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Corp getParent() {
        return this.parent;
    }

    protected void setParent(Corp corp) {
        this.parent = corp;
    }
}
