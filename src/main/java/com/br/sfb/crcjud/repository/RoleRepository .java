package com.br.sfb.crcjud.repository;

/**
 * RoleRepository 
 */
public interface RoleRepository   extends MongoRepository<Role, String> {
    Role findByRole(String role);
}