package com.myaudiolibrary.apirest.repository;

import com.myaudiolibrary.apirest.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Integer> {
    @EntityGraph(attributePaths = "albums")
    Artist findArtistById(Integer id);
    @EntityGraph(attributePaths = "albums")
    Page<Artist> findArtistByNameContaining(String name, Pageable pageable);

    Artist findArtistByName(String name);

}
