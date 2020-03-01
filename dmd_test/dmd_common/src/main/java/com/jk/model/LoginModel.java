package com.jk.model;

import java.io.Serializable;

public class LoginModel implements Serializable{

        private static final long serialVersionUID = -8024234474195230596L;
        private Integer userid;
        private String username;
        private String userpass;
        private String mobile;
        private Integer gender;
        private String identity;
        private String email;

        public Integer getUserid() {
            return userid;
        }

        public String getUsername() {
            return username;
        }

        public String getUserpass() {
            return userpass;
        }

        public String getMobile() {
            return mobile;
        }

        public Integer getGender() {
            return gender;
        }

        public String getIdentity() {
            return identity;
        }

        public String getEmail() {
            return email;
        }

        public void setUserid(Integer userid) {
            this.userid = userid;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setUserpass(String userpass) {
            this.userpass = userpass;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setGender(Integer gender) {
            this.gender = gender;
        }

        public void setIdentity(String identity) {
            this.identity = identity;
        }

        public void setEmail(String email) {
            this.email = email;
        }

}
