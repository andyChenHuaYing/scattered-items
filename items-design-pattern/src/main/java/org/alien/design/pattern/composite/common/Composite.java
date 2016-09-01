package org.alien.design.pattern.composite.common;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/1
 */
public class Composite extends Component {
    private ArrayList<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public void removeComponent(Component component) {
        this.components.remove(component);
    }

    public ArrayList<Component> getComponents() {
        return components;
    }
}
