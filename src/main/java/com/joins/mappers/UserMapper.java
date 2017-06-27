package com.joins.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by joins on 2017. 6. 27..
 */
@Mapper
public interface UserMapper {

    public String select() throws Exception;

    @Insert("INSERT INTO tbl_test VALUE (now())")
    public void insert();
}
