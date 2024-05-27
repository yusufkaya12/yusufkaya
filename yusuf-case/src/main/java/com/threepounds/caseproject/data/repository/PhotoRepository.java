package com.threepounds.caseproject.data.repository;

import com.threepounds.caseproject.data.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PhotoRepository extends JpaRepository<Photo, String> {
}
