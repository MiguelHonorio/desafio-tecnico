package com.api.votingcontrol.exceptions;

public class UnauthorizedException extends Exception {
    public String getMessage() {
        return "Esta sessão já recebeu um voto";
    }
}