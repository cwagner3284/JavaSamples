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

package com.keertimaan.javasamples.jpaexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Sayem Ahmed
 */
@Entity
public class Address {
  @Id
  @GeneratedValue
  private Integer id;
  
  private String street;
  private String city;
  private String province;
  private String country;
  private String postcode;

  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public Address setId(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * @return the street
   */
  public String getStreet() {
    return street;
  }

  /**
   * @param street the street to set
   */
  public Address setStreet(String street) {
    this.street = street;
    return this;
  }

  /**
   * @return the city
   */
  public String getCity() {
    return city;
  }

  /**
   * @param city the city to set
   */
  public Address setCity(String city) {
    this.city = city;
    return this;
  }

  /**
   * @return the province
   */
  public String getProvince() {
    return province;
  }

  /**
   * @param province the province to set
   */
  public Address setProvince(String province) {
    this.province = province;
    return this;
  }

  /**
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * @param country the country to set
   */
  public Address setCountry(String country) {
    this.country = country;
    return this;
  }

  /**
   * @return the postcode
   */
  public String getPostcode() {
    return postcode;
  }

  /**
   * @param postcode the postcode to set
   */
  public Address setPostcode(String postcode) {
    this.postcode = postcode;
    return this;
  }
}
