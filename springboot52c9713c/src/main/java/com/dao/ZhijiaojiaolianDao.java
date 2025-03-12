package com.dao;

import com.entity.ZhijiaojiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhijiaojiaolianVO;
import com.entity.view.ZhijiaojiaolianView;


/**
 * 执教教练
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:02:10
 */
public interface ZhijiaojiaolianDao extends BaseMapper<ZhijiaojiaolianEntity> {
	
	List<ZhijiaojiaolianVO> selectListVO(@Param("ew") Wrapper<ZhijiaojiaolianEntity> wrapper);
	
	ZhijiaojiaolianVO selectVO(@Param("ew") Wrapper<ZhijiaojiaolianEntity> wrapper);
	
	List<ZhijiaojiaolianView> selectListView(@Param("ew") Wrapper<ZhijiaojiaolianEntity> wrapper);

	List<ZhijiaojiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<ZhijiaojiaolianEntity> wrapper);

	
	ZhijiaojiaolianView selectView(@Param("ew") Wrapper<ZhijiaojiaolianEntity> wrapper);
	

}
