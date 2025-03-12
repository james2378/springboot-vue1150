package com.entity.view;

import com.entity.ZhijiaojiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 执教教练
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
@TableName("zhijiaojiaolian")
public class ZhijiaojiaolianView  extends ZhijiaojiaolianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhijiaojiaolianView(){
	}
 
 	public ZhijiaojiaolianView(ZhijiaojiaolianEntity zhijiaojiaolianEntity){
 	try {
			BeanUtils.copyProperties(this, zhijiaojiaolianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
