package com.sucursal.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sucursal.crud.entities.Sucursal;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long>{

}
