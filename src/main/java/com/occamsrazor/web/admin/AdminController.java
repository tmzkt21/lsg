package com.occamsrazor.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Messenger;

@RestController
@RequestMapping("/admins")
public class AdminController {
    //레스트풀

    @Autowired AdminService adminService;

    @PostMapping("")
    public Messenger post(@RequestBody Admin admin) {
        System.out.println("1. AdminController post "+admin);
        adminService.register(admin);
        System.out.println("5. AdminController post ");
        return Messenger.SUCCESS;
    }

    @GetMapping("")
    public List<Admin> list() {
        //adminservice.list();
        return adminService.list();
    }
    @GetMapping("/{employNumber}")
    public Admin detail(@PathVariable String employNumber) {
        //adminservice.detail(employNumber);
        return adminService.findOne(employNumber);
    }
    @PutMapping("{employNumber}")
    public Messenger put(@RequestBody Admin admin) {
        //adminservice.modify(admin);
        return Messenger.SUCCESS;
    }
    @DeleteMapping("/{employNumber}")
    public Messenger delete(@RequestBody Admin admin) {
        adminService.remove(admin);
        return Messenger.SUCCESS;
    }



}