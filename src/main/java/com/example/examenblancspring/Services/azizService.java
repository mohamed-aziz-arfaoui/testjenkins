package com.example.examenblancspring.Services;

import com.example.examenblancspring.Entities.aziz;
import com.example.examenblancspring.Repository.azizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class azizService implements Iazizimpl {
    @Autowired
    azizRepository ar;

    @Override
    public aziz ajouterperso(aziz a) {
        return ar.save(a);

    }
}
