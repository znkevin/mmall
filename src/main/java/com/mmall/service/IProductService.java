package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;

public interface IProductService {
    // 保存或更新产品
    ServerResponse SavaOrUpdateProduct(Product product);
    // 设置商品上下架
    ServerResponse<String> SetSaleStatus(Integer productId,Integer productStatus);
    // 获取商品详细信息
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
    // 分页信息
    ServerResponse getProductList(int pageNum, int pageSize);
    //后台产品搜索
    ServerResponse<PageInfo> productSearch(String productName, Integer productId, Integer pageNum, Integer pageSize);
    // 前台查询商品详情页
    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);
    //通过关键字和分类信息查询
    ServerResponse<PageInfo> getProductByKeywordAndCategoryId(String keyWord, Integer categoryId, int pageNum, int pageSize, String orderBy);
}
