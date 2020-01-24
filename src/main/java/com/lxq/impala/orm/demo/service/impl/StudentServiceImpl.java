package com.lxq.impala.orm.demo.service.impl;

import com.lxq.impala.orm.demo.dao.StudentDao;
import com.lxq.impala.orm.demo.domain.Student;
import com.lxq.impala.orm.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author lixq
 * @since 2019/12/8
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public void add(Student student) {
        studentDao.add(student);
    }

    @Override
    public Student find(String sId) {
        return studentDao.find(sId);
    }
}
