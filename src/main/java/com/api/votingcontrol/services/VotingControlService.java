package com.api.votingcontrol.services;

import com.api.votingcontrol.enums.StatusVoto;
import com.api.votingcontrol.exceptions.UnauthorizedException;
import com.api.votingcontrol.models.Sessao;
import com.api.votingcontrol.models.Usuario;
import com.api.votingcontrol.repositories.VotingControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VotingControlService {
    @Autowired
    private VotingControlRepository votingControlRepository;

    public Usuario create(Usuario usuario) {

        usuario.getPauta().setStatusVoto(StatusVoto.NAO_ENVIADO);
        usuario.getSessao().setTempoSessao(LocalDateTime.now());
        return this.votingControlRepository.save(usuario);
    }

    public Optional<Usuario> getById(String id) {

        return this.votingControlRepository.findById(id);
    }

    public List<Usuario> getAll() {

        return this.votingControlRepository.findAll();
    }

    public Usuario update(String id, Usuario usuario) throws UnauthorizedException {
        Usuario current = findById(id);
        if (current.getPauta().getStatusVoto().getCode().equals("1")
                || current.getPauta().getStatusVoto().getCode().equals("2")) {
            throw new UnauthorizedException();
        }

        current.setNome(usuario.getNome());
        current.setPauta(usuario.getPauta());
        current.setSessao(usuario.getSessao());


        return votingControlRepository.save(current);
    }

    public Usuario findById(String id) {
        Optional<Usuario> user = votingControlRepository.findById(id);
        return user.orElseThrow();
    }

    public void delete(String id) {
        findById(id);
        votingControlRepository.deleteById(id);
    }
}
