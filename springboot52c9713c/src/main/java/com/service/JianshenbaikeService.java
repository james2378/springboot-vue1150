package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenbaikeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenbaikeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenbaikeView;


/**
 * 健身百科
 *
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
public interface JianshenbaikeService extends IService<JianshenbaikeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenbaikeVO> selectListVO(Wrapper<JianshenbaikeEntity> wrapper);
   	
   	JianshenbaikeVO selectVO(@Param("ew") Wrapper<JianshenbaikeEntity> wrapper);
   	
   	List<JianshenbaikeView> selectListView(Wrapper<JianshenbaikeEntity> wrapper);
   	
   	JianshenbaikeView selectView(@Param("ew") Wrapper<JianshenbaikeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenbaikeEntity> wrapper);

   	

}

