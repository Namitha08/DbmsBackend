package edu.ufl.dbms.types;

/***
 *
 */
public class Digest {
    private String actualString;
    private String digest;

    public Digest(String actualString, String digest) {
        this.actualString = actualString;
        this.digest = digest;
    }

    public Digest() {

    }

    public String getActualString() {

        return actualString;
    }

    public void setActualString(String actualString) {
        this.actualString = actualString;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Override
    public String toString() {
        return "Digest{" +
                "actualString='" + actualString + '\'' +
                ", digest='" + digest + '\'' +
                '}';
    }
}
