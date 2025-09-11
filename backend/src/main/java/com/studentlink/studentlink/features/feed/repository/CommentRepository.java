package com.studentlink.studentlink.features.feed.repository;

import com.studentlink.studentlink.features.feed.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
