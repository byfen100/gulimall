package com.mandian.gulimall.order.dao;

import com.mandian.gulimall.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-04 09:51:31
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}
