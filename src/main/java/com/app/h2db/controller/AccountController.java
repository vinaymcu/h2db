package com.app.h2db.controller;

import com.app.h2db.model.Account;
import com.app.h2db.model.AccountIdMappingModel;
import com.app.h2db.model.AppResponse;
import com.app.h2db.model.User;
import com.app.h2db.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("account/all")
    public ResponseEntity<Account>  hello(){
        System.out.println(" aaa >>>>>>>>>>>>>>>>>");
        //String url = "http://localhost:8888/v1/accounts?account_id={account_id}/direct_deposit_allocations";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity request = new HttpEntity(headers);

        String account_id="1234567";


//        Map<String, String> params = new HashMap<>();
//        params.put("account_id", account_id);
        Account1 account1=new Account1(account_id);
        account1.setAccount_id(account_id);

        HttpEntity<Account1> request1 =
                new HttpEntity<>(
                        new Account1(account_id));

        String url = "http://localhost:8888/v1/accounts/{account_id}/direct_deposit_allocations";
        ResponseEntity<String> response1 = restTemplate.exchange(
                url, HttpMethod.GET, request1,    String.class );

        System.out.println(" RRRRRRRRR:"+response1);
        System.out.println("bbbbbbb:"+response1.getBody());


                accountService.getAllAccounts();
                Account account=new Account();

        account.setPwAccountId("12345");
        account.setAccountType("SAving");
        account.setLinkTokenId("testLinked");
        ResponseEntity<Account> response=new ResponseEntity<Account>(account,HttpStatus.OK);
        return response;

    }




    //https://api.getpinwheel.com/v1/accounts/{account_id}/direct_deposit_allocations

    @GetMapping("account/accmap")
    public ResponseEntity<Account>  getAccountIdMapping(){

        accountService.getAccountIdMapping();

        Account account=new Account();
        account.setPwAccountId("12345");
        account.setAccountType("SAving");
        account.setLinkTokenId("testLinked");
        ResponseEntity<Account> response=new ResponseEntity<Account>(account,HttpStatus.OK);
        return response;
    }

    @GetMapping("account/detail")
    public ResponseEntity<User>  getAccountDetails(){
        User user=new User();

        ResponseEntity<User> response=new ResponseEntity<User>(user,HttpStatus.OK);
        return response;
    }

    @PostMapping("account/save")
    @ResponseBody
    public ResponseEntity<AppResponse> saveAccount(@RequestBody AccountIdMappingModel accountMapping) {
        System.out.println("saveAccount Title >>>>>>>>>>>>>>>>" );

       accountService.saveAccount(accountMapping);

    // System.out.println("After Successfully save id is " + art.getArticleId());

        AppResponse appResponse = new AppResponse();
        appResponse.setStatusCode("200");
        //appResponse.setStatusCode(HttpStatus.OK.name());
        //appResponse.setMessage("Create/Update Article is " + art.getArticleId());

        return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);

    }





}

class Account1{
    String account_id=null;
    Account1(String account_id){
        this.account_id=account_id;
    }
    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }


}