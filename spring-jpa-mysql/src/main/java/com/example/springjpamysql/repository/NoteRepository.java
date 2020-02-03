package com.example.springjpamysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpamysql.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}