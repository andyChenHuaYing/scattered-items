package org.springframework.samples.model;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/23.
 * Version 1.0-SNAPSHOT
 */
@SuppressWarnings("unused")
public class PlainModelSix extends AbstractPlainModel {
    private boolean protoBoolean;
    private char protoChar;
    private short protoShort;
    private int protonInt;
    private long protoLong;
    private float protoFloat;
    private double protoDouble;
    private String string;
    private AbstractPlainModel abstractPlainModel;

    public PlainModelSix() {
    }

    public PlainModelSix(AbstractPlainModel abstractPlainModel) {

        this.abstractPlainModel = abstractPlainModel;
    }

    public boolean isProtoBoolean() {
        return protoBoolean;
    }

    public void setProtoBoolean(boolean protoBoolean) {
        this.protoBoolean = protoBoolean;
    }

    public char getProtoChar() {
        return protoChar;
    }

    public void setProtoChar(char protoChar) {
        this.protoChar = protoChar;
    }

    public short getProtoShort() {
        return protoShort;
    }

    public void setProtoShort(short protoShort) {
        this.protoShort = protoShort;
    }

    public int getProtonInt() {
        return protonInt;
    }

    public void setProtonInt(int protonInt) {
        this.protonInt = protonInt;
    }

    public long getProtoLong() {
        return protoLong;
    }

    public void setProtoLong(long protoLong) {
        this.protoLong = protoLong;
    }

    public float getProtoFloat() {
        return protoFloat;
    }

    public void setProtoFloat(float protoFloat) {
        this.protoFloat = protoFloat;
    }

    public double getProtoDouble() {
        return protoDouble;
    }

    public void setProtoDouble(double protoDouble) {
        this.protoDouble = protoDouble;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setAbstractPlainModel(AbstractPlainModel abstractPlainModel) {
        this.abstractPlainModel = abstractPlainModel;
    }

    @Override
    public String toString() {
        return "PlainModelSix{" +
                "protoBoolean=" + protoBoolean +
                ", protoChar=" + protoChar +
                ", protoShort=" + protoShort +
                ", protonInt=" + protonInt +
                ", protoLong=" + protoLong +
                ", protoFloat=" + protoFloat +
                ", protoDouble=" + protoDouble +
                ", string='" + string + '\'' +
                ", abstractPlainModel=" + abstractPlainModel +
                ": " + abstractPlainModel.hashCode() +
                '}';
    }
}
