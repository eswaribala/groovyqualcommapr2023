package com.qualcomm.day2sbwebstore.controllers

import com.qualcomm.day2sbwebstore.domains.UserAccount
import com.qualcomm.day2sbwebstore.services.UserAccountService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(
        name = "User Account controller",
        description = "in this controller described documentation"
)
class UserAccountController {
    @Autowired
    UserAccountService userAccountService
    @PostMapping("/useraccounts")
    def ResponseEntity<?> saveUserAccount(@RequestBody UserAccount userAccount){
        UserAccount userObj=this.userAccountService.addUserAccount(userAccount)
        if(userObj!=null){
            return ResponseEntity.status(HttpStatus.OK).body(userObj)
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Not Created")
        }
    }
    @GetMapping("/useraccounts")
    @Operation(
            summary = "Get user by path variable",
            description = "return user entity"
    )
    @ApiResponses([
            @ApiResponse(
                    responseCode = "200",
                    description = "Returns user entity",
                    content = [
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = UserAccount.class)
                            ),
                    ]
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "User not found",
                    content = [@Content]
            )
    ])
    def List<UserAccount> saveUserAccount(){
        return this.userAccountService.getAllUserAccounts()

    }
}
