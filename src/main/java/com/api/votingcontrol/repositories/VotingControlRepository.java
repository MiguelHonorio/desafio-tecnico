package com.api.votingcontrol.repositories;

import com.api.votingcontrol.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VotingControlRepository extends MongoRepository<Usuario, String>{

}
