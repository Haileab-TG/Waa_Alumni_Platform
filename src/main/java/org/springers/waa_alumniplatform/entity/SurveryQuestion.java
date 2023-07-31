package org.springers.waa_alumniplatform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class SurveryQuestion {
    @Id @GeneratedValue
    private int id;
    private String question;
    @OneToMany
    private List<SurveryAnswer> surveryAnswerList;
}