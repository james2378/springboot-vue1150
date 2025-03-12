package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianshenshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianshenshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianshenshangpinView;


/**
 * 健身商品评论表
 *
 * @author 
 * @email 
 * @date 2024-03-05 17:02:11
 */
public interface DiscussjianshenshangpinService extends IService<DiscussjianshenshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianshenshangpinVO> selectListVO(Wrapper<DiscussjianshenshangpinEntity> wrapper);
   	
   	DiscussjianshenshangpinVO selectVO(@Param("ew") Wrapper<DiscussjianshenshangpinEntity> wrapper);
   	
   	List<DiscussjianshenshangpinView> selectListView(Wrapper<DiscussjianshenshangpinEntity> wrapper);
   	
   	DiscussjianshenshangpinView selectView(@Param("ew") Wrapper<DiscussjianshenshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianshenshangpinEntity> wrapper);

   	

}

