package com.zmy.gmall.pms.vo;


import com.zmy.gmall.pms.entity.ProductCategory;
import lombok.Data;

import java.util.List;

/**
 */
@Data
public class PmsProductCategoryWithChildrenItem extends ProductCategory {
    private List<ProductCategory> children;

}
