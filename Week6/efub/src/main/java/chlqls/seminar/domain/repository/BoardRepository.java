package chlqls.seminar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import chlqls.seminar.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}