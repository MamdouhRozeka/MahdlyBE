package com.mahdlyBE.mahdly.repository;

import com.mahdlyBE.mahdly.data.model.Post;
import com.mahdlyBE.mahdly.data.model.University;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    @Query("select p from Post p")
    public List<Post> findAllPosts();

    @Query("select p from Post p where p.id  = :id")
    public Post findPost( @Param("id") Long  id);
}
