package com.PersistentIoT.APIGateway.endpoints;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;

/**
 * Created by taqtaq11 on 12.03.17.
 */

@RestController()
public class UserManagementController {

    @ApiOperation(value = "Authorization method using login and pass. Returns auth token")
    @RequestMapping(
            value = "/authorize",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody
    Map<String, String> authorize(
            @RequestBody Map<String, String> loginAndPass
    ) {
        return loginAndPass;
    }


    @ApiOperation(value = "Lists all users")
    @RequestMapping(
            value = "/users",
            method = RequestMethod.GET
    )
    public @ResponseBody
    String listUsers() {
        return "test response";
    }

    @ApiOperation(value = "Gets user by id")
    @RequestMapping(
            value = "/users/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody
    String getUser(
            @PathVariable String id
    ) {
        throw new NotImplementedException();
    }

    @ApiOperation(value = "Creates new user")
    @RequestMapping(
            value = "/users",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody
    String createUser(
            @RequestBody Map<String, String> user
    ) {
        throw new NotImplementedException();
    }

    @ApiOperation(value = "Deletes user by id")
    @RequestMapping(
            value = "/users/{id}",
            method = RequestMethod.DELETE
    )
    public @ResponseBody
    String deleteUser(
            @PathVariable String id
    ) {
        throw new NotImplementedException();
    }
}
