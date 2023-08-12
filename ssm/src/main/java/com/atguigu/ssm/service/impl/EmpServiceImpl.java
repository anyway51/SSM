package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.EmpMapper;
import com.atguigu.ssm.pojo.Emp;
import com.atguigu.ssm.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: EmpServiceImpl
 * Package: com.atguigu.ssm.service.impl
 * Description:
 *
 * @Auther: kk
 * @Creat: 2023/8/8 - 9:31
 * @Version: v1.0
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> getAllEmp() {

        return empMapper.getAllEmp();
    }

    @Override
    public PageInfo<Emp> getEmpPage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 4);
        //查询所有的员工信息
        List<Emp> list = empMapper.getAllEmp();
        //获取分页相关数据
        PageInfo<Emp> page = new PageInfo<>(list, 3);
        return page;
    }
}
