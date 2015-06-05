/**
 * Copyright (C) 2015 Rakuten, Inc.
 * All Rights Reserved. No use, copying or distribution of this work may be made
 * except in accordance with a valid license agreement from Rakuten. This notice
 * must be included on all copies, modifications and derivatives of this work.
 */

package com.keertimaan.experiments;

import java.io.Serializable;

/**
 * @author <a href="mailto:sayem.ahmed@rakuten.com">Sayem Ahmed</a>
 */
public class SimpleSerializable implements Serializable {
  String firstName;
  String lastName;

  // Case 1: What will be the default value of primitives after deserialization?
  boolean boolPrim;
  char charPrim;
  byte bytePrim;
  short shortPrim;
  int intPrim;
  long longPrim;
  float floatPrim;
  double doublePrim;

  // Case 2: What will be default value of a string after deserialization?
  String strPrim;

  // Case 3: Another random object reference
  Object randomRef;

  // Case 4: Default value for transient variable which was initialized?
  transient int intTransientWithInitialization = 10;

  // Case 5: Default value for final transient variable which was initialzied inline?
  transient final int intFinalTransient = 50;
}
