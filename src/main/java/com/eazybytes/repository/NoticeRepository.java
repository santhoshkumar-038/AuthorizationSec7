package com.eazybytes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eazybytes.Entity.Notice;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Integer> {

	@Query(value = "from Notice where CURDATE() BETWEEN noticeBegDt AND noticeEndDt")
	List<Notice> findAllActiveNotices();
	
}
