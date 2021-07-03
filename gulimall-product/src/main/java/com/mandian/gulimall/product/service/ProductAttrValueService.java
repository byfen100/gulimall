package com.mandian.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mandian.common.utils.PageUtils;
import com.mandian.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-03 22:33:50
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

