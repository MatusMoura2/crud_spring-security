package com.matus.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matus.springsecurity.entities.Tweet;

@Repository
public interface TweetReposytory extends JpaRepository<Tweet, Long>{

}
