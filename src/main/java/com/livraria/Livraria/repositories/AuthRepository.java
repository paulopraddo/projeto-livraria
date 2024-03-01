package com.livraria.Livraria.repositories;

import com.livraria.Livraria.entity.LoginUserDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<LoginUserDetailsModel, String> {
}
