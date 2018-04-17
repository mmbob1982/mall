package com.macro.mall.service;

import com.macro.mall.dto.PmsProductCategoryParam;
import com.macro.mall.model.PmsProductCategory;

import java.util.List;

/**
 * 产品分类Service
 */
public interface PmsProductCategoryService {
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    List<PmsProductCategory> list(Long parentId, Integer pageSize, Integer pageNum);

    int delete(Long id);
}
