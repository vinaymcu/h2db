package com.app.h2db.repository;


import com.app.h2db.entity.AccountIdMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountIdMappingRepository extends JpaRepository<AccountIdMapping, Integer> {

    AccountIdMapping findByLinkTokenId(String linkTokenId);

//    @Query(value = "SELECT * FROM account_id_mapping t WHERE t.pw_account_id=?1", nativeQuery = true)
//    AccountIdMapping findByPwAccountId( String pwAccountId );

    @Query(value = "SELECT * FROM account_id_mapping t WHERE t.pw_account_id=?1 and t.link_token_id=?2", nativeQuery = true)
    AccountIdMapping findByPwAccountId( String pwAccountId,String linkTokenId );
}
