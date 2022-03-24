package com.boottech.springreactivemongodb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

// eg: sport, IT, media
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Category {

    @Id
    private String id;

    @NotNull
    private String name;
}
