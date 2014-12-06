/**
 * Copyright 2014 Sayem Ahmed
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.keertimaan.javasamples.jpaexample;

import com.keertimaan.javasamples.jpaexample.entity.Address;

import javax.persistence.EntityManager;

import com.keertimaan.javasamples.jpaexample.persistenceutil.PersistenceManager;

/**
 * @author Sayem Ahmed
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Address address = new Address();
    address.setCity("Dhaka")
        .setCountry("Bangladesh")
        .setPostcode("1000")
        .setStreet("Poribagh");

    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
    em.getTransaction()
        .begin();
    em.persist(address);
    em.getTransaction()
        .commit();

    Address anotherAddress = new Address().setCity("Shinagawa-ku, Tokyo")
        .setCountry("Japan")
        .setPostcode("140-0002")
        .setStreet("Shinagawa Seaside Area");
    
    em.getTransaction()
        .begin();
    Address findAddress = em.find(Address.class, address.getId());
    System.out.println("Post code is: " + findAddress.getPostcode());
    
    em.persist(anotherAddress);
    em.getTransaction()
        .commit();

    em.close();
    PersistenceManager.INSTANCE.close();
  }
}
