package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwenleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwenleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwenleibieView;


/**
 * 新闻类别
 *
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
public interface XinwenleibieService extends IService<XinwenleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenleibieVO> selectListVO(Wrapper<XinwenleibieEntity> wrapper);
   	
   	XinwenleibieVO selectVO(@Param("ew") Wrapper<XinwenleibieEntity> wrapper);
   	
   	List<XinwenleibieView> selectListView(Wrapper<XinwenleibieEntity> wrapper);
   	
   	XinwenleibieView selectView(@Param("ew") Wrapper<XinwenleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenleibieEntity> wrapper);
   	
}

