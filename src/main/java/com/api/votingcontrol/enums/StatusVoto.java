package com.api.votingcontrol.enums;

import lombok.Getter;

@Getter
public enum StatusVoto {

    NAO_ENVIADO("0", "Não enviado"),
    SIM("1", "Sim"),
    NAO("2", "Não");

    private String code;
    private String descricao;

    StatusVoto(String code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }
}
