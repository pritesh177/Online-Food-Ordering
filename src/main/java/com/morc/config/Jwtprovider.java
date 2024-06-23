package com.morc.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.*;

@Service
public class Jwtprovider {
    private SecretKey key= Keys.hmacShaKeyFor(JwtConstant.SERCRET_KEY.getBytes());

    public String generateTokens(Authentication auth){
        Collection<? extends GrantedAuthority> authorities=auth.getAuthorities();
        String roles=populateauthorities(authorities);

        String jwt= Jwts.builder().setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime()+86400000))
                .claim("email",auth.getName())
                .claim("authorities",roles)
                .signWith(key)
                .compact();

        return jwt;
    }

    public String getEmailFromJwtToken(String Jwt) {
        Jwt=Jwt.substring(7);
        Claims claims= Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(Jwt).getBody();

        String email=String.valueOf(claims.get("email"));

        return email;

    }

    private String populateauthorities(Collection<? extends GrantedAuthority> authorities) {
        Set<String> auths=new HashSet<>();

        for(GrantedAuthority authority:authorities){
            auths.add(authority.getAuthority());
        }
        return String.join(",",auths);
    }

}
