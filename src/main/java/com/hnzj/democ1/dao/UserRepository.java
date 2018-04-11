package com.hnzj.democ1.dao;

import com.hnzj.democ1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by 周杰 on 2018/4/5.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     *
     * @param name
     * @return
     */
    User findByName(String name);

    User findByNameAndAge(String name,Integer age);

    @Query("select u from User u where u.name=:name")
    User findUser(@Param("name") String name);
}
