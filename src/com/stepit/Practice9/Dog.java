package com.stepit.Practice9;

public class Dog {

    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Collar");
        this.isCollarPutOn = true;
    }
    public void putLeash() {
        System.out.println("Leash");
        this.isLeashPutOn = true;
    }
    public void putMuzzle() {
        System.out.println("Muzzle");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println(" On our way " + name + " very happy ");
        } else {
            throw new DogIsNotReadyException ("Dog " + name + "  is not yet ready ");
        }
    }
}
