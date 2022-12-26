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



//
//
//    public Account02 hello(){
//
//          Account02 account021=new Account02();
//          account021.setCurrency("doller");
//          account021.setPwAccountId("12333");
//
//          return account021;
//      }
//
//
//
//    public Account02  getAccountByPWaccuntID(String pwaccountid){
//        System.out.println(">getAccountByPWaccuntID  pwaccountid>>>>"+pwaccountid);
//        Account02 account02=  accountRepository.findByPwAccountId(pwaccountid);
//        System.out.println(">getAccountByPWaccuntID>>>>"+account02);
//        System.out.println(">getAccountByPWaccuntID>>>>>>>>>>>"+account02.getAccountHistory02List());
//        System.out.println(" ###3 getIdentity02List>>>>"+account02.getIdentity02List());
//        System.out.println(">>>getPwAccountId>>>> "+account02.getIdentity02List().get(0).getPwAccountId().getPwAccountId());
//        return account02;
//    }
//      public Optional<Account02> getAccount(int num){
//          Optional<Account02> account02=  accountRepository.findById(num);
//          System.out.println(">>>>>"+account02);
//          System.out.println(">>>>>>>>>>>>"+account02.get().getAccountHistory02List());
//          return account02;
//      }
//
//
//
//    public void saveAccount(String pwAccountId){
//        Account02 acc=new Account02();
//        acc.setAccountNumber("TestACC");
//        acc.setAccountStatus("stst");
//        acc.setBankName("SBI");
//        acc.setLinkTokenId("LinkToken");
//        acc.setCurrency("RS");
//        long now = System.currentTimeMillis();
//        Timestamp sqlTimestamp = new Timestamp(now);
//
//         acc.setPwAccountId(pwAccountId);
//         acc.setCreatedAt(sqlTimestamp);
//
//        AccountHistory02 accountHistory02=new AccountHistory02();
//        accountHistory02.setAccountNumber("eeee");
//        accountHistory02.setBankName("test");
//        accountHistory02.setCurrency("Doller");
//        accountHistory02.setPwAccountId(acc);
//        accountHistory02.setCreatedAt(sqlTimestamp);
//        System.out.println(" >>>>>"+accountHistory02.getPwAccountId());
//
//        List<AccountHistory02> accountHistory02List=new ArrayList<>();
//        accountHistory02List.add(accountHistory02);
//        acc.setAccountHistory02List(accountHistory02List);
//
//        Identity02 identity02=new Identity02();
//        identity02.setEmails("vinaymcu@gmail.com");
//        identity02.setFullName("VinayGupta111");
//        identity02.setLinkTokenId("SBI111");
//        identity02.setEndUserId("insureID1111");
//        identity02.setPwAccountId(acc); //forein key
//
//        List<Identity02> Identity02List=new ArrayList<>();
//        Identity02List.add(identity02);
//        acc.setIdentity02List(Identity02List);
//
//        Account02 aaa=  accountRepository.save(acc);
//        System.out.println("AFERT PERSIST REPOSITORY>>>>>>>>>"+aaa);
//    }

    public void getAccountDetails(){
        System.out.println("hello >>>>>>");
    }

}
