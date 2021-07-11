package com.mandian.gulimall.member.dao;

import com.mandian.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-04 09:44:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
