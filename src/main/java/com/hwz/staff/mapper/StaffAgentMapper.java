package com.hwz.staff.mapper;

import com.hwz.staff.model.StaffAgent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by ZhangZaipeng on 2017/7/3 0003.
 */
@Mapper
public interface StaffAgentMapper {

    StaffAgent selectStaffAgentById(Long staffAgentId);

    List<StaffAgent> selectStaffAgents();
}
