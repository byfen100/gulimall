package com.mandian.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mandian.common.utils.PageUtils;
import com.mandian.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-03 22:33:50
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

