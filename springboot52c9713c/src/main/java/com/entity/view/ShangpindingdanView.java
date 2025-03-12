package com.entity.view;

import com.entity.ShangpindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 商品订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
@TableName("shangpindingdan")
public class ShangpindingdanView  extends ShangpindingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpindingdanView(){
	}
 
 	public ShangpindingdanView(ShangpindingdanEntity shangpindingdanEntity){
 	try {
			BeanUtils.copyProperties(this, shangpindingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
