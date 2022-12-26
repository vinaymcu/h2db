package com.app.h2db.repository;


import com.app.h2db.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

     //public Account02  findByPwAccountId(String pwAccountId);
}
