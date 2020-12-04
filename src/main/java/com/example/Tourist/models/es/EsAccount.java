package com.example.Tourist.models.es;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
// pour indexation
@Document(indexName = "account")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class EsAccount {
    @Id
    private Long id;

}
