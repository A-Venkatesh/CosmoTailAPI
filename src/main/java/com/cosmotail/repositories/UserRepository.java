/**
 * 
 */
package com.cosmotail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosmotail.entities.User;

/**
 * @author Anbu
 *
 */
public interface UserRepository extends JpaRepository<User, String> {

	User findByEmail(String email);

}
