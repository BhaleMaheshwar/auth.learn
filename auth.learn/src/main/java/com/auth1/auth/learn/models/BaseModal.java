package com.auth1.auth.learn.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@MappedSuperclass
@Getter
@Setter
public class BaseModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
