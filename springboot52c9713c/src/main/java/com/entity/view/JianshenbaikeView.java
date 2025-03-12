package com.entity.view;

import com.entity.JianshenbaikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 健身百科
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
@TableName("jianshenbaike")
public class JianshenbaikeView  extends JianshenbaikeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenbaikeView(){
	}
 
 	public JianshenbaikeView(JianshenbaikeEntity jianshenbaikeEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenbaikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
