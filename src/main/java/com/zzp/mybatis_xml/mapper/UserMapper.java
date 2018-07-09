package com.zzp.mybatis_xml.mapper;

import com.zzp.mybatis_xml.domain.SysUser;

import java.util.List;

public interface UserMapper {
    SysUser selectById(Long id);
    List<SysUser> selectAll();
}
