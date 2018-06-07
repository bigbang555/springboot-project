package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    /**
     * 查询某个商品
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品列表（分页）
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     *
     * @param cartDTOList
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     *
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
