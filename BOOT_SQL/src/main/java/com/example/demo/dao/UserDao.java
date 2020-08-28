package com.example.demo.dao;

import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
        public List<UserEntity> findall();
}
