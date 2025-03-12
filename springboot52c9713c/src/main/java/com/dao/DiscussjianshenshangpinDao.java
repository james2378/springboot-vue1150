package com.dao;

import com.entity.DiscussjianshenshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianshenshangpinVO;
import com.entity.view.DiscussjianshenshangpinView;


/**
 * 健身商品评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:02:11
 */
public interface DiscussjianshenshangpinDao extends BaseMapper<DiscussjianshenshangpinEntity> {
	
	List<DiscussjianshenshangpinVO> selectListVO(@Param("ew") Wrapper<DiscussjianshenshangpinEntity> wrapper);
	
	DiscussjianshenshangpinVO selectVO(@Param("ew") Wrapper<DiscussjianshenshangpinEntity> wrapper);
	
	List<DiscussjianshenshangpinView> selectListView(@Param("ew") Wrapper<DiscussjianshenshangpinEntity> wrapper);

	List<DiscussjianshenshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianshenshangpinEntity> wrapper);

	
	DiscussjianshenshangpinView selectView(@Param("ew") Wrapper<DiscussjianshenshangpinEntity> wrapper);
	

}
