package com.spring.codebblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.codebblog.model.Post;

public interface CodebblogRepository extends JpaRepository<Post, Long> {

}
