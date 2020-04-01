package com.jason.provider.repository;

import com.jason.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jason
 * @date 2020/3/31 14:44
 * @description
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
