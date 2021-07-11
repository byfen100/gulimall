package com.mandian.gulimall.coupon.dao;

import com.mandian.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-04 09:25:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
