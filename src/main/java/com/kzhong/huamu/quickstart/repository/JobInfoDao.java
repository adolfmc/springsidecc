package com.kzhong.huamu.quickstart.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kzhong.huamu.quickstart.entity.JobInfo;

public interface JobInfoDao extends JpaRepository<JobInfo, Long> {

	Page<JobInfo> findByJobxz(String titile, Pageable pageable);
}
