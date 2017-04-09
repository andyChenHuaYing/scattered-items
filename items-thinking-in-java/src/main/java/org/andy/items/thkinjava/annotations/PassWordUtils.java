package org.andy.items.thkinjava.annotations;

import java.util.List;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-06 20:52
 */
@SuppressWarnings("unused")
public class PassWordUtils {

    @UseCase(id = 47, description = "Check the password is number.")
    public boolean isNum(String password) {
        return password.matches("\\d*");
    }

    @UseCase(id = 48, description = "Encrypt password.")
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "check the password is old one")
    public boolean isOldOne(List<String> passwordList, String password) {
        return passwordList.contains(password);
    }
}
