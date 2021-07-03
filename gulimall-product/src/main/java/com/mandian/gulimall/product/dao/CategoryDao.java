package com.mandian.gulimall.product.dao;

import com.mandian.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-03 22:33:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
