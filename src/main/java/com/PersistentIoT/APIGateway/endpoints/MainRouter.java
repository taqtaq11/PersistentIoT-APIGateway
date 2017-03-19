package com.PersistentIoT.APIGateway.endpoints;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by taqtaq11 on 05.03.17.
 */

@Api(value = "main", description = "Main Controller")
@RestController
public class MainRouter {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public
    String home() {
        return "Hello Docker World";
    }

    @ApiOperation(value = "Test method")
    @RequestMapping(value = "/test/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String test(
        @PathVariable(required = true)
        @RequestBody
                String id
    ) {
        return "AAAA: " + id;
    }
}
