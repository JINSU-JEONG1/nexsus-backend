package com.nexus.backend.api.user.service;

import com.nexus.backend.api.user.dto.UserDto;
import com.nexus.backend.api.user.entity.User;
import com.nexus.backend.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 사용자 서비스
 */
@Service  
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;


}
