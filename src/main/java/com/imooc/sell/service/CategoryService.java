package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    /**
     * 查询某个类目
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有类目
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 通过商品类别查询类目
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 保存商品类目
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
