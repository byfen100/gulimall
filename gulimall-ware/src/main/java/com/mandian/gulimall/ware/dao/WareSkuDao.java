package com.mandian.gulimall.ware.dao;

import com.mandian.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-04 09:56:19
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
