package org.andy.springmvc.model;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-21 21:20
 */
@SuppressWarnings("unused")
public class SchoolModel {
    private String schoolName;

    public SchoolModel(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "SchoolModel{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}
