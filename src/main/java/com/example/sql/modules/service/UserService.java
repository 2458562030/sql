package com.example.sql.modules.service;

import com.example.sql.modules.domain.TestUserEntity;
import com.example.sql.modules.service.Dto.UserDto;
import com.example.sql.modules.service.Dto.UserQueryCriteria;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;

@CacheConfig(cacheNames = "user")
public interface UserService {

    @Cacheable(key = "#p0")
    Object find(UserQueryCriteria criteria, Pageable pageable);


    /**
     * create
     * @param resources
     * @return
     */
    @CacheEvict(allEntries = true)
    UserDto create(TestUserEntity resources);

    /**
     * update
     * @param resources
     */
    @CacheEvict(allEntries = true)
    void update(TestUserEntity resources);

    /**
     * delete
     * @param id
     */
    @CacheEvict(allEntries = true)
    void delete(Long id);

}
