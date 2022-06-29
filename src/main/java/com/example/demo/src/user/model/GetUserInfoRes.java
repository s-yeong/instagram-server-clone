package com.example.demo.src.user.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetUserInfoRes {

    private int userIdx;
    private String nickName;
    private String profileImgUrl;
    private String name;
    private String introduction;
    private String website;
    private int postCount;
    private int followerCount;
    private int followingCount;
}
