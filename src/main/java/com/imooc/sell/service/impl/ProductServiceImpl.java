package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.repository.ProductInfoRepository;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        Optional<ProductInfo> optional = repository.findById(productId);
        return optional.isPresent() ? optional.get() : null;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void increaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            Optional<ProductInfo> optional = repository.findById(cartDTO.getProductId());
            if (!optional.isPresent()) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            ProductInfo productInfo = optional.get();
            Integer beforeStock = productInfo.getProductStock();
            Integer afterStock = beforeStock + cartDTO.getProductQuantity();
            productInfo.setProductStock(afterStock);
            repository.save(productInfo);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            Optional<ProductInfo> optional = repository.findById(cartDTO.getProductId());
            if (!optional.isPresent()) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            ProductInfo productInfo = optional.get();
            Integer beforeStock = productInfo.getProductStock();
            Integer afterStock = beforeStock - cartDTO.getProductQuantity();
            if (afterStock < 0) {
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(afterStock);
            repository.save(productInfo);
        }
    }

}
