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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;

/**
 * @author <a href="mailto:sayem64@gmail.com">Sayem Ahmed</a>
 */
@Entity
@Table(name = "project")
public class Project {
  @Id
  @SequenceGenerator(name = "project_id_seq", sequenceName = "project_id_seq", 
      allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_id_seq")
  private Long id;
  
  @Enumerated(EnumType.ORDINAL)
  private ProjectType type;
  
  private String name;
  private String description;
  private BigDecimal budget;
  
  @ManyToOne
  @JoinColumn(name = "leader_id")
  private Employee leader;
  
  @ManyToMany
  @JoinTable(name = "project_employee", joinColumns = @JoinColumn(name = "project_id"), 
      inverseJoinColumns = @JoinColumn(name = "employee_id"))
  private Collection<Employee> employees;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProjectType getType() {
    return type;
  }

  public void setType(ProjectType type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  public Employee getLeader() {
    return leader;
  }

  public void setLeader(Employee leader) {
    this.leader = leader;
  }

  public Collection<Employee> getEmployees() {
    return Collections.unmodifiableCollection(employees);
  }
  
  public void addEmployee(Employee employee) {
    
  }

  public void setEmployees(Collection<? extends Employee> employees) {
    this.employees.addAll(employees);
  }
}
