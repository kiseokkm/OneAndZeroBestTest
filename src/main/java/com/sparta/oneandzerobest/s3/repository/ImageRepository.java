package com.sparta.oneandzerobest.s3.repository;

import com.sparta.oneandzerobest.s3.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ImageRepository extends JpaRepository<Image,Long> {

    @Query("select max(i.id) from Image i")
    Long findMaxid();
}
