package com.mandian.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mandian.common.utils.PageUtils;
import com.mandian.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author mandian
 * @email mandianblog@gmail.com
 * @date 2021-07-03 22:33:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

