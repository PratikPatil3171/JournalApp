package com.pratik.journalApp.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled
@SpringBootTest
public class UserServicetests {
    @Autowired
    private UserService userService;

    @Test
public void  testFindbyUsername(){
        Assertions.assertNotNull(userService.findByUserName("admin"));

}
@ParameterizedTest
@CsvSource({
        "pratik2006@gmail.com",
        "parth2011@gmail.com"
})
    public void  testFindbyEmail(String email){
        Assertions.assertNotNull(userService.findByUserName(email));
}


}


