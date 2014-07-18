package com.moke.springmvctest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
 @Id @GeneratedValue Integer id;
}
