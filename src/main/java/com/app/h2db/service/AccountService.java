package com.app.h2db.service;

import com.app.h2db.entity.AccountIdMapping;
import com.app.h2db.entity.Account;
import com.app.h2db.model.AccountIdMappingModel;
import com.app.h2db.repository.AccountIdMappingRepository;
//import com.app.h2db.repository.AccountRepository;

import com.app.h2db.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {

      @Autowired
      AccountRepository accountRepository;

      @Autowired
      AccountIdMappingRepository mappingRepository;

    public Account getAccountIdMapping(){
        System.out.println(" getAccountIdMapping >>>>> ");
        String data="1111111111";
        String pwAccountId="99999";
        AccountIdMapping mapping= mappingRepository.findByLinkTokenId(data);
        System.out.println(" >>>mapping>"+mapping);
        System.out.println(">>>>>"+mapping.getPwAccountId());
        //Account aa=mapping.getPwAccountId();

        String linkTokenId="1111111111";

        AccountIdMapping map1=mappingRepository.findByPwAccountId(pwAccountId,linkTokenId);
        System.out.println(" >>>map1>"+map1.toString());
        Account account=map1.getPwAccountId();
        System.out.println("getLinkTokenId::"+account.getLinkTokenId());
        return null;
    }

    public List<Account> getAllAccounts(){
        System.out.println(" getAllAccounts >>>>> ");
        List<Account> account02s=accountRepository.findAll();
        System.out.println(" >>>>>"+account02s.size());
        for(Account account02:account02s){
            System.out.println(" Account >>>>:"+account02.toString());
            List<AccountIdMapping> accountIdMappingList=
            account02.getAccountIdMappingList();
            for(AccountIdMapping mapping:accountIdMappingList){
                System.out.println("------"+mapping.getLinkTokenId());
            }

            //accountIdMappingList.size();

        }
        return account02s;
    }


    public void saveAccount(AccountIdMappingModel accountMapping){
        System.out.println(" ## saveAccount >>>>>>>>>>>>>## ");
        AccountIdMapping mapping=new AccountIdMapping();
        mapping.setLinkTokenId(accountMapping.getLinkTokenId());

        mappingRepository.save(mapping);
    }


    public void getAccountDetails1(){
        System.out.println("hello2 >>>>>>");
    }

    public void getAccountHello(){
        System.out.println("hello1 >>>>>>");
    }
    public void getAccountDetails(){
        System.out.println("hello >>>>>>");
    }

}
