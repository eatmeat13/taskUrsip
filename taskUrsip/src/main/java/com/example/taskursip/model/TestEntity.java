package com.example.taskursip.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(schema = "ursip", name = "test")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "document_id")
    private String documentId;
    @Column(name = "document_name")
    private String documentName;
    @Column(name = "document_date")
    private Date documentDate;
    @Column(name = "dictionary_value_id")
    private String dictionaryValueId;
    @Column(name = "dicrionary_name_id")
    private String dictionaryNameId;
    @Column(name = "order")
    private String order;
}
