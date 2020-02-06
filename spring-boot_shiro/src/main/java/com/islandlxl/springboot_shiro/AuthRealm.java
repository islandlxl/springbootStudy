package com.islandlxl.springboot_shiro;

import com.islandlxl.springboot_shiro.model.Permission;
import com.islandlxl.springboot_shiro.model.Role;
import com.islandlxl.springboot_shiro.model.User;
import com.islandlxl.springboot_shiro.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
@project:com.islandlxl.springboot_shiro.services
@Title:AuthRealm
@Auther:lxl
@create:2019/1/25,15:02
*/public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user = (User)principals.fromRealm(this.getClass().getName()).iterator().next();

        List<String> permissionList = new ArrayList<>();

        List<String> roleNameList=new ArrayList<>();
        Set<Role> roleSet = user.getRoles();

        if (CollectionUtils.isEmpty(roleSet)){
            for (Role role:roleSet) {
                roleNameList.add(role.getRname());
                Set<Permission> permissionSet = role.getPermissions();

              if (CollectionUtils.isEmpty(permissionList)){
                  for (Permission permission:permissionSet) {
                      permissionList.add(permission.getName());

                  }
              }

            }
        }
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionList);
        info.addRoles(roleNameList);

        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken usernamePasswordToken=(UsernamePasswordToken)token;
        String username = usernamePasswordToken.getUsername();
        User user = userService.findByUsername(username);

        return new SimpleAuthenticationInfo(user,user.getPassword(),this.getClass().getName());
    }
}
