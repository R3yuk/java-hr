package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter //helps in annotation
@Setter
@Entity  // annotation garya
@Table(name= "Staffs")  //db ma table banxa
public class Staff {
@Id
    @Column( name ="id") //db ma column banxa
    private long id;
    @Column(name="first_name")
    private String firstname;

    @Column(name="Last_name")
    private String lastname;


}
