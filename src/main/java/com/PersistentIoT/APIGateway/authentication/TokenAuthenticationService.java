//package com.PersistentIoT.APIGateway.authentication;
//
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.Jwts;
//import org.springframework.security.core.Authentication;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Date;
//import java.util.Random;
//
///**
// * Created by taqtaq11 on 12.03.17.
// */
//
//public class TokenAuthenticationService {
//
//    static private final String secret = "8E57577A3A663DFB6B6C760AEEB62CC47E6B869E35A312D45D512460DB481BDC";
//    static private final String headerString = "Authorization";
//    static private final String tokenPrefix = "Bearer";
//
//    private final long EXPIRATIONTIME = 1000 * 60 * 60 * 6; // 6 hours
//
//    public void addAuthentication(HttpServletResponse response, String username) {
//        String JWT = Jwts.builder()
//                .setSubject(username)
//                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
//                .signWith(SignatureAlgorithm.HS512, secret)
//                .compact();
//
//        response.addHeader(headerString, tokenPrefix + " " + JWT);
//    }
//
//    public Authentication getAuthentication(HttpServletRequest request) {
//        String token = request.getHeader(headerString);
//        if (token != null) {
//            // parse the token.
//            String username = Jwts.parser()
//                    .setSigningKey(secret)
//                    .parseClaimsJws(token)
//                    .getBody()
//                    .getSubject();
//            if (username != null) // we managed to retrieve a user
//            {
//                return new AuthenticatedUser(username);
//            }
//        }
//        return null;
//    }
//}