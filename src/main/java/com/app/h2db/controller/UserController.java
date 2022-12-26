package com.app.h2db.controller;

import com.app.h2db.model.Account;
import com.app.h2db.model.AppResponse;
import com.app.h2db.model.User;
import com.app.h2db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user/save")
    @ResponseBody
    public ResponseEntity<AppResponse> saveArticle(@RequestBody User user) {
        System.out.println("getUser_id Title " + user.getUsername());

        userService.saveUser(user);
       // System.out.println("After Successfully save id is " + art.getArticleId());

        AppResponse appResponse = new AppResponse();
        //appResponse.setArticleId(art.getArticleId());
        //appResponse.setStatusCode(HttpStatus.OK.name());
        //appResponse.setMessage("Create/Update Article is " + art.getArticleId());

        return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);

    }

    //https://api.getpinwheel.com/v1/accounts/{account_id}/direct_deposit_allocations
    @GetMapping("v1/accounts/{account_id}/direct_deposit_allocations")
    public ResponseEntity<Account>  allocation(@PathParam("account_id") String account_id){

        System.out.println("allocation >>>>>>>>>>>>>>.."+account_id);
        //List<Account> aa=
        //accountService.getAllAccounts();
        Account account=new Account();
        account.setPwAccountId("12345");
        account.setAccountType("SAving");
        account.setLinkTokenId("testLinked");
        ResponseEntity<Account> response=new ResponseEntity<Account>(account,HttpStatus.OK);
        return response;

    }

}
