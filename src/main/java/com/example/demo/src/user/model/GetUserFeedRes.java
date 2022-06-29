package com.example.demo.src.user.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GetUserFeedRes {

//    유저 피드 - 유저 프로필, 유저의 게시물 리스트
    private boolean _isMyFeed;
    private GetUserInfoRes getuserInfoRes;
    private List<GetUserPostsRes> getUserPosts;

}
