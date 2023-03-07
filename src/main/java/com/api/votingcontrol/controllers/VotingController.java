package com.api.votingcontrol.controllers;

import com.api.votingcontrol.exceptions.UnauthorizedException;
import com.api.votingcontrol.models.Usuario;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.api.votingcontrol.services.VotingControlService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/voting")
public class VotingController {

    @Autowired
    private VotingControlService votingControlService;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {

        return this.votingControlService.create(usuario);
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getById(@PathVariable String id) {
        return this.votingControlService.getById(id);
    }

    @GetMapping
    public List<Usuario> getAll() {
        return this.votingControlService.getAll();
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable String id, @RequestBody Usuario usuario) throws UnauthorizedException {
        return votingControlService.update(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        votingControlService.delete(id);
    }
}
