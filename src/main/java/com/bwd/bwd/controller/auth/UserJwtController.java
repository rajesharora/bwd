package com.bwd.bwd.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwd.bwd.model.auth.OauthClients;
import com.bwd.bwd.model.auth.UserAccountsAuth;
import com.bwd.bwd.repository.UserAccountsAuthRepo;
import com.bwd.bwd.request.LoginData;
import com.bwd.bwd.request.UserTokenInfo;
import com.bwd.bwd.response.AuthInfo;
import com.bwd.bwd.response.AuthResponse;
import com.bwd.bwd.response.AuthTokenResponse;
import com.bwd.bwd.response.DataResponse;
import com.bwd.bwd.response.StatusResponse;
import com.bwd.bwd.response.TokenResponse;
import com.bwd.bwd.serviceimpl.AuthServiceImpl;
import com.bwd.bwd.serviceimpl.Base64JsonServiceImpl;

@CrossOrigin("*")
@RequestMapping(path = "/token", produces = "application/json")
@RestController
public class UserJwtController {
	
	@GetMapping("/accsstoken")
	public ResponseEntity<TokenResponse> generateBasicToken(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader) {
		ResponseEntity<TokenResponse> entity = null;

//		String[] parts = authorizationHeader.split(" ");
//
//		String tokenType = parts[0];
//
//		if (parts.length == 2 && tokenType.equals("Basic")) {
//
//			String pubicKey = parts[1];
//
//			Base64JsonServiceImpl bjsi = new Base64JsonServiceImpl();
//
//			String jsonObject = bjsi.base64DecodeJson(pubicKey);
//
//			System.out.println(jsonObject);
//
//			OauthClients oc = bjsi.getObject(jsonObject);
//
//			entity = generateToken(oc,"Bearer");
//		}
		return entity;		
	}

}
