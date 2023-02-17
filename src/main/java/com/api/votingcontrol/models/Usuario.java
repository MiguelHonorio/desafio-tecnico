package com.api.votingcontrol.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Collection;

@Data
@Document
public class Usuario {
    @Id
    private String id;
    private String nome;
    private Pauta pauta;
    private Sessao sessao;

}
