package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhijiaojiaolianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhijiaojiaolianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhijiaojiaolianView;


/**
 * 执教教练
 *
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
public interface ZhijiaojiaolianService extends IService<ZhijiaojiaolianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhijiaojiaolianVO> selectListVO(Wrapper<ZhijiaojiaolianEntity> wrapper);
   	
   	ZhijiaojiaolianVO selectVO(@Param("ew") Wrapper<ZhijiaojiaolianEntity> wrapper);
   	
   	List<ZhijiaojiaolianView> selectListView(Wrapper<ZhijiaojiaolianEntity> wrapper);
   	
   	ZhijiaojiaolianView selectView(@Param("ew") Wrapper<ZhijiaojiaolianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhijiaojiaolianEntity> wrapper);

   	

}

