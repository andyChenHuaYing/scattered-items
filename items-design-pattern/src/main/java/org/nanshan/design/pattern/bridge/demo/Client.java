package org.nanshan.design.pattern.bridge.demo;

import org.nanshan.design.pattern.bridge.demo.corp.Corp;
import org.nanshan.design.pattern.bridge.demo.corp.HouseCorp;
import org.nanshan.design.pattern.bridge.demo.corp.IPadCorp;
import org.nanshan.design.pattern.bridge.demo.product.HouseProduct;
import org.nanshan.design.pattern.bridge.demo.product.IPadProduct;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class Client {

    public static void main(String[] args) {
        Corp houseCorp = new HouseCorp(new HouseProduct());
        houseCorp.makeMoney();

        Corp iPadProduct = new IPadCorp(new IPadProduct());
        iPadProduct.makeMoney();
    }
}
