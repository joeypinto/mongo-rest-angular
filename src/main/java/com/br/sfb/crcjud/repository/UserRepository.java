package com.br.sfb.crcjud.repository;

/**
 * UserRepository
 */
public interface UserRepository  extends MongoRepository<User, String> {
    User findByEmail(String email);
}