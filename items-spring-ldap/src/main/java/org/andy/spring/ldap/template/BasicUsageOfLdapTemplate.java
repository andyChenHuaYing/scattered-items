package org.andy.spring.ldap.template;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.AuthenticationSource;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import java.util.List;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/26.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class BasicUsageOfLdapTemplate {
    private static final LdapTemplate ldapTemplate;

    static {
        LdapContextSource cs = new LdapContextSource();
        cs.setCacheEnvironmentProperties(false);
        cs.setUrl("ldap://10.45.35.69:389");
        cs.setBase("ou=People,dc=ztesoft,dc=com");
        cs.setAuthenticationSource(new AuthenticationSource() {
            @Override
            public String getPrincipal() {
                return "cn=Manager,dc=ztesoft,dc=com";
            }

            @Override
            public String getCredentials() {
                return "ztesoft";
            }
        });
        ldapTemplate = new LdapTemplate(cs);
    }

    public static void main(String[] args) {
        BasicUsageOfLdapTemplate basicUsageOfLdapTemplate = new BasicUsageOfLdapTemplate();
        basicUsageOfLdapTemplate.getAllRecodes();
    }

    public List getAllRecodes() {
        String filter = "(objectclass=*)";
        return ldapTemplate.search("uid=admin", filter, new AttributesMapper() {

            @Override
            public Object mapFromAttributes(Attributes attributes) throws NamingException {
                System.out.println(attributes);
                return attributes.get("uid").get();
            }
        });
    }
}
