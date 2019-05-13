/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ResObject;
import io.swagger.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-12T08:34:19.579Z")

@Api(value = "demoController", description = "the demoController API")
public interface DemoControllerApi {

    @ApiOperation(value = "新增用户", nickname = "createUserUsingPOST", notes = "新增注册", response = ResObject.class, tags={ "demo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResObject.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/demoController/createUser",
        produces = { "*/*" }, 
//        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ResObject> createUserUsingPOST(@ApiParam(value = "user" ,required=true )  @Valid @RequestBody User user);


    @ApiOperation(value = "删除用户", nickname = "deleteUserUsingDELETE", notes = "删除用户", response = ResObject.class, tags={ "demo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResObject.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/demoController/deleteUser",
        produces = { "*/*" }, 
//        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<ResObject> deleteUserUsingDELETE(@NotNull @ApiParam(value = "用户标识", required = true) @Valid @RequestParam(value = "userId", required = true) String userId);


    @ApiOperation(value = "查询用户", nickname = "queryUserUsingGET", notes = "查询用户", response = ResObject.class, tags={ "demo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResObject.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/demoController/queryUser",
        produces = { "*/*" }, 
        //consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ResObject> queryUserUsingGET(@NotNull @ApiParam(value = "用户标识", required = true) @Valid @RequestParam(value = "userId", required = true) String userId);


    @ApiOperation(value = "修改用户", nickname = "updateUserUsingPOST", notes = "修改用户", response = ResObject.class, tags={ "demo-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResObject.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/demoController/updateUser",
        produces = { "*/*" }, 
//        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ResObject> updateUserUsingPOST(@ApiParam(value = "user" ,required=true )  @Valid @RequestBody User user);

}