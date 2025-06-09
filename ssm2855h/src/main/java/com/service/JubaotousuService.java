package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubaotousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubaotousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubaotousuView;


/**
 * 举报投诉
 *
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
public interface JubaotousuService extends IService<JubaotousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubaotousuVO> selectListVO(Wrapper<JubaotousuEntity> wrapper);
   	
   	JubaotousuVO selectVO(@Param("ew") Wrapper<JubaotousuEntity> wrapper);
   	
   	List<JubaotousuView> selectListView(Wrapper<JubaotousuEntity> wrapper);
   	
   	JubaotousuView selectView(@Param("ew") Wrapper<JubaotousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubaotousuEntity> wrapper);
   	
}

