package com.marvic.alchemists_arsenal;

import com.marvic.alchemists_arsenal.model.pacient.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacientRepository extends JpaRepository<Pacient, Long>{}