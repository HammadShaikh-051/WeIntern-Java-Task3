package com.weintern.spring_boot_rest_api.repository;

import com.weintern.spring_boot_rest_api.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // Custom query to instantly fetch posts belonging to a specific user
    List<Post> findByUserId(Long userId);
}