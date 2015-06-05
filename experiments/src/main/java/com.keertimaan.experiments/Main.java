/**
 * Copyright (C) 2015 Rakuten, Inc.
 * All Rights Reserved. No use, copying or distribution of this work may be made
 * except in accordance with a valid license agreement from Rakuten. This notice
 * must be included on all copies, modifications and derivatives of this work.
 */

package com.keertimaan.experiments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author <a href="mailto:sayem.ahmed@rakuten.com">Sayem Ahmed</a>
 */
public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    SimpleSerializable in = new SimpleSerializable();
    in.firstName = "Hoge";
    in.lastName = "Fuga";
    String targetFileName = "simple_serializable.ser";
    ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(targetFileName));
    outStream.writeObject(in);

    ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(targetFileName));
    SimpleSerializable out = (SimpleSerializable) inStream.readObject();

    // Case 1: Default value for primitives
    System.out.println("Default value for boolean: " + out.boolPrim);
    System.out.println("Default value for character: " + (int) out.charPrim);
    System.out.println("Default value for byte: " + out.bytePrim);
    System.out.println("Default value for short: " + out.shortPrim);
    System.out.println("Default value for int: " + out.intPrim);
    System.out.println("Default value for long: " + out.longPrim);
    System.out.println("Default value for float: " + out.floatPrim);
    System.out.println("Default value for doubles: " + out.doublePrim);

    // Case 2: Default value for String
    System.out.println("Default value for string: " + out.strPrim);

    // Case 3: Default value for other object reference
    System.out.println("Default value for object in general: " + out.randomRef);

    // Case 4: Default value for transient variable which was initialized?
    System.out
        .println("Default value for transient variable which was initialized: " + out.intTransientWithInitialization);

    // Case 5: Default value for final transient variable which was initialzied inline?
    System.out
        .println("Default value for final transient variable which was initialzied directly: " + out.intFinalTransient);
  }
}
