package com.example.sql.modules.service.impl;

import com.example.sql.modules.domain.TestUserEntity;
import com.example.sql.modules.repository.TestUserRepo;
import com.example.sql.modules.service.Dto.UserDto;
import com.example.sql.modules.service.Dto.UserQueryCriteria;
import com.example.sql.modules.service.UserService;
import com.example.sql.modules.service.mapper.UserMapper;
import com.example.sql.utils.PageUtil;
import com.example.sql.utils.QueryHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private TestUserRepo userRepo;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Object find(UserQueryCriteria criteria, Pageable pageable) {
        Page<TestUserEntity> page = null;
            page = userRepo.findAll(
                    (root, criteriaQuery, criteriaBuilder) ->
                            QueryHelp.getPredicate(root, criteria, criteriaBuilder), pageable);

        return PageUtil.toPage(page.map(userMapper::toDto));
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(rollbackFor = Exception.class)
    public UserDto create(TestUserEntity resources) {

        return userMapper.toDto(userRepo.save(resources));
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(rollbackFor = Exception.class)
    public void update(TestUserEntity resources) {
        userRepo.saveAndFlush(resources);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        userRepo.deleteById(id);
    }
}
