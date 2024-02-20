package com.bwd.bwd.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserTokenInfo {
	private String password;	
	private String username; 
	private String userToken;	
	private String refreshToken; 	
}