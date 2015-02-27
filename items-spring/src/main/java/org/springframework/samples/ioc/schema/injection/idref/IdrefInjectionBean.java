package org.springframework.samples.ioc.schema.injection.idref;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/26.
 * Version 1.0-SNAPSHOT
 */
public class IdrefInjectionBean {
    private String id;
    @SuppressWarnings("all")
    private String idref;

    public void setId(String id) {
        this.id = id;
    }

    public void setIdref(String idref) {
        this.id = idref;
    }

    @Override
    public String toString() {
        return "IdrefInjectionBean{" +
                "id='" + id + '\'' +
                ", idref='" + idref + '\'' +
                '}';
    }
}
