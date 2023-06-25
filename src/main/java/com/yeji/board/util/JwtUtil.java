package com.yeji.board.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
public class JwtUtil {
	
	// 토큰 생성
	public String createToken(String id, int userSeq) throws UnsupportedEncodingException {
		
		return Jwts.builder().setHeaderParam("alg","HS256").setHeaderParam("typ", "JWT") // 헤더 완료
				.claim("id", id).claim("userSeq", userSeq)
				.setExpiration(new Date(System.currentTimeMillis()+1800000)) // 유효기간 30분
				.signWith(SignatureAlgorithm.HS256, "VISITJAPAN".getBytes("UTF-8")) // 서명 완료
				.compact();
	}
	
	// 유효성 검사
	public Claims valid(String token) throws Exception {
		return Jwts.parser().setSigningKey("VISITJAPAN".getBytes("UTF-8")).parseClaimsJws(token).getBody();
	}

}
