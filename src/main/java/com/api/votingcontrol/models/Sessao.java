package com.api.votingcontrol.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Document
public class Sessao {
    private LocalDateTime tempoSessao;
}
