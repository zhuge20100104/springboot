package io.swagger.api;

import io.swagger.model.ResObject;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-12T08:34:19.579Z")

@Controller
public class DemoControllerApiController implements DemoControllerApi {

    private static final Logger log = LoggerFactory.getLogger(DemoControllerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DemoControllerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResObject> createUserUsingPOST(@ApiParam(value = "user" ,required=true )  @Valid @RequestBody User user) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            System.out.println("createUser::"+user);
			ResObject res = new ResObject();
			res.code(HttpStatus.OK.value()).desc("新增成功");
			return new ResponseEntity<ResObject>(res, HttpStatus.OK);
        }

        return new ResponseEntity<ResObject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResObject> deleteUserUsingDELETE(@NotNull @ApiParam(value = "用户标识", required = true) @Valid @RequestParam(value = "userId", required = true) String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            System.out.println("deleteUser::"+userId);
			ResObject res = new ResObject();
			res.code(HttpStatus.OK.value()).desc("删除成功");
			return new ResponseEntity<ResObject>(res, HttpStatus.OK);
        }

        return new ResponseEntity<ResObject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResObject> queryUserUsingGET(@NotNull @ApiParam(value = "用户标识", required = true) @Valid @RequestParam(value = "userId", required = true) String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            ResObject res = new ResObject();
			User user = new User();
			user.setUserId(userId);
			user.setUserName("Fredric");
			user.setEmail("fredric2010@outlook.com");
			user.setPassword("Lily770104");
			res.code(200);
			res.data(user);
			return new ResponseEntity<ResObject>(res, HttpStatus.OK);
        }

        return new ResponseEntity<ResObject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResObject> updateUserUsingPOST(@ApiParam(value = "user" ,required=true )  @Valid @RequestBody User user) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            System.out.println("updateUser::"+user);
			ResObject res = new ResObject();
			res.code(HttpStatus.OK.value()).desc("更新成功");
			return new ResponseEntity<ResObject>(res,  HttpStatus.OK);
        }

        return new ResponseEntity<ResObject>(HttpStatus.NOT_IMPLEMENTED);
    }

}
