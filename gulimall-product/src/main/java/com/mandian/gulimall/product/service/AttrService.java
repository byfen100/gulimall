package com.mandian.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mandian.common.utils.PageUtils;
import com.mandian.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-03 22:33:51
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

