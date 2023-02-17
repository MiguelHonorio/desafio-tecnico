package com.api.votingcontrol.models;

import com.api.votingcontrol.enums.StatusVoto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document
public class Pauta {
    private String codigo;
    private String descricao;
    private StatusVoto statusVoto;

    public Pauta(String codigo, String descricao, StatusVoto statusVoto){
        this.codigo = codigo;
        this.descricao = descricao;
        this.statusVoto = statusVoto;
    }

}
