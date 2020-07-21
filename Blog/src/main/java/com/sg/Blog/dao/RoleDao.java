/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Blog.dao;

import com.sg.Blog.entity.Role;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mohamed
 */
@Repository
public interface RoleDao extends JpaRepository<Role, Integer>{
    Set<Role> findAllByRole(String role);
    Role findByRole(String role);
}
